public class DoublyLinkedList{

    private Node head;
    private Node tail;

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public int size() {
        Node current = head;
        int count = 0;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof DoublyLinkedList)) {
            return false;
        }

        DoublyLinkedList other = (DoublyLinkedList) obj;

        if (this.size() != other.size()) {
            return false;
        }

        Node current1 = this.head;
        Node current2 = other.head;

        while (current1 != null && current2 != null) {
            if (current1.data != current2.data) {
                return false;
            }

            current1 = current1.next;
            current2 = current2.next;
        }

        return true;
    }

    private class Node {

        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);

        int size = list.size();
        System.out.println(size); // 3

        DoublyLinkedList otherList = new DoublyLinkedList();
        otherList.add(1);
        otherList.add(2);
        otherList.add(3);

        boolean isEqual = list.equals(otherList);
        System.out.println(isEqual); // true

    }
}
