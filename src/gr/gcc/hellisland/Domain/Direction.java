package gr.gcc.hellisland.Domain;
public enum Direction {
    right, left, up, down;

    public static Direction getOppositeDirection(Direction direction){
        switch (direction){
            case right:
                return left;
            case left:
                return right;
            case up:
                return down;
                default:
                    return up;
        }
    }
}
