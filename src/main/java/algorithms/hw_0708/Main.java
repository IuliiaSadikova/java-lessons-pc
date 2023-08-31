package algorithms.hw_0708;

import java.util.Arrays;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.pushToTail(1);
        list.pushToTail(2);
        list.pushToTail(3);
        list.printList();
        list.pushToIndex(2, 7);
        list.printList();
        list.removeLast();
        list.printList();
        list.remove(0);
        list.printList();
        list.get(1);
        list.printList();
    }


    public static class LinkedList {
        Node head;

        public void pushToTail(int data) {
            if (head == null) {
                head = new Node(data);
            } else {
                Node currentNode = head;
                while (currentNode.next != null) {
                    currentNode = currentNode.next;
                }
                currentNode.next = new Node(data);
            }
        }

        public void pushToIndex(int index, int data) {
            if (index < 0) {
                System.out.println("Index should be > 0");
            } else if (index == 0) {
                Node newNode = new Node(data);
                newNode.next = head;
                head = newNode;
            } else {
                Node currentNode = head;
                for (int i = 0; i < index - 1; i++) {
                    if (currentNode == null) {
                        System.out.println("Index isn't correct");
                        return;
                    }
                    currentNode = currentNode.next;
                }
                Node newNode = new Node(data);
                newNode.next = currentNode.next;
                currentNode.next = newNode;
            }
        }

        public void removeLast() {
            if (head == null) {
                System.out.println("Linked list is empty");
            } else if (head.next == null) {
                head = null;
            } else {
                Node currentNode = head;
                while (currentNode.next.next != null) {
                    currentNode = currentNode.next;
                }
                currentNode.next = null;
            }
        }

        public void remove(int index) {
            if (index < 0) {
                System.out.println("Index should be > 0");
            } else if (index == 0) {
                if (head == null)
                    System.out.println("Linked list is empty");
                else
                    head = head.next;
            } else {
                Node currentNode = head;
                for (int i = 0; i < index - 1; i++) {
                    if (currentNode == null) {
                        System.out.println("Index isn't correct");
                        return;
                    }
                    currentNode = currentNode.next;
                }
                currentNode.next = currentNode.next.next;
            }

        }

        public void get(int index) {
            if (index < 0) {
                System.out.println("Index should be > 0");
            } else if (index == 0) {
                if (head == null)
                    System.out.println("The linked list is empty");
                else
                    head = head.next;
            } else {
                Node currentNode = head;
                for (int i = 0; i < index; i++) {
                    if (currentNode == null) {
                        System.out.println("Index isn't correct");
                    }
                    currentNode = currentNode.next;
                }
                System.out.println(currentNode.data);
            }
        }


        public void printList() {
            Node currentNode = head;
            while (currentNode != null) {
                System.out.print(currentNode.data + " , ");
                currentNode = currentNode.next;
            }
            System.out.println("null");
        }

    }

}
