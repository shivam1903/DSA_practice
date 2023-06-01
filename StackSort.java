import java.util.*;

public class StackSort {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
       sort(stack);
    }

    // Method to sort the elements of the stack in ascending order
    static void sort(Stack<Integer> stack) {
        // Write your code here

        Stack<Integer> s1 = new Stack<Integer>();

        while(!(stack.empty())){

            int a = stack.pop();
            
            if(s1.empty()){
                s1.push(a);
            }
            else{
                while((!(s1.empty())) && (s1.peek() >= a) ){
                    stack.push(s1.pop());
                }
                s1.push(a);
            }

        }

        System.out.println(s1);
    }
}