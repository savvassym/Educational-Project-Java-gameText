package gr.gcc.hellisland.Item;

import gr.gcc.hellisland.Domain.Room;

public class Key implements Item {
    private int id;

    public Key(int id) {
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


    @Override
    public String use(Room currentRoom) {
       if(currentRoom.unlockDoors(getId())){
            return "Hey! Managed to unlock something";
        }
        else {
            return "Nothing to unlock";
        }
    }
}
