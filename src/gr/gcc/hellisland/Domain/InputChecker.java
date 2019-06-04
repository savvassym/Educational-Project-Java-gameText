package gr.gcc.hellisland.Domain;

import java.util.Arrays;
import java.util.List;

public class InputChecker {
    private String inputCheck;
    private UserInput userInput;
    private static final List<String> validCommands = Arrays.asList("move","use","pick","drop","attack");
    private static final List<String> validDirec = Arrays.asList("left","right","up","down");


    public boolean isChecked(String input){
        Tokenizer tk = new Tokenizer();
        String[] tokens;
        tokens = tk.getToken(input);
        if(validCommands.contains(tokens[0]) && validDirec.contains(tokens[1])){
            return true;
        }
        else {
            return false;
        }
    }



}
