package gr.gcc.hellisland.Domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tokenizer {

//    private List<String> availableCommands = Arrays.asList("move","use","drop","pick");
//    private List<String> availableDirections = Arrays.asList("left","right","up","down");
    private String[] token = new String[2];

    public String[] getToken(String input) {
        String newstr = input.toLowerCase();
        token = newstr.split(" ");
        return token;
    }


    //TODO: Must fix the tokenizer to not send null and wrong inputs!..
}
