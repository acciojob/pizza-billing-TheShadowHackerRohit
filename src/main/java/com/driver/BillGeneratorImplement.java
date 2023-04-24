package com.driver;

public class BillGeneratorImplement implements BillGenerator{
    @Override
    public String getBill(Pizza pizza) {
        String tempBill = "";
        tempBill = "Base Price Of The Pizza: "+ pizza.getBasePrice() +"\n";
        if(pizza.getCheeseAdded()){
            tempBill += "Extra Cheese Added: "+ pizza.getCheesePrice() + "\n";
        }
        if(pizza.getExtraTopping()){
            tempBill +=  "Extra Toppings Added: "+ pizza.getToppingPrize()+"\n";
        }
        if(pizza.getTakeAway()){
            tempBill += "Paperbag Added: "+ pizza.getTakeAwayPrice() +"\n";
        }
        tempBill += "Total Price: " + pizza.getPrice() +"\n";
        return tempBill;
    }
}
