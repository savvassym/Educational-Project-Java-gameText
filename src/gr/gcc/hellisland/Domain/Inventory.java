package gr.gcc.hellisland.Domain;

import gr.gcc.hellisland.Item.Item;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Item> list = new ArrayList<>(100);

    public void addList(Item item) {
        list.add(item);
    }

    public List<Item> getList() {
        return list;
    }

    public boolean searchList(Item item) {
        boolean found;
        found=list.contains(item);
        return found;
    }

    public int sizelist() {
        return list.size();
    }

}
