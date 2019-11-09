package minichallenge1;

import java.util.Scanner;

public class MiniChallenge1 {

   //Main method - the entry point of the program
    public static void main(String[] args) {

        //Calls the myName method, and passes getFirst and getLast as parmeters
        myName(getFirst(),getLast());
            
    }
    //myName method - concatenates the strings passed in as parameters
    public static void myName(String firstName, String lastName) {
        
        System.out.println("Your Name is: " + firstName + " " +lastName +".");
        
    }
    //getFirst method - asks for user input of the first name and returns this
    public static String getFirst () {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first name:");
        String firstName = sc.nextLine();
        return firstName;
        
    }
    //getLast method - asks for user input of the last name and returns this
    public static String getLast () {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your last name:");
        String lastName = sc.nextLine();
        return lastName;
        
    }
    
}
