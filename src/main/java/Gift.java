import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Gift {
        public static void main(String[] args) throws IOException {
            prepareGift();
        }

    public static void prepareGift() throws IOException {
        ArrayList<Sweets> sweets = new ArrayList<>();
        boolean formed = false;
        int totalPrice = 0;
        int totalWeight = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Нажмите соответствующую цифру, чтобы добавить сладость в подарок:");
        System.out.println("'1' - конфеты \"Рот-Фронт\"");
        System.out.println("'2' - конфеты \"Ласточка\"");
        System.out.println("'3' - леденец \"Чупа-чупс\"");
        System.out.println("'4' - драже \"Jellybean\"");
        System.out.println("'5' - закончить выбор");
        while (!formed) {

            String choice = reader.readLine();

            switch (choice) {
                case "1":
                    Candy candyRF = new Candy("Конфеты \"Рот-Фронт\"", 105, 100, "Цилиндрической формы");
                    sweets.add(candyRF);
                    totalPrice += candyRF.getPrice();
                    totalWeight += candyRF.getWeight();
                    System.out.println("Конфеты \"Рот-Фронт\" добавлены в подарок");
                    break;
                case "2":
                    Candy martlet  = new Candy("Конфеты \"Ласточка\"", 125, 150, "Прямоугольной формы");
                    sweets.add(martlet );
                    totalPrice += martlet.getPrice();
                    totalWeight += martlet.getWeight();
                    System.out.println("Конфеты \"Ласточка\" добавлены в подарок");
                    break;
                case "3":
                    Lollypop chups = new Lollypop("Леденец \"Чупа-чупс\"", 35, 50, "Со вкусом апельсина");
                    sweets.add(chups);
                    totalPrice += chups.getPrice();
                    totalWeight += chups.getWeight();
                    System.out.println("Леденец \"Чупа-чупс\" добавлен в подарок");
                    break;
                case "4":
                    Jellybean bean = new Jellybean("Драже \"Jellybean\"", 177, 50, "Зеленого цвета");
                    sweets.add(bean);
                    totalPrice += bean.getPrice();
                    totalWeight += bean.getWeight();
                    System.out.println("Драже \"Jellybean\" добавлены в подарок");
                    break;
                case "5":
                    formed = true;
                    break;
            }


        }
            System.out.println(sweets);

        System.out.println(String.format("\nОбщий вес подарка: %s гр.\nОбщая цена подарка: %s руб.", totalWeight, totalPrice));
    }

}