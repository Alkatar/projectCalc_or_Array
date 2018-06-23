import java.util.Scanner;

public class Array {
    public static void main(String[]args){
        System.out.println("Введите размер массива ");
        Scanner a = new Scanner(System.in);
        int arrSize = a.nextInt();
        String mas []=new String[arrSize];
        Scanner in = new Scanner(System.in);
        for (int i=0; i<arrSize; i++){
            System.out.println("Введите следующую строку ");
            mas[i]=in.nextLine();
        }

        int max=mas[0].length();
        int maxi=0;
        for (int i=0; i<arrSize; i++){
            if (mas[i].length()>max){
                max=mas[i].length();
                maxi=i;
            }
        }
        System.out.println("Самое большое слово в массиве это '" + mas[maxi]+ "'. Оно состоит из " + max + " букв");

    }
}