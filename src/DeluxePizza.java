public class DeluxePizza extends Pizza{

    public DeluxePizza(boolean isVeg) {
   super(isVeg);
   super.AddExtraCheese();
   super.AddExtraToppings();
    }
}
