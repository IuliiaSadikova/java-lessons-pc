package algorithms.hw_1206;

public class HanoiRecursion {

    public static void main(String[] args) {

        int towerLength = 3;
        moveTower(towerLength, "Left", "Middle", "Right");
    }

    public static void moveTower(int numberOfDisks, String source, String intermediary, String destination) {
        if (numberOfDisks <= 0) {
            throw new IllegalStateException("The tower length cannot be negative");
        }
        if (numberOfDisks == 1) {
            System.out.println("Move disk from " + source + " to " + destination);
        } else {
            moveTower(numberOfDisks - 1, source, destination, intermediary);
            System.out.println("Move disk form " + source + " to " + destination);
            moveTower(numberOfDisks - 1, intermediary, source, destination);
        }
    }
}
