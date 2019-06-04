package gr.gcc.hellisland.Tokenizer;

public class Tokenizer {

    public String[] getToken(String input) {
        String [] token;
        String newStr = input.toLowerCase();
        token = newStr.split(" ");
        return token;
    }

}
