import java.util.Scanner;
import java.util.*;

public class Stack_reverseString{
    public static void main(String arg[]) {
        Stack<Character> s = new Stack<Character>();
        Scanner in = new Scanner(System.in);
        String data = in.nextLine();
        int size = data.length();
        if(size>0){
        for(int i = 0; i<size; i++){
            s.push(data.charAt(i));
        }
        String fin = "";
        while(!(s.empty())){
            fin = fin + s.pop();
        }
        System.out.println(fin);
        //write your code here
        }
        else{
            System.out.println("");
        }

    }
}

