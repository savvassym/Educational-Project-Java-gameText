package gr.gcc.hellisland.Domain;

public class Tokenizer {

    private String[] token = new String[2];

    public String[] getToken(String input){
        token = input.split(" ");
        return token;
    }
}

