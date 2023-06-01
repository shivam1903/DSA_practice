import java.util.Scanner;

class digitsum_recursion{
 public static int sum(int n) {
    //write the logic here
    if (n<10){
        return n;
    }
    else{
        String s=String.valueOf(n);
        int power = s.length() - 1;
        int pow_val = (int)(Math.pow(10, power));
        int remainder = n%pow_val;
        int quotient = n/pow_val;
        return quotient + sum(remainder); 
    }
   }
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int num = sc.nextInt();
    System.out.println(sum(num));
   } 
}
