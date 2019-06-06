package gr.gcc.hellisland.Parser;

import gr.gcc.hellisland.Commands.Command;
import gr.gcc.hellisland.Commands.GoCommand;
import gr.gcc.hellisland.Commands.UnknownCommand;
import gr.gcc.hellisland.Commands.UseCommand;
import gr.gcc.hellisland.Domain.Direction;
import gr.gcc.hellisland.Item.Food;
import gr.gcc.hellisland.Item.Item;
import gr.gcc.hellisland.Item.Key;
import gr.gcc.hellisland.Tokenizer.Tokenizer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Parser {
    public static final Map<String, Item> registry = new HashMap<>();


    public Command parser(String input) {
        Command command;
        String[] tokens;
        Tokenizer tk = new Tokenizer();
        tokens = tk.getToken(input);


        if(tokens[0].equalsIgnoreCase("move")){
            return new GoCommand(Direction.valueOf(tokens[1]));
        }
        if (tokens[0].equalsIgnoreCase("use")) {
            return new UseCommand(registry.get(tokens[1]));
        }

        return new UnknownCommand(tokens[0]+" "+tokens[1]);
    }

    public Parser(){
        registry.put("key1",new Key(1));
        registry.put("key2",new Key(2));
        registry.put("key3",new Key(3));
        registry.put("key4",new Key(4));
        registry.put("apple",new Food("apple",10,true,true));
    }



}


