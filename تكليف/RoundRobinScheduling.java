
import java.util.LinkedList;
import java.util.Queue;
//5
    class Task {
        private String name;
        private int burstTime;

        public Task(String name, int burstTime) {
            this.name = name;
            this.burstTime = burstTime;
        }
        public String getName() {
            return name;
        }
        public int getBurstTime() {
            return burstTime;
        }
    }
    public class RoundRobinScheduling {
        public static void simulateRoundRobin(Queue<Task> queue, int timeQuantum) {
            while (!queue.isEmpty()) {
                Task currentTask = queue.poll(); // استخراج المهمة الحالية من بداية الطابور

                // تنفيذ المهمة للوقت المحدد (وقت الكم الزمني) أو حتى انتهاء وقت المهمة إذا كانت أقل من الوقت المحدد
                int remainingTime = currentTask.getBurstTime();
                if (remainingTime <= timeQuantum) {
                    System.out.println("تنفيذ المهمة: " + currentTask.getName() + " لمدة " + remainingTime + " وحدة زمنية.");
                    // يتم التعامل مع انتهاء المهمة هنا (مثل طباعة النتائج أو تحديث الإحصائيات)
                } else {
                    System.out.println("تنفيذ المهمة: " + currentTask.getName() + " لمدة " + timeQuantum + " وحدة زمنية.");
                    remainingTime -= timeQuantum;
                    // إعادة إضافة المهمة إلى نهاية الطابور لاستكمالها في وقت لاحق
                    queue.add(new Task(currentTask.getName(), remainingTime));
                }
            }
        }
    }
//**هذا هو الكود الخاص بمحاكاة جدولة الدوران الدائري باستخدام طابور في اللغة الجافا. يتم تمثيل المهام باستخدام الكلاس `Task` الذي يحتوي على خصائص اسم المهمة ووقت التنفيذ.
//
//الدالة `simulateRoundRobin` تستقبل طابورًا (Queue) ووحدة زمنية (timeQuantum) وتقوم بتنفيذ جدولة الدوران الدائري على المهام الموجودة في الطابور.
//
//أثناء التنفيذ، يتم استخراج المهمة الحالية من بداية الطابور باستخدام `queue.poll()` ويتم تنفيذ المهمة للوقت المحدد (وقت الكم الزمني) أو حتى انتهاء وقت المهمة إذا كانت أقل من الوقت المحدد. إذا كانت المهمة لا تزال تحتاج إلى وقت إضافي للانتهاء، يتم إعادة إضافتها إلى نهاية الطابور لاستكمالها في وقت لاحق.
//
//يتم تكرار هذه العملية حتى يتم إكمال جميع المهام في الطابور.
//
//يرجى ملاحظة أن هذا الكود هو مجرد محاكاة بسيطة وقد تحتاج إلى تعديلات إضافية حسب احتياجاتك، مثل إضافة آلية لإضافة المهام إلى الطابور.**//
