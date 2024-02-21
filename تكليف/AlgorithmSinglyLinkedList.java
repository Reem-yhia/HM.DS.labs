import java.util.ArrayList;
import java.util.List;

public class AlgorithmSinglyLinkedList {
    public static class SinglyLinkedList {

        private Node head;
        public SinglyLinkedList() {
            this.head = null;
        }

        public void add(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }
        public List<Integer> findSecondToLast() {
            if (head == null || head.next == null) {
                return new ArrayList<>();
            }
            Node current = head.next;
            Node next = current.next;

            while (next != null) {
                current = current.next;
                next = next.next;
            }
            List<Integer> list = new ArrayList<>();
            while (current != null) {
                list.add(current.data);
                current = current.next;
            }
            return list;
        }
        private class Node {
            private int data;
            private Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
        public  static void main(String[] args) {
            SinglyLinkedList list = new SinglyLinkedList();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);

            List<Integer> nodes = list.findSecondToLast();

            for (int node : nodes) {
                System.out.println(node);
            }
        }
    }
}
