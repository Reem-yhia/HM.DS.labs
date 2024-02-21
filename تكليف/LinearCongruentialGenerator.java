public class LinearCongruentialGenerator {

        private static final int a = 12;
        private static final int b = 5;
        private static final int n = 100;

        public static void main(String[] args) {
            int cur = 92; // القيمة الأولية (البذرة)

            for (int i = 0; i < 5; i++) {
                int next = (a * cur + b) % n;
                System.out.println(next);
                cur = next;
            }
        }
    }



