public class Meal
{
    //Instance attributes//
    private String name;
    private double cost;

    //Class constructor//
    public Meal(String food, double price)
    {
        name = food;
        cost = price;
    }

    public void makeItACombo() {
        name = name + " with fries and soda";
        cost += 3;

    //Instance methods//
   /* Complete the method makeItACombo */}
    public String getBill() {
        return name + ", $" + cost;


   /* Complete the method getBill */}
    public static void main(String[] args) {
        Meal meal = new Meal("Hamburguesa", 6.99);
        meal.makeItACombo();
        System.out.println(meal.getBill());
    }

}