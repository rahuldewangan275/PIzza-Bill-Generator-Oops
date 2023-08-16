public class Main {
    public static void main(String[] args) {
Pizza vegPizza = new Pizza(true);
Pizza nonVegPizza = new Pizza(false);

// veg pizza
vegPizza.AddExtraCheese();
vegPizza.AddExtraToppings();
vegPizza.addTakeAway();
System.out.println(vegPizza.generateBill());

//non veg pizza

nonVegPizza.AddExtraToppings();
nonVegPizza.addTakeAway();
System.out.println(nonVegPizza.generateBill());

// deluxe pizza
        DeluxePizza deluxePizza = new DeluxePizza(true);
        System.out.println(deluxePizza.generateBill());
    }
}