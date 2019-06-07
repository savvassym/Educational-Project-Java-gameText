package gr.gcc.hellisland;

import gr.gcc.hellisland.Commands.Command;
import gr.gcc.hellisland.Domain.Direction;
import gr.gcc.hellisland.Domain.Door;
import gr.gcc.hellisland.Domain.Player;
import gr.gcc.hellisland.Domain.Room;
import gr.gcc.hellisland.Input.InputChecker;
import gr.gcc.hellisland.Input.UserInput;
import gr.gcc.hellisland.Item.Key;
import gr.gcc.hellisland.Parser.Parser;
import gr.gcc.hellisland.UI.UI;

public class Main {
    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        UI ui = new UI();
        InputChecker check = new InputChecker();
        Key key1 =new Key(1);
        Key key2 = new Key(2);
        Key key3 = new Key(3);
        Room room1 = new Room("Mainland");
        Room room2 = new Room("Plane");
        Room room3 = new Room("Sea");
        Room room4 = new Room("Forrest");
        Room room5 = new Room("Cave");

        Door door1 = new Door(true,room1,room2,1);
        Door door2 = new Door(false,room1,room3,2);
        Door door3 = new Door(true,room1,room4,3);
        Door door4 = new Door(true,room4,room5,4);
        room1.addRoom(room2,Direction.right,true,1);
        room1.addRoom(room3,Direction.down,true,2);
        room1.addRoom(room4,Direction.up,true,3);
        room4.addRoom(room5,Direction.right,true,4);



        String input;
        ui.showOptionCommand();
        Room currentRoom = room2;
        boolean isCorrect;
        Parser pars = new Parser();
        ui.showMsg();
        input=userInput.getInput();
        while (!input.equals("0")) {
            isCorrect = check.isChecked(input);
            while (!isCorrect || input.equals("0")) {
                ui.showErrorMsg();
                input = userInput.getInput();
                isCorrect = check.isChecked(input);
            }
            Command command = pars.parser(input);

            Player player = command.execute(currentRoom);
            currentRoom = player.getCurrentRoom();
            System.out.println(player.getMessage());

            input=userInput.getInput();
        }

        //System.out.println(currentRoom.getName());
    }

}
