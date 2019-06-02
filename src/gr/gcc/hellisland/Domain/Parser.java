package gr.gcc.hellisland.Domain;
import java.util.*;

public class Parser {
    private static final Map<String,Item> registry = new HashMap<>();
    private static final List<String> validDirections = Arrays.asList("left","right","up","down");

    public Command parser(String input){
        Command command;
        String[] tokens;
        Tokenizer token = new Tokenizer();
        tokens = token.getToken(input);

        if(tokens[0].equalsIgnoreCase("move") && validDirections.contains(tokens[1])){
            return new GoCommand(Direction.valueOf(tokens[1]));
        }
        else if(tokens[0].equalsIgnoreCase("use")&&registry.containsKey(tokens[1])){
            return new UseCommand(registry.get(tokens[1]));
        }
        else {
            return new UnknownCommand(tokens[0]+tokens[1]);
        }
    }



    public Parser(){
        registry.put("key",new Key());
    }



}



