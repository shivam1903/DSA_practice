import java.util.*;

public class Queue_removeElement {
    public static void main(String args[]) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            queue.add(s.nextInt());
        printFifthElementFromStart(queue);
    }

    // Method to print the fifth element from the head of the queue
    static void printFifthElementFromStart(Queue<Integer> queue) {
        // Write your code here
        int counter = 1;
        while(queue.size() != 0){
            if(counter == 5){
                System.out.println(queue.remove());
                counter++;
                break;
            }
            queue.remove();
            counter++;
        }
        if(counter <= 5){
            System.out.println("There are not enough elements in the queue");
        }
    }
}