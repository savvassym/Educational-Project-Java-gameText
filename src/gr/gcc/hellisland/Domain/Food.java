package gr.gcc.hellisland.Domain;

public class Food implements Item{
    @Override
    public String use(Room currentRoom) {
        return null;
    }

    private String description;
    private int lifePoints;
    private boolean pickable;
    private boolean edible;

    public Food(String description, int lifePoints, boolean pickable, boolean edible) {
        this.description = description;
        this.lifePoints = lifePoints;
        this.pickable = pickable;
        this.edible = edible;
    }

    public String getDescription() {
        return description;
    }

    public int getLifePoints() {
        return lifePoints;
    }

}
