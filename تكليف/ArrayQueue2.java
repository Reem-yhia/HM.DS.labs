import java.util.Arrays;
import java.util.Queue;

abstract class ArrayQueue2<T> implements Queue<T> {
        private T[] queue;
        private int front;
        private int rear;


        @SuppressWarnings("unchecked")
        public ArrayQueue2<T> clone() {
            try {
                ArrayQueue2<T> clonedQueue = (ArrayQueue2<T>) super.clone();

                // إنشاء نسخة عميقة من المصفوفة
                clonedQueue.queue = Arrays.copyOf(queue, queue.length);

                return clonedQueue;
            } catch (CloneNotSupportedException e) {
                throw new InternalError(e.getMessage());
            }
        }
    }

