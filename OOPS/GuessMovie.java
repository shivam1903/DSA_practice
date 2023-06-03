package OOPS;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class GuessMovie {
    
    public static void main(String[] args) throws FileNotFoundException{

        File file = new File("OOPS/movies_name.txt");
        Scanner sc = new Scanner(file);
        int tot_movies = 0;
        ArrayList<String> movie_list = new ArrayList<String>();

        while(sc.hasNextLine()){
            String line = sc.nextLine();
            movie_list.add(line);
            tot_movies++;
            // System.out.println(line);
        }
        System.out.println(tot_movies);
        String[] without_spaces = new String[tot_movies];
        for(int i =0; i<tot_movies; i++){
            String[] arr = movie_list.get(i).split(" ");
            String Movie_name = "";
            for(int j = 0; j < arr.length; j++){
                Movie_name = Movie_name + arr[j];
            }
            without_spaces[i] = Movie_name;
        }

        // for(int i =0; i<tot_movies; i++){
        //     System.out.println(without_spaces[i]);
        // }

        int random = (int)(Math.random() * 25 + 1);
        
        String selected_movie = without_spaces[random - 1];

        int loss = 0;
        Scanner sc_inp = new Scanner(System.in);

        char[] movie_array = selected_movie.toCharArray();
        char[] guessed_till_now = new char[movie_array.length];
        for(int i =0; i<movie_array.length; i++){
            guessed_till_now[i] = '_'; 
        }

        System.out.println("Welcome to the Movie Guessing game.\nWe have a movie in our system and you need to guess its name.\nWe will tell you the number of alphabets it has excluding the space.\nAt one point you can guess 1 letter, if it exists in the movie we will mark it on the correct position.\nYou will get -1 points for every wrong guess, once you have -10 points the game will end and you will lsoe.");
        System.out.println("The number of letters in the movie are: " + movie_array.length);
        System.out.println("Lets begin!!!");

        while(loss < 10){
            String mov = "";
            for(int i = 0; i<guessed_till_now.length; i++){
                mov = mov + guessed_till_now[i];
            }
            if(mov.equals(selected_movie)){
                System.out.println("Congratulations!! You guessed it right, the movie is " + selected_movie);
                break;
            }
            else{
                System.out.println("Great going keep guessing");
                System.out.println("Guesses till now ");
                System.out.println(mov);
            }
            System.out.println("Enter the letter you think is in the movie");
            char c1 = sc_inp.nextLine().charAt(0);
            boolean match = false;
            for(int i =0; i<movie_array.length; i++){
                if(c1 == movie_array[i]){
                    match = true;
                    guessed_till_now[i] = movie_array[i];
                }
            }
            if(match == false){
                loss++;
                System.out.println("This letter is not in the movie, you lost 1 point. Till now you have lost " + loss + " points");
            }

        }

        if(loss == 10){
            System.out.println("Well tried!\nThe movie name is " + selected_movie);
        }
        
        sc.close();
        sc_inp.close();
    }
}
