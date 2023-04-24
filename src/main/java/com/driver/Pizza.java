package com.driver;

public class Pizza {

    private int price;// final price
    private Boolean isVeg;
    private  Boolean isCheeseAdded;
    private Boolean isExtraTopping;
    private  Boolean isTakeAway;
    private String bill;

    private BillGeneratorImplement billGenerator;
    private  int basePrice ;
    private  int vegBasePrice = 300;
    private  int nonVegBasePrice = 400;
    private int cheesePrice = 80;
    private int toppingPrize;
    private  int vegToppingPrice = 70;
    private  int nonVegToppingPrice = 120;

    private int takeAwayPrice = 20;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        basePrice = getBasePrice();
        price += basePrice;
        isCheeseAdded = false;
        isExtraTopping = false;
        isTakeAway = false;
        this.billGenerator = new BillGeneratorImplement();
    }

    public int getPrice(){
        return this.price;
    }

    public Boolean getVeg() {
        return isVeg;
    }

    public Boolean getCheeseAdded() {
        return isCheeseAdded;
    }

    public Boolean getExtraTopping() {
        return isExtraTopping;
    }

    public Boolean getTakeAway() {
        return isTakeAway;
    }

    public int getVegBasePrice() {
        return vegBasePrice;
    }

    public int getNonVegBasePrice() {
        return nonVegBasePrice;
    }

    public int getCheesePrice() {
        return cheesePrice;
    }

    public int getToppingPrize() {
        return toppingPrize;
    }

    public int getVegToppingPrice() {
        return vegToppingPrice;
    }

    public int getNonVegToppingPrice() {
        return nonVegToppingPrice;
    }

    public int getTakeAwayPrice() {
        return takeAwayPrice;
    }

    public int getBasePrice(){
        return isVeg ? vegBasePrice : nonVegBasePrice;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded == false){
            isCheeseAdded = true;
            price +=  cheesePrice;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isExtraTopping == false){
            isExtraTopping = true;
            if(isVeg){
                toppingPrize = vegToppingPrice;
                price += vegToppingPrice;
            }
            else{
                toppingPrize = nonVegToppingPrice;
                price += nonVegToppingPrice;
            }
            //price += toppingPrize;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isTakeAway==false){
            isTakeAway = true;
            price += takeAwayPrice;
        }
    }

    public String getBill(){
        // your code goes here
        String bill = billGenerator.getBill(this);
        this.bill = bill;
        return this.bill;
    }
}
