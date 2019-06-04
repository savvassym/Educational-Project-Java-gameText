package gr.gcc.hellisland.Commands;

import gr.gcc.hellisland.Domain.GameState;
import gr.gcc.hellisland.Domain.Room;

public interface Command {

    GameState execute(Room currentRoom);

}
