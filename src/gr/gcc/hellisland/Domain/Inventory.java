package gr.gcc.hellisland.Domain;

import gr.gcc.hellisland.Item.Item;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private final Map<String,Item> inventory = new HashMap<String,Item>();

    public Map<String, Item> getInventory() {
        return inventory;
    }

    public void addItem(Item item) {
        inventory.put(item.getName(), item);
    }

    public Item getItemNamed(String name) {
        return inventory.get(name);
    }

    public Item takeItemNamed(String name) {
        return inventory.remove(name);
    }

    public void removeItem(Item item) {
        boolean removed = inventory.values().remove(item);
        if (!removed) {
            throw new IllegalArgumentException("Did not have item: " + item);
        }
    }

    public boolean contains(Item item) {
        return inventory.containsKey(item);
    }

    public boolean isEmpty(){
        return inventory.isEmpty();
    }

    public boolean hasItemNamed(String name) {
        return inventory.containsKey(name);
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "inventory=" + inventory +
                '}';
    }

    public Collection<String> namesOfItems() {
        return Collections.unmodifiableCollection(inventory.keySet());
    }
}

