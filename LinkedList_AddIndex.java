import java.util.*;

public class LinkedList_AddIndex {
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
        int k = s.nextInt();
        int index = s.nextInt();
        addAtGivenIndex(k, index);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    // Method to add the element at the front of the LinkedList
    static void addAtGivenIndex(int k, int index) {
        Node n1 = head;
        int ind = 0;
        
        while (n1.next != null){
            if(ind == index-1){
                Node n2 = new Node(k);
                n2.next = n1.next;
                n1.next = n2;
                
            }
            n1 = n1.next;
            ind++;
        }
        if(index > ind){
            Node n2 = new Node(k);
            n1.next = n2;
        }
        // Write your code here
    }
}

