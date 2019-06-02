package gr.gcc.hellisland.Domain;

public class UnknownCommand implements Command{
    private String str;

    public UnknownCommand(String str){
        this.str=str;
    }


    @Override
    public GameState execute(Room currentRoom) {
        return new GameState(currentRoom,"unknown Command");
    }
}
