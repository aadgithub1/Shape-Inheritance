// Chooser.java
// Aug 23 2024
// Aaron D. Webb
// Chooser.java represents a scanner object which also
// performs input validation based on the desired data type. GetChoice()
// ensure the user enters a String, getDoubleChoice() ensures a double
// value is entered, getIntChoice() ensures an int value is entered.
// All of the above methods loop continually until the user's input
// is of the appropriate type. 

import java.util.Scanner;

public class Chooser {
    Scanner in = new Scanner(System.in);

    public Chooser(){
    }
    //returns user input String
    public String getChoice(){
        return in.nextLine();
    }
    //ensure user input is of type int and returns it
    public int getIntChoice(){
        while (true){
            try{
                return Integer.parseInt(in.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Invalid input: Please enter integers only.");
            }
        }
    }
    //ensure user input is of type double and returns it
    public double getDoubleChoice(){
        while (true){
            try{
                return Double.parseDouble(in.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Invalid input: Please enter double/decimal values or integers only.");
            }
        }
    }

}
