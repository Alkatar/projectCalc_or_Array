public class Candy implements Sweets{

    String name;
    int price;
    int weight;

    String form;

    public Candy(String name, int price, int weight, String form){
        this.name = name;
        this.price = price;
        this.weight =  weight;
        this.form = form;
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

    public String getForm() {
        return form;
    }

    public void setForm(String smell) {
        this.form = smell;
    }
    @Override
    public String toString() {
        return "\nName: " + this.name + "\nPrice: " + this.price + "\nWeight: " + this.weight + "\nForm: " + this.form;
    }

}