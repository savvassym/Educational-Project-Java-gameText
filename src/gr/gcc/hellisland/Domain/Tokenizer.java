package gr.gcc.hellisland.Domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tokenizer {

//    private static final List<String> validCommands = Arrays.asList("move","use","pick","drop","attack");
//    private static final List<String> validDirec = Arrays.asList("left","right","up","down");
    //private String[] token = new String[2];

    public String[] getToken(String input) {
        String [] token = new String[2];
        String newStr = input.toLowerCase();
        token = newStr.split(" ");
        return token;
    }






    //TODO: Must fix the tokenizer to not send null and wrong inputs!..
}
