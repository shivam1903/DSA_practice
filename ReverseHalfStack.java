import java.util.*;

public class ReverseHalfStack {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        reverseSecondHalf(stack);
    }

    // Method to reverse the last half of the elements from the bottom of the stack
    static void reverseSecondHalf(Stack<Integer> stack) {
        // Write your code here
        int size = stack.size();
        int mid = size/2;
        int[] arr = new int[mid];
        for(int i =0; i<mid; i++){
            arr[i] = stack.pop();
        }    
        for(int i = 0; i<mid; i++){
            stack.push(arr[i]);
        }
        System.out.println(stack);



    }
}