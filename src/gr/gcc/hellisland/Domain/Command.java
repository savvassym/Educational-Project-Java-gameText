package gr.gcc.hellisland.Domain;

public interface Command {

    GameState execute(Room currentRoom);

}
