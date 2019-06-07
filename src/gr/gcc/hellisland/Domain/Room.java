package gr.gcc.hellisland.Domain;

import gr.gcc.hellisland.Item.Item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Room{

    private String name;
    private Map<Direction,Door> exits = new HashMap<>();
    private List<Item> itemsInRoom = new ArrayList<>();


    public Room(String name){
        this.name = name;
    }

    public Room addRoom(Room room,Direction direction,boolean isLocked,int id){
        Door door = new Door(isLocked,this,room,id);
        this.exits.put(direction,door);
        room.addRoom(door,Direction.getOppositeDirection(direction));
        return this;
    }

    public boolean hasUnlockDoor(Direction direction){
        Door door = exits.get(direction);
        return (door!=null && !door.isLocked());
    }

    public Room getRoom(Direction direction){
        Door door = exits.get(direction);
        return door.getOtherRoom(this);
    }

    public boolean unlockDoors(int id){
        boolean hasUnlocked = false;
        for(Door door : exits.values()){
            if(door.getId() == id && door.isLocked()){
                hasUnlocked=true;
                door.setLocked(false);
            }
        }
        return hasUnlocked;
    }


    private Room addRoom(Door door,Direction direction){
        this.exits.put(direction,door);
        return this;
    }

    public boolean contains(Item item){
        return itemsInRoom.contains(item);
    }

    public Room addItemsToRoom(Item item){
        itemsInRoom.add(item);
        return this;
    }
    public Room deleteItemFromRoom(Item item){
        itemsInRoom.remove(item);
        return this;
    }

    @Override
    public String toString() {
        return "Room{" +
                "itemsInRoom=" + itemsInRoom +
                '}';
    }

    public List<Item> getItemsInRoom() {
        return itemsInRoom;
    }

    public String getName() {
        return name;
    }



}
