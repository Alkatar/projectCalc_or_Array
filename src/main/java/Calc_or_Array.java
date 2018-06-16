import java.util.Scanner;

public class Calc_or_Array {
    public static void main(String[] args) {
        System.out.println("Calc/Array[1/2]: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n == 1)
        {
            System.out.print("Using Calc\n");
            Calc.main(args);
        }
        else if (n == 2)
        {
            System.out.print("Using Array\n");
            Array.main(args);
        }
        else
        {
            System.out.print("Incorrect input\n");
        }
    }
}