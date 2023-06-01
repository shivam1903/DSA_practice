import java.util.*;

public class LinkedList_deletelast {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int n) {
            data = n;
            next = null;
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        head = null;
        if (n > 0) {
            head = new Node(s.nextInt());
            Node temp = head;
            for (int i = 1; i < n; i++) {
                temp.next = new Node(s.nextInt());
                temp = temp.next;
            }
        }
        deleteLastNode();
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    // Method to delete the first node of the LinkedList
    static void deleteLastNode() {
        // Write your code here
  
        if (head.next == null) {
            head = null;
        }
        if(head != null){
            Node n1 = head;
            while(n1.next.next != null){
                n1 = n1.next;
                
            }
                n1.next = null;
        }
        
    }
}
