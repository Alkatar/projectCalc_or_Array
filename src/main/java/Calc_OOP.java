import java.util.Scanner;

public class Calc_OOP {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)  {
        try {
            double num1 = getDouble();
            double num2 = getDouble();
            char operation = getOperation();
            while (operation != '+' & operation != '-' & operation != '/' & operation != '*')
            {
                operation = getOperation();
            }
            double result = calc(num1, num2, operation);
            System.out.printf("Результат операции:\n%.4f", result);

        } catch (Exception ie)
        {
            System.out.println(ie.getMessage());
        }

    }

    public static double getDouble() {
        System.out.println("Введите число:");
        double num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();
            num = getDouble();
        }
        return num;
    }

    public static char getOperation(){
        System.out.println("Введите операцию:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static double calc(double num1, double num2, char operation)  throws Exception {

        double result=0;

            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result  = num1 / num2;
                    if (num2==0) throw new Exception("Деление на ноль запрещено!");
                    break;
            }
        return result;
    }
}
