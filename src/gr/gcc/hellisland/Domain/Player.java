package gr.gcc.hellisland.Domain;


public class Player {
    private Room currentRoom;
    private  String message = "";


    public Player(Room currentRoom, String message) {
        this.currentRoom = currentRoom;
        this.message = message;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
