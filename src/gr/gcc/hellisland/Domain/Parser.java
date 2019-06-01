package gr.gcc.hellisland.Domain;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.StringTokenizer;

public class Parser {
    private static final Map<String,Item> registry = new HashMap<>();

    public Command parser(String input){
        Command command;
        String[] tokens;
        Tokenizer token = new Tokenizer();
        tokens = token.getToken(input);

        if(tokens[0].equalsIgnoreCase("move")){
            command = new GoCommand(Direction.valueOf(tokens[1].toLowerCase()));
        }
        else if(tokens[0].equalsIgnoreCase("use")){
            String item = tokens[1];
            command = new UseCommand(new Key(1));
        }
        else {
            command = null;
        }
        return command;
    }



    public Parser(){
    }

}



