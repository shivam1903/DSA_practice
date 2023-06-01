import java.util.*;

public class Stack_Print5thelement {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        printFifthElementFromEnd(stack);
    }

    // Method to print the fifth element from the top of the stack
    static void printFifthElementFromEnd(Stack<Integer> stack) {
        // Write your code here
        int counter = 1;
        while (!(stack.empty())){
            if(counter == 5){
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
