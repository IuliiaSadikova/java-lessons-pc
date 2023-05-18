package homeworks.hw1105;

import javax.swing.plaf.IconUIResource;
import java.util.Iterator;
import java.util.ListIterator;

public class MyLinkedList implements Iterable<String> {
    private int size = 0;
    private Node first;
    private Node last;

    public void clear() {
        size = 0;
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public String get(int index) {
        if (index < 0 || index >= size) {
            throw new RuntimeException();
        }
        Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        Node current = first;
        while (current != null) {
            builder.append(current.data).append(", ");
            current = current.next;
        }
        builder.setLength(builder.length() - 2);
        builder.append("]");
        return builder.toString();
    }

    public void add(String value) {
        if (isEmpty()) {
            first = new Node(value, null, null);
            last = first;
        } else {
//            Node current = first;
//            for (int i = 0; i < size - 1; i++) {
//                current = current.next;
//            }
//            Node newNode = new Node(value, null, current);
//            current.next = newNode;
            Node newNode = new Node(value, null, last);
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    public void addByIndex(String value, int index) {
        if (index > size)
            throw new IllegalArgumentException("Index can't be more than list size");
        if (isEmpty()) {
            first = new Node(value, null, null);
        }
        if (index == size) {
            add(value);
        } else {
            Node current = first;
            int i = 0;
            while (current != null) {
                if (i == index) {
                    Node newNode = new Node(value, current, current.prev);
                    if (current.prev != null) {
                        current.prev.next = newNode;
                    }
                    current.prev = newNode;
                    if (index == 0) {
                        first = newNode;
                    }
                    return;

                }
                i++;
                current = current.next;
                size++;
            }
        }
    }

    @Override
    public Iterator<String> iterator() {
        return new MyIterator();
    }

    public class MyIterator implements Iterator<String> {

        private int cursor = 0;
        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public String next() {
            String result = current.data;
            current = current.next;
            return result;
        }
    }

    public ListIterator<String> listIterator() {
        return new MyListIterator();
    }

    public class MyListIterator implements ListIterator<String> {

        private int cursor = 0;
        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public String next() {
            if (current == null) {
                if (first == null) {
                    throw new IllegalStateException("Call hasNext() firstly");
                }
                String result = first.data;
                current = first.next;
                return result;
            }
            String result = current.data;
            current = current.next;
            cursor++;
            return result;
        }

        @Override
        public boolean hasPrevious() {
            if (current == null) {
                return false;
            }
            return current.prev != null;
        }

        @Override
        public String previous() {
            if (current.prev == null) {
                throw new IllegalStateException("Call hasPrevious() firstly");
            } else {

                String result = current.prev.data;
                current = current.prev;
                cursor--;
                return result;
            }
        }

        @Override
        public int nextIndex() {
            if (current == null) {
                throw new IllegalArgumentException("There is no next index");
            }
            if (current.prev == null) {
                return 0;
            }
            if (current.next == null) {
                return cursor;
            } else
                return cursor++;
        }

        @Override
        public int previousIndex() {
            if (current == null || current.prev == null) {
                throw new IllegalArgumentException("There is no previous index");
            } else
                return --cursor;
        }

        @Override
        public void remove() {
            if (current == null) {
                throw new IllegalStateException();
            }
            if (current.prev == null) {
                first = current.next;
            } else {
                current.prev.next = current.next;
            }
            current = current.next;
            size--;
        }

        @Override
        public void set(String s) {
            if (current == null) {
                throw new IllegalStateException();
            }
            current.data = s;
        }

        @Override
        public void add(String s) {
            if (current.prev == null) {
                Node newNode = new Node(s, current, null);
                current = newNode;
                first = current;
            }
            if (current.next == null) {
                Node newNode = new Node(s, null, current);
                current.next = newNode;
                last = newNode;
                current = last;
            } else {
                Node newNode = new Node(s, current, current.prev);
                current.prev.next = newNode;
                current.next.prev = newNode;
                current = newNode;
            }
            size++;
        }
    }


    private class Node {

        private String data;
        private Node next;
        private Node prev;

        public Node(String data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

        @Override
        public String toString() {
            return data;
        }
    }
}
