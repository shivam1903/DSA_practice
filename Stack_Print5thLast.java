import java.util.*;

public class Stack_Print5thLast {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        printFifthElementFromStart(stack);
    }

    // Method to print the fifth element from the bottom of the stack
    static void printFifthElementFromStart(Stack<Integer> stack) {
        // Write your code here
        int size = stack.size();
        int counter = 1;
        while (!(stack.empty())){
            if(counter == size - 4){
                System.out.println(stack.pop());
            }
            stack.pop();
            counter++;
        }
        if(counter <=5){
            System.out.println("There are not enough elements in the stack");
        }
    }
}