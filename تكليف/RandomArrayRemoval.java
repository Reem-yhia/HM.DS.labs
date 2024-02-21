import java.util.ArrayList;
import java.util.Random;

    public class RandomArrayRemoval {
        public static void main(String[] args) {
            // قم بتعبئة المصفوفة بالعناصر
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            // استدعاء الطريقة لإجراء الانتقاء والإزالة العشوائية
            removeRandomEntries(array);

            // طباعة المصفوفة بعد إزالة العناصر العشوائية
            for (int num : array) {
                System.out.print(num + " ");
            }
        }
        public static void removeRandomEntries(int[] array) {
            // إنشاء كائن Random لتوليد الأعداد العشوائية
            Random random = new Random();

            // إنشاء ArrayList لتخزين العناصر الموجودة في المصفوفة
            ArrayList<Integer> list = new ArrayList<>();
            for (int num : array) {
                list.add(num);
            }

            // حتى تصبح المصفوفة فارغة
            while (!list.isEmpty()) {
                // تحديد عنصر عشوائي للإزالة
                int randomIndex = random.nextInt(list.size());
                int removedNum = list.remove(randomIndex);

                System.out.println("تمت إزالة العنصر: " + removedNum);
            }
        }
    }

