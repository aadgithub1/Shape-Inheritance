import java.util.Scanner;

public class Chooser {
    Scanner in = new Scanner(System.in);

    public Chooser(){
    }

    public String getChoice(){
        return in.nextLine();
    }

}
