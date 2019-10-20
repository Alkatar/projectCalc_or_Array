public class Jellybean implements Sweets{

    String name;
    int price;
    int weight;

    String color;

    public Jellybean(String name, int price, int weight, String color){
        this.name = name;
        this.price = price;
        this.weight =  weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "\nName: " + this.name + "\nPrice: " + this.price + "\nWeight: " + this.weight + "\nColor: " + this.color;
    }

}