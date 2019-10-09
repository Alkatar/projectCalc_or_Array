import java.util.Scanner;

import static jdk.nashorn.internal.objects.Global.Infinity;

public class Calc_OOP {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        double num1 = getDouble();
        double num2 = getDouble();
        char operation = getOperation();
        double result = 0;
        result = calc(num1, num2, operation);

        System.out.printf("Результат операции:\n%.4f", result);
    }

    public static double getDouble(){
        System.out.println("Введите число:");
        double num;
        if(scanner.hasNextDouble()){
            num = scanner.nextDouble();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();//рекурсия
            num = getDouble();
        }
        return num;
    }

    public static char getOperation(){
        System.out.println("Введите одну из операций - *, /, +, -");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();//рекурсия
            operation = getOperation();
        }
        return operation;
    }

    public static double calc(double num1, double num2, char operation)  {

        double result;

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
                    try {
                        if (num2 == 0)
                            {
                                throw new Exception("Деление на ноль запрещено!");

                            } else
                            {
                                result  = num1 / num2;
                                break;
                            }
                        }
                    catch(Exception ex)
                        {
                            System.out.println(ex.getMessage());

                        }
                default:
                    if (num2 == 0) {
                        result = Infinity;
                        break;
                    }
                    System.out.println("Операция не распознана. Введите одну из операций - *, /, +, -");
                    result = calc(num1, num2, getOperation());//рекурсия
            }
        return result;
    }
}
