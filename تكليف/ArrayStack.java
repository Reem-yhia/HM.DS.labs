public class ArrayStack<T> implements Cloneable {
        private T[] stack; // مصفوفة تخزين العناصر
        private int top; // المؤشر على أعلى الكومة
        public ArrayStack() {
            // البناء الأولى للكومة
        }
        @Override
        public ArrayStack<T> clone() {
            try {
                @SuppressWarnings("unchecked")
                ArrayStack<T> clonedStack = (ArrayStack<T>) super.clone();
                // إنشاء نسخة عميقة من المصفوفة
                clonedStack.stack = stack.clone();
                return clonedStack;
            } catch (CloneNotSupportedException e) {
                // لن يتم رمي الاستثناء في هذا السياق
                return null;
            }
        }
    }

