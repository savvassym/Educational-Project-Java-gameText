package gr.gcc.hellisland.Domain;

public class UseCommand implements Command {
    private Item item;

    public UseCommand(Item item){
        this.item = item;
    }

    public GameState execute(Room currentRoom){
        String message = item.use(currentRoom);
        return new GameState(currentRoom,message);
    }
}
