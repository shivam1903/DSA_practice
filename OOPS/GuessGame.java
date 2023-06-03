package OOPS;

import java.util.Scanner;


public class GuessGame {
    
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int Random_Num = (int) (Math.random() * 100);
        Boolean guessed = false;
        System.out.println("Welcome to the guessing game");
        System.out.println("You will get 10 chances to guess the number between 1 and 100");

        for(int i = 0; i<10; i++){
            System.out.println("Enter your guess");
            int guess = sc.nextInt();

            if(guess > Random_Num){
                System.out.println("The number is less than " + guess);
            }
            else if(guess < Random_Num){
                System.out.println("The number is greater than " + guess);
            }
            else{
                guessed = true;
                break;
            }
        
        }

        if(guessed == true){
            System.out.println("Congratulations you guessed the right number");
        }
        else{
            System.out.println("Sorry, you lost. Better luck next time");
            System.out.println("The number was " + Random_Num);

        }


        sc.close();
    }
    


}
