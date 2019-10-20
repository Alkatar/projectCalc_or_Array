public class Lollypop implements Sweets{
    String name;
    int price;
    int weight;
    String flavor;


public Lollypop(String name, int price, int weight, String flavor){
        this.name = name;
        this.price = price;
        this.weight =  weight;

        this.flavor = flavor;
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

public String getFlavor() {
        return flavor;
        }

public void setFlavor(String flavor) {
        this.flavor = flavor;
        }

        @Override
        public String toString() {
                return "Name:\n" + this.name + "\nPrice:\n" + this.price + "\nWeight:\n" + this.weight + "\nFlavor:\n" + this.flavor;
        }
}