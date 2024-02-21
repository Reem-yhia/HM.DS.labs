
public class Main {
    //5sin
    public static Node concatenate(Node headL, Node headM) {
        Node currentL = headL;
        Node currentM = headM;
        Node lastL = headL;

        while (currentL != null) {
        currentL = currentL.next;
        }

        lastL.next = headM;

        while (currentM != null) {
        currentM = currentM.next;
        }

        return headL;
        }

    public static void main(String[] args) {
        // إنشاء عقد القائمة L
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        node1.next = node2;
        node2.next = node3;

        // إنشاء عقد القائمة M
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);

        node4.next = node5;
        node5.next = node6;

        // دمج القائمتين L و M
        Node headL = node1;
        Node headM = node4;
        Node headLM = concatenate(headL, headM);

        // طباعة العناصر
        Node current = headLM;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
