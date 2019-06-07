package gr.gcc.hellisland.Input;



import java.util.Scanner;

public class UserInput {

    private Scanner sc = new Scanner(System.in);


    public String getInput() {
        return sc.nextLine();
    }

}
