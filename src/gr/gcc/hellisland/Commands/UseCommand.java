package gr.gcc.hellisland.Commands;

import gr.gcc.hellisland.Domain.GameState;
import gr.gcc.hellisland.Item.Item;
import gr.gcc.hellisland.Domain.Room;

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
