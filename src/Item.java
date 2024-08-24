public class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name.toUpperCase();
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override 
    public String toString() {
        return String.format("%-10s:%.2f", name, price);
    } 

}
