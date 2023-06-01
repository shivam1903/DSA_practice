import java.util.Scanner;

class Palindrome_num_list_recursion {
   public static boolean palindrome(int[] num, int index) {
   //write the logic here  
   int len_list = num.length;
   if(index <= len_list/2){
       boolean res = false;
       if(num[index] == num[len_list-1-index]){
           res = true;
       }
       return res && palindrome(num, index+1);
   }
   return true;
  }

   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int num[] = new int[5];
       for(int i=0; i< 5;i++)
           num[i]=sc.nextInt();
       boolean answer =palindrome(num, 0);
       System.out.println(answer);
   }
}
