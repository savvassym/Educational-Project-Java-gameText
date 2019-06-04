package gr.gcc.hellisland.Parser;
import gr.gcc.hellisland.Commands.Command;
import gr.gcc.hellisland.Commands.GoCommand;
import gr.gcc.hellisland.Commands.UnknownCommand;
import gr.gcc.hellisland.Commands.UseCommand;
import gr.gcc.hellisland.Domain.Direction;
import gr.gcc.hellisland.Item.Item;
import gr.gcc.hellisland.Item.Key;
import gr.gcc.hellisland.Tokenizer.Tokenizer;
import java.util.*;

public class Parser {
    private static final Map<String, Item> registry = new HashMap<>();

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



