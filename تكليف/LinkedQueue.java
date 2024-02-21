import java.util.NoSuchElementException;
//3
public class LinkedQueue<T> {
    private Node<T> head;
    private Node<T> tail;

    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void enqueue(T element) {
        Node<T> newNode = new Node<>(element);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }

        T element = head.data;
        head = head.next;

        if (head == null) {
            tail = null;
        }

        return element;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void concatenate(LinkedQueue<T> Q2) {
        if (Q2.isEmpty()) {
            return; // لا يوجد عناصر للتصاقها، لا يوجد أي تغيير
        }

        if (isEmpty()) {
            head = Q2.head; // الطابور الأصلي فارغ، نقوم بنقل رأس Q2 كرأس الطابور الأصلي
        } else {
            tail.next = Q2.head; // ربط ذيل الطابور الأصلي برأس Q2
        }

        tail = Q2.tail; // تحديث الذيل ليكون ذيل Q2

        Q2.head = null; // جعل Q2 فارغة
        Q2.tail = null;
    }

    public static void main(String[] args) {
        LinkedQueue<Integer> queue1 = new LinkedQueue<>();
        LinkedQueue<Integer> queue2 = new LinkedQueue<>();

        // قم بإضافة عناصر للطابور الأول
        queue1.enqueue(1);
        queue1.enqueue(2);
        queue1.enqueue(3);

        // قم بإضافة عناصر للطابور الثاني
        queue2.enqueue(4);
        queue2.enqueue(5);
        queue2.enqueue(6);

        // قبل الالتصاق
        System.out.println("Queue 1: " + queue1.toString());
        System.out.println("Queue 2: " + queue2.toString());

        // الالتصاق
        queue1.concatenate(queue2);

        // بعد الالتصاق
        System.out.println("Queue 1 after concatenation: " + queue1.toString());
        System.out.println("Queue 2 after concatenation: " + queue2.toString());
    }
}