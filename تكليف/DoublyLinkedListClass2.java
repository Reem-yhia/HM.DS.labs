public class DoublyLinkedListClass2 {
    public int size() {
        Node current = head;
        int count = 0;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

}
