package gr.gcc.hellisland.Commands;

import gr.gcc.hellisland.Domain.Direction;
import gr.gcc.hellisland.Domain.GameState;
import gr.gcc.hellisland.Domain.Room;

public class GoCommand implements Command {
    private Direction direction;

    public  GoCommand(Direction direction){
        this.direction = direction;
    }

    @Override
    public GameState execute(Room currentRoom) {
        if(currentRoom.hasUnlockDoor(direction)){
            Room newRoom = currentRoom.getRoom(direction);
            return new GameState(newRoom, "Hey! i just moved " +newRoom.getName());
        }
        else {
            return  new GameState(currentRoom,"Hey im still here");
        }
    }

}
