package gr.gcc.hellisland.Item;

import gr.gcc.hellisland.Domain.Room;
import gr.gcc.hellisland.Item.Item;

public class Key implements Item {
    private int id;

    public int getId() {
        return id;
    }


    @Override
    public String use(Room currentRoom) {
       if(currentRoom.unlockDoor(getId())){
            return "Hey! Managed to unlock something";
        }
        else {
            return "Nothing to unlock";
        }
    }
}
