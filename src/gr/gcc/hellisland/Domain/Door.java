package gr.gcc.hellisland.Domain;

public class Door {

    private boolean locked;
    private int id;
    private Room room1;
    private Room room2;



    public Door(boolean locked, Room room1, Room room2, int id) {
        this.locked = locked;
        this.room1=room1;
        this.room2=room2;
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Room getOtherRoom(Room room){
        if(room!=room2){
            return room2;
        }
        else{
            return room1;
        }
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public Room getRoom1() {
        return room1;
    }

    public void setRoom1(Room room1) {
        this.room1 = room1;
    }

    public Room getRoom2() {
        return room2;
    }

    public void setRoom2(Room room2) {
        this.room2 = room2;
    }

}
