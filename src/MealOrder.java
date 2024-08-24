public class MealOrder {
    private Meal meal;
    private Item drink;

    public MealOrder() {
        Item baseMeal = new Item("BASE MEAL",5000.00);
        this.meal = new Meal(baseMeal);
       }   

       public void addExtras(String[] extras) {
        Item[] items = new Item[extras.length];
        for (int i = 0; i <extras.length; i++) {
            switch (extras[i].toUpperCase()) {
                case "SAYUR":
                    items[i] = new Item("SAYUR", 3000.00);
                    break;
                case "IKAN":
                    items[i] = new Item("IKAN", 5000.00);
                    break;
                case "Tahu":
                    items[i] = new Item("TAHU", 2000.00);
                    break;
                default:
                    items[i] = new Item("UKNOWN", 0.00);
                    break;
                
            }
        }
        meal.addExtras(items);
       }
}



   

       
