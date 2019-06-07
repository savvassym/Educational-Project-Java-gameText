package gr.gcc.hellisland.Input;


import gr.gcc.hellisland.Tokenizer.Tokenizer;

import java.util.Arrays;
import java.util.List;

import static gr.gcc.hellisland.Parser.Parser.registry;

public class InputChecker {
    private static final List<String> validCommands = Arrays.asList("use","move","pick","drop","attack");
    private static final List<String> validDirect = Arrays.asList("left","right","up","down");
    private static final List<String> validItems = Arrays.asList("ball","key1","sword","axe","apple","key2","key3","key4");

    public boolean isChecked(String input) {
        Tokenizer tk = new Tokenizer();
        String[] tokens;
        tokens = tk.getToken(input);

        if(tokens.length==2) {
            if (validCommands.contains(tokens[0]) && validDirect.contains(tokens[1])) {
                return true;
            } else if (validCommands.contains(tokens[0]) && validItems.contains(tokens[1]) && registry.containsKey(tokens[1])) {
                return true;
            }
        }
        else {
            return false;
        }
        return false;
    }

}
