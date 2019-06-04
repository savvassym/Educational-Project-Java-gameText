package gr.gcc.hellisland.Input;

import java.util.Scanner;

public class UserInput {

    private String input;
    private Scanner sc = new Scanner(System.in);


    public String getInput() {
        input=sc.nextLine();
        return input;
    }
}

