package OOPS;

public class Main {
    
    public static void main(String[] args){

    }

}

class Game{
    int score;
    // Default constructor
    Game(){
       score = 0;
    }
    // Constructor by starting score value
    Game(int startingScore){
       score = startingScore;
    }
 }

 class Contact{
    String name;
    String email;
    String phoneNumber;
 }

 class ContactsManager {
    // Fields:
    Contact [] myFriends;
    int friendsCount;
    // Constructor:
    ContactsManager(){
       this.friendsCount = 0;
       this.myFriends = new Contact[500];
    }

    void addContact(Contact contact){
        myFriends[friendsCount] = contact;
        friendsCount++;
     }

    Contact searchContact(String searchName){
        for(int i=0; i<friendsCount; i++){
           if(myFriends[i].name.equals(searchName)){
              return myFriends[i];
           }
        }
        return null;
    }
 }


