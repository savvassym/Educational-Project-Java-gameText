package gr.gcc.hellisland;
import gr.gcc.hellisland.Domain.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Room room1 = new Room("Mainland");
        Room room2 = new Room("Plane");//.addItemsToRoom(apple).addItemsToRoom(sword);
        Room room3 = new Room("Sea");
        Room room4 = new Room("Forrest");
        Room room5 = new Room("Cave");

        Door door1 = new Door(true,room1,room2);
        Door door2 = new Door(false,room1,room3);
        Door door3 = new Door(true,room1,room4);
        Door door4 = new Door(true,room4,room5);

        room1.addRoom(room2,Direction.right,false);
        room1.addRoom(room3,Direction.down,false);
        room1.addRoom(room4,Direction.up,true);
        room4.addRoom(room5,Direction.right,true);



//
//        Room currentRoom = room2;
//        Command command = new GoCommand(Direction.left);
//        GameState gameState = command.execute(currentRoom);
//        currentRoom = gameState.getCurrentRoom();
//        System.out.println(gameState.getMessage());


//         Room Connections
//        door1.setLocked(false);
//        room1.putLeftOf(room2);
//        room2.putRightOf(room1);
//        room1.putUpOf(room3);
//        room3.putDownOf(room1);
//        room1.putDownOf(room4);
//        room4.putUpOf(room1);
//        room5.putLeftOf(room4);
//        room4.putRightOf(room5);
//
//
//        Player currentRoom = new Player(room2);
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("You are in " + currentRoom.nameOfCurrentRoom());
//        System.out.println(currentRoom.lookAround());
//        System.out.println("And your possible directions are " + currentRoom.possibleDirections());
//        String choice = scanner.nextLine();
//
//
//        while (!choice.equals("exit")) {
//            try {
//                System.out.println(currentRoom.move(Direction.valueOf(choice)));
//            } catch (IllegalArgumentException e) {
//                System.out.println("not valid direction\n");
//            }
//
//            System.out.println("You are in " + currentRoom.nameOfCurrentRoom());
//            System.out.println(currentRoom.lookAround());
//            System.out.println("And your possible directions are " + currentRoom.possibleDirections());
//            choice = scanner.nextLine();
//
//        }
    }

}