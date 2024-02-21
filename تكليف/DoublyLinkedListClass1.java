public class DoublyLinkedListClass1 {
    //1Dou
    public static Node findMiddle(Node head) {
        if (head == null || head.next == null || head.next.next == null) {
            return null; // قائمة فارغة أو تحتوي على عقدة واحدة
        }

        Node ptr1 = head.next;
        Node ptr2 = head.next.next;

        while (ptr2 != head && ptr2.next != head) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next.next;
        }

        if (ptr2 == head) { // طول زوجي
            return ptr1; // العقدة الوسطى هي رأس القائمة
        } else { // طول فردي
            return ptr1; // العقدة الوسطى هي ptr1
        }
    }

}
