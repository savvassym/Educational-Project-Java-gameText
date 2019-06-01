package gr.gcc.hellisland.Domain;

public class Key implements  Item{
    private int id;

    public int getId() {
        return id;
    }

    public Key(int id){
        this.id=id;
    }

    @Override
    public String use(Room currentRoom) {
       if(currentRoom.unlockDoor(getId())){
            return "Hey! Managed to unlock something";
        }
        else {
            return "Nothing to unlock";
        }
    }
}
