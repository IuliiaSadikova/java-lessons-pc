package algorithms.hw_1206;

import java.util.Stack;

public class HanoiIterative {

    public static void main(String[] args) throws Exception {
        int towerLength = 3;
        String left = "Left";
        String middle = "Middle";
        String right = "Right";

        Stack<HanoiMove> moves = new Stack<>();
        moves.push(new HanoiMove(towerLength, left, middle, right));

        while (!moves.empty()) {
            HanoiMove move = moves.pop();

            if (move.towerLength == 1) {
                System.out.println(move.left + " to " + move.middle);
            } else {
                moves.push(new HanoiMove(move.towerLength - 1, move.right, move.middle, move.left));
                moves.push(new HanoiMove(1, move.left, move.middle, move.right));
                moves.push(new HanoiMove(move.towerLength - 1, move.left, move.right, move.middle));
            }
        }
    }

    static class HanoiMove {
        int towerLength;
        String left;
        String middle;
        String right;

        HanoiMove(int towerLength, String left, String middle, String right) {
            this.towerLength = towerLength;
            this.left = left;
            this.middle = middle;
            this.right = right;
        }
    }

}
