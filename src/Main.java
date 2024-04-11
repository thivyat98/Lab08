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
      static int sumOfLinkedList(SingleLinkedList list) {
         Node current = list.head;
         int sum = 0;
         while (current != num) {
             sum += current.data;
             current = current.next;
         }
         return sum;
      }
      static SingleLinkedList getPrimesWithDigit3( int n){
         SingleLinkedList primeList = new SingleLinkedList();
         SingleLinkedList primesWithDigit3List = new SingleLinkedList();

         for(int i = 2; i <= n; i++){
             if(isPrime(i)){
                 primeList.insert(i);
                 if (String.valueOf(i).contains("3")) {
                     primesWithDigit3List.insert(i);
                 }

             }

          }
         return primesWithDigit3List;
      }

  }


public class Main {
    public static void main(String[] args) {
        int n = 1000;
        SingleLinkedList primesWithDigit3List = SingleLinkedList.getPrimesWithDigit3(n);
        int sum = sumOfLinkedList(primesWithDigit3List);
        System.out.println("Sum of prime numbers with digit 3 between 0 and " + n + " is: " + sum);
    }
}