package gr.gcc.hellisland.Commands;

import gr.gcc.hellisland.Domain.Player;
import gr.gcc.hellisland.Domain.Room;
import gr.gcc.hellisland.Item.Item;

public class UseCommand implements Command {
    private Item item;

    public UseCommand(Item item){
        this.item = item;
    }

    public Player execute(Room currentRoom){
        String message = item.use(currentRoom);
        return new Player(currentRoom,message);
        //savvas sym


    }
}
