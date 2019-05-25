package gr.gcc.hellisland.Domain;

public class GoCommand implements  Command{
    private Direction direction;

    public  GoCommand(Direction direction){
        this.direction = direction;
    }

    @Override
    public GameState execute(Room currentRoom) {
        if(currentRoom.hasUnlockDoor(direction)){
            Room newRoom = currentRoom.getRoom(direction);
            return new GameState(newRoom, "Hey! i just moved");
        }
        else {
            return  new GameState(currentRoom,"Hey im still here");
        }
    }

}
