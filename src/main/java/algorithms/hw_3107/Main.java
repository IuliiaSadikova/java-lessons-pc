package algorithms.hw_3107;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Main {

    public static void main(String[] args) {

        Stack stack = new Stack(new ArrayList<>());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.items);
        stack.pop();
        System.out.println(stack.items);
        stack.peek();
        System.out.println(stack.peek());
        stack.push(-2);
        stack.push(0);
        System.out.println(stack.items);
        System.out.println(stack.getMin());

    }

    public static class Stack {

        ArrayList<Integer> items;
        ArrayList<Integer> minItems;

        public Stack(ArrayList<Integer> items) {
            this.items = items;
        }

        public int push(int elem) {
            this.items.add(elem);
            return this.items.size();
        }

        public int pop() {
            if (this.items.isEmpty()) {
                throw new EmptyStackException();
            }
            return this.items.remove(this.items.size() - 1);
        }

        public int peek() {
            return this.items.get(this.items.size() - 1);
        }

        public boolean isEmpty() {
            return this.items.size() == 0;
        }
        public int getMin() {
            int min = 0;
            for (int i = 0; i < this.items.size(); i++) {
                if (this.items.get(i) < min) {
                    min = this.items.get(i);
                }
            }
            return min;
        }
    }
}

