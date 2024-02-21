public class Mainn {
    //6sin
    public static Node reverse(Node head) {
        Node current = head;
        Node previous = null;

        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }

    public static void main(String[] args) {
        // إنشاء عقد القائمة
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        node1.next = node2;
        node2.next = node3;

        // عكس القائمة
        Node head = node1;
        Node reversedHead = reverse(head);

        // طباعة العناصر
        Node current = reversedHead;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
