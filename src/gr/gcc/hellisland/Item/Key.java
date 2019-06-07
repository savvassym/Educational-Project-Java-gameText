package gr.gcc.hellisland.Item;

import gr.gcc.hellisland.Domain.Room;

public class Key implements Item {
    @Override
    public String getName() {
        return null;
    }

    private int id;

    public Key(int id) {
        this.id = id;
    }

    @Override
    public String pick(Room currentRoom,Item item) {
       return null;
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
