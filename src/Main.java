import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }

}
  class SingleLinkedList {
     Node head;

     SingleLinkedList(){
         this.head = null;
     }

     void insert(int data) {
         Node newNode = new Node(data);
         if(head == null) {
             head = newNode;
         } else {
             Node temp = head;
             while (temp.next != null) {
                 temp = temp.next;
             }
             temp.next = newNode;
         }

      }
  }


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}