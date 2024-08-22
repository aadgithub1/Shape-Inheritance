import java.util.Scanner;

public class Chooser {
    Scanner in = new Scanner(System.in);

    public Chooser(){
    }

    public String getChoice(){
        return in.nextLine();
    }

    public int getIntChoice(){
        while (true){
            try{
                return Integer.parseInt(in.nextLine());
            } catch (NumberFormatException e){
                System.out.println("ERROR\nPlease input correct data type.");
            }
        }
    }

    public double getDoubleChoice(){
        while (true){
            try{
                return Double.parseDouble(in.nextLine());
            } catch (NumberFormatException e){
                System.out.println("ERROR\nPlease input correct data type.");
            }
        }
    }

}
