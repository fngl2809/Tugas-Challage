public class Meal {
    private Item baseMeal;
    private Item[] extras;

    public Meal(Item baseMeal) {
        this.baseMeal = baseMeal;
        this.extras = new Item[0];
    }

    public void addExtras(Item[] extras) {
        this.extras = extras;
    }

    public double getTotalPrice() {
        double total = baseMeal.getPrice();
        for (Item extra : extras) {
            total += extra.getPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(baseMeal.toString() + "\n");
        for (Item extra : extras) {
            result.append(extra.toString()).append("\n");
        }
        return result.toString();
    }
}