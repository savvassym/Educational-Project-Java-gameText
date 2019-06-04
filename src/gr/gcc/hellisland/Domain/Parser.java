package gr.gcc.hellisland.Domain;
import java.util.*;

public class Parser {
    private static final Map<String,Item> registry = new HashMap<>();

    public Command parser(String input) {
        Command command;
        String[] tokens;
        Tokenizer token = new Tokenizer();
        tokens = token.getToken(input);

        if(tokens[0].equalsIgnoreCase("move")){
            return new GoCommand(Direction.valueOf(tokens[1]));
        }
        else if(tokens[0].equalsIgnoreCase("use")){
            return new UseCommand(registry.get(tokens[1]));
        }
        else {
            return new UnknownCommand(tokens[0]+" "+tokens[1]);
        }
    }

    public Parser(){
        registry.put("key",new Key());
    }



}



