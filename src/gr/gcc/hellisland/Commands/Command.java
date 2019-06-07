package gr.gcc.hellisland.Commands;

import gr.gcc.hellisland.Domain.Player;
import gr.gcc.hellisland.Domain.Room;

public interface Command {

    Player execute(Room currentRoom);

}
