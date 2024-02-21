
    public class SinglyLinkedList<T> {

        private Node<T> head;
        private int size;

        public SinglyLinkedList() {
            this.head = null;
            this.size = 0;
        }

        public void add(T data) {
            Node<T> newNode = new Node<>(data);

            if (head == null) {
                head = newNode;
            } else {
                Node<T> current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
            size++;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }

            if (!(obj instanceof SinglyyLinkedList)) {
                return false;
            }

            SinglyyLinkedList<T> other = (SinglyyLinkedList<T>) obj;

            if (size != other.size) {
                return false;
            }

            Node<T> current1 = head;
            Node<T> current2 = other.head;
            while (current1 != null && current2 != null) {
                if (!current1.data.equals(current2.data)) {
                    return false;
                }
                current1 = current1.next;
                current2 = current2.next;
            }

            return true;
        }

        private class Node<T> {
            private T data;
            private Node<T> next;

            public Node(T data) {
                this.data = data;
                this.next = null;
            }
        }

        public static void main(String[] args) {
            SinglyyLinkedList<String> list1 = new SinglyyLinkedList<>();
            list1.add("A");
            list1.add("B");
            list1.add("C");

            SinglyyLinkedList<String> list2 = new SinglyyLinkedList<>();
            list2.add("A");
            list2.add("B");
            list2.add("C");

            System.out.println(list1.equals(list2)); // True

            SinglyyLinkedList<String> list3 = new SinglyyLinkedList<>();
            list3.add("A");
            list3.add("B");
            list3.add("D");

            System.out.println(list1.equals(list3)); // False
        }
    }

