package gr.gcc.hellisland.Domain;

public interface Command {

    GameState execute(Room currentRoom);

//    String pickUp(String item);
//
//    String use(String item);

}
