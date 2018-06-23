
public class Gift {

    public static class Candy {
        static String name = "Батончики Рот-Фронт";
        static int weight = 100;
        static double price = 34.2;
        static String manufacturer = "Рот-Фронт";

    }

    public static class JellyBelly {
        static String name = "Jelly Belly Ассорти";
        static int weight = 50;
        static  int price = 155;
        static String manufacturer = "Jelly Belly Candy Company";
    }

    public static class Chocolate {
        static String name = "Аленка";
        static int weight = 100;
        static int price = 76;
        static String manufacturer = "Красный Октябрь";
    }

    public static class Lollipop {
        static String name = "Charles Berger";
        static int weight = 200;
        static int price = 193;
        static String manufacturer = "Cebe Bonbon GmbH.";
    }

    public static void main(String[] args) {
        String GiftName  = "6 "+Candy.name + ", 4 драже " + JellyBelly.name + ", 2 шоколадки "+Chocolate.name+", 2 упаковки леденцов " + Lollipop.name;
        System.out.println("Подарок состоит из:\n" + GiftName +'\n');
        int GiftWeight = 6*Candy.weight + 4*JellyBelly.weight + 2*Chocolate.weight + 2*Lollipop.weight;
        System.out.println("Общий вес подарка в граммах:\n" + GiftWeight+'\n');
        double GiftPrice = 6*Candy.price + 4*JellyBelly.weight + 2*Chocolate.weight + 2*Lollipop.weight;
        System.out.printf("Общая цена подарка в рублях:\n %.2f\n", GiftPrice);
        String GiftMan  = Candy.manufacturer + ", " + JellyBelly.manufacturer + ", "+Chocolate.manufacturer+", " + Lollipop.manufacturer;
        System.out.println("В составе подарка продукция следующих производителей:\n" + GiftMan +'\n');
    }
}
