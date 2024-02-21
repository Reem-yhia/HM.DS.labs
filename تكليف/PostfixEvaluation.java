import java.util.Scanner;

public class PostfixEvaluation {
    public static double evaluatePostfix(String postfixExpression) {
        // تنفيذ مشابه للكود السابق
        return 0;
    }
        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);

            System.out.print("أدخل التعبير بصيغة البوستفيكس: ");
            String postfixExpression = scanner.nextLine();

            double result = evaluatePostfix(postfixExpression);

            System.out.println("تقييم التعبير: " + result);
        }
    }

