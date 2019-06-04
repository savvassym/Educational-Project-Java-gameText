package gr.gcc.hellisland.Commands;

import gr.gcc.hellisland.Domain.GameState;
import gr.gcc.hellisland.Domain.Room;
import gr.gcc.hellisland.Item.Item;

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
