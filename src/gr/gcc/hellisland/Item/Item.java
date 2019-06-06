package gr.gcc.hellisland.Item;

import gr.gcc.hellisland.Domain.Room;

public interface Item {
    String use(Room currentRoom);
    String pick(Room currentRoom,Item item);
    String getName();

}
