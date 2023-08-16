public class Pizza {
    private boolean isVeg;
    private int price;
    private int totalPrice;
    private String bill;
    private boolean addCheese;
    private boolean addToppings;
    private boolean takeAway;
    private boolean isBillGenerated;

    public Pizza() {
    }

    public Pizza(boolean isVeg) {
        this.isVeg = isVeg;

        if(isVeg){
            price = 300;
        }else{
            price=400;
        }
        totalPrice+=price;
        addCheese=false;
        addToppings=false;
        isBillGenerated = false;
        takeAway = false;
        bill="";
    }

    public void AddExtraCheese() {
  if(!addCheese){
      totalPrice+=80;
      addCheese=true;
  }
    }
    public void AddExtraToppings() {
if(!addToppings){
  if(isVeg){
      totalPrice+=70;
  }else{
      totalPrice+=120;
  }
   addToppings=true;
}
    }
    public void addTakeAway() {
if(!takeAway){
    totalPrice+=20;
    takeAway = true;
}
    }

    public String generateBill(){
 bill+="Base Price Of The Pizza:"+ price +"\n";
        if(addCheese){
            bill+="Extra Cheese Added: 80" + "\n";
        }
        if(addToppings){
         if(isVeg){
             bill+="Extra Toppings Added: 70"+"\n";
         }else{
             bill+="Extra Toppings Added: 120" + "\n";
         }
        }
        if(takeAway){
           bill+="Paperbag Added: 20" + "\n";
        }
        bill+= "Total Price:" + totalPrice +"\n";
        return bill;
    }
}
