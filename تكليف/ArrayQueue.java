import java.util.Queue;

public abstract class ArrayQueue<T> implements Queue<T> {
    private T[] queue;
    private int front;
    private int rear;
    public void rotate() {
        if (isEmpty()) {
            return; // لا يوجد عناصر في الطابور، لا يوجد دوران
        }

        T temp = queue[front]; // حفظ العنصر الأمامي الحالي

        front = (front + 1) % queue.length; // تحديث المؤشر الأمامي
        rear = (rear + 1) % queue.length; // تحديث المؤشر الخلفي

        queue[rear] = temp; // إعادة العنصر الأمامي إلى المؤخرة
    }
}