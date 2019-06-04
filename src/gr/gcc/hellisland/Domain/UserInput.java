package gr.gcc.hellisland.Domain;

import java.util.Scanner;
import gr.gcc.hellisland.Domain.UI;
public class UserInput {

    private String input;
    private Scanner sc = new Scanner(System.in);


    public String getInput() {
        input=sc.nextLine();
        return input;
    }
}

