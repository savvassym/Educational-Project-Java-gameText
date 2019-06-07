package gr.gcc.hellisland.UI;

public class UI {


    public void showMsg(){
        System.out.print("Type a command > ");
    }
    public void showErrorMsg(){
        System.out.print("Wrong input please Try Again\n> ");
    }

    public void showOptionCommand(){
        System.out.println("Greetings human!");
        System.out.println("Type of Commands you can type:\nCommand: move + Directions(left,right,up,down)");
        System.out.println("Command: use + key1 or key2 or key3 or key4");
    }
}
