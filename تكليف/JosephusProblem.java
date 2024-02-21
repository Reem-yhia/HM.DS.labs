
    import java.util.LinkedList;
import java.util.Queue;

    public class JosephusProblem {
        public static int josephus(int n, int k) {
            Queue<Integer> queue = new LinkedList<>();

            // إضافة الأشخاص إلى الطابور
            for (int i = 1; i <= n; i++) {
                queue.add(i);
            }

            while (queue.size() > 1) {
                // إزالة الشخص رقم k من بداية الطابور
                for (int i = 0; i < k - 1; i++) {
                    int person = queue.remove();
                    queue.add(person);
                }

                // إزالة الشخص رقم k
                queue.remove();
            }

            // الشخص المتبقي الوحيد في الطابور
            return queue.peek();
        }
        public static void main(String[] args) {
            int n = 7; // عدد الأشخاص
            int k = 3; // عدد الشخص الذي سيتم إزالته

            int survivor = josephus(n, k);
            System.out.println("The survivor is personالشخص الباقي على قيد الحياة هو الشخص رقم " + survivor);
        }
    }

