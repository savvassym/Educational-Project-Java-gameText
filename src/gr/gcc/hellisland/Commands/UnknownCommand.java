package gr.gcc.hellisland.Commands;

import gr.gcc.hellisland.Domain.Player;
import gr.gcc.hellisland.Domain.Room;

public class UnknownCommand implements Command {
    private String str;

    public UnknownCommand(String str){
        this.str=str;
    }


    @Override
    public Player execute(Room currentRoom) {
        return new Player(currentRoom,"unknown Command " +str);
    }
}
