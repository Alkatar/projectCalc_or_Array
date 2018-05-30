import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        Scanner m = new Scanner(System.in);
        Scanner n = new Scanner(System.in);

        while (true) {
            // Ввод типа операции
            System.out.println("Input operation type: 1 - Addition, 2 - Subtraction, 3 - Multiplication, 4 - Division, 5 - Exit");
            int c = n.nextInt();
            if (c==5) return;
            // Ввод чисел
            System.out.println("Input first number:");
            double a = l.nextDouble();
            System.out.println("Input second number:");
            double b = m.nextDouble();

            // Выбор операции в зависимости от введенной цифры
            switch (c) {
                case 1:
                    double x = a + b;
                    System.out.printf("Sum = %.4f\n", x);
                    break;
                case 2:
                    double y = a - b;
                    System.out.printf("Difference = %.4f\n", y);
                    break;
                case 3:
                    double w = a * b;
                    System.out.printf("Product = %.4f\n", w);
                    break;
                case 4:
                    double z = a / b;
                    System.out.printf("Quotient = %.4f\n", z);
                    break;
                default:
                    System.out.println("Unknown operation.");
            }
        }
    }
}
