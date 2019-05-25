package gr.gcc.hellisland.Domain;

public class Key implements  Item{
    @Override
    public String use(Room currentRoom) {
        if(currentRoom.unlockDoors()){
            return "Hey! Managed to unlock something";
        }
        else {
            return "Nothing to unlock";
        }
    }
}
