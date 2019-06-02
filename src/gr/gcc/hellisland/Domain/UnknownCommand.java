package gr.gcc.hellisland.Domain;

public class UnknownCommand implements Command{
    @Override
    public GameState execute(Room currentRoom) {
        return new GameState(currentRoom,"unknown Command");
    }
}
