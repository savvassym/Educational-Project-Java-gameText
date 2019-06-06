package gr.gcc.hellisland.Domain;

import gr.gcc.hellisland.Commands.Command;

public class Player implements Command {
    int life=10;
    int dmg = 100;


    @Override
    public GameState execute(Room currentRoom) {
        return null;
    }



    // private Room currentRoom;
//    private Door door;
//    private Inventory playerInventory = new Inventory();
//
//
//    @Override
//    public String move(Direction direction) {
//        Room next = currentRoom;
//        if((next!=null)) {
//           next = currentRoom.roomTo(direction);
//           currentRoom=next;
//           return "You move "+ " "+ direction+'.';
//        }
//        else {
//            return "Nothing there";
//        }
//    }
//
//    @Override
//    public String pick(Item item) {
//        if(item.pickable(item)){
//            playerInventory.addList(item);
//            currentRoom.deleteItemFromRoom(item);
//            return "New Item in your inventory";
//        }
//        else {
//            return "Item is not pickale";
//        }
//    }
//
//    public Player(Room startingRoom) {
//        this.currentRoom = startingRoom;
//    }
//
//    public String nameOfCurrentRoom(){
//        return currentRoom.getName();
//    }
//
//    public List<Item> lookAround(){
//        if(currentRoom.getItemsInRoom().isEmpty()){
//            return currentRoom.getItemsInRoom();
//        }
//        else {
//            return null;
//        }
//    }
//
//    public Room getCurrentRoom(){
//        return currentRoom;
//    }
//
//    public Collection<Direction> possibleDirections(){
//        return currentRoom.possibleDirections(); //method from Class Room
//    }

}
