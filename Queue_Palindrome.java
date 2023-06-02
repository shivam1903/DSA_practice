import java.util. *;

class Queue_Palindrome {

    public void checkPalindrome(String input) {
        Queue<Character> q = new LinkedList<>();
        int size = input.length();
        if (size == 0) {
            System
                .out
                .println("The given input is a palindrome.");
        } else {
            for (int i = size - 1; i >= 0; i--) {
                q.add(input.charAt(i));
            }
            String rev = "";
            while (q.size() > 0) {
                rev = rev + q.remove();
            }
            if (input.equals(rev)) {
                System
                    .out
                    .println("The given input is a palindrome.");
            } else {
                System
                    .out
                    .println("The given input is not a palindrome.");
            }
        }
        //Write your code here
    }
    public static void main(String[] args) {
        Queue_Palindrome obj = new Queue_Palindrome();
        Scanner in = new Scanner(System. in);
        String inputString = in.nextLine();
        obj.checkPalindrome(inputString);

    }
}
