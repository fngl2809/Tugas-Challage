public class App {
    public static void main(String[] args) {
        MealOrder regularMeal = new MealOrder();
        String[] lauk = {"SAYUR", "IKAN", "TAHU"};
        regularMeal.addExtras(lauk);
        regularMeal.setDrinkSize("LARGE");
        
        //Print the receipt
        regularMeal.printReceipt();
    }
}
