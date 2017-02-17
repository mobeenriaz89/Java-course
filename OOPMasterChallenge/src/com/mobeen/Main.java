package com.mobeen;


class Hamburger {
    private String burgerName;
    private String breadRoleType;
    private String meat;
    private float price;
    private float totalPrice;
    private int itemCounter = 0;

    private static String[] ItemNames = new String[6];

    private float[] ItemPrices = new float[6];

    public Hamburger(String newburgerName, String breadRoleType, String meat, float price) {
        burgerName = newburgerName;
        this.breadRoleType = breadRoleType;
        this.meat = meat;
        this.price = price;
        totalPrice = this.price;
    }

    public String getBurgerName() {
        return burgerName;
    }

    public void addItem(String itemName, float itemPrice) {
        int itemLimit = 0;
        switch (burgerName) {
            case "Hamburger":
                itemLimit = 4;
                break;
            case "Healthy burger":
                itemLimit = 6;
                break;

            case "Deluxe Burger":
                itemLimit = 2;
                break;

        }
        if (itemCounter < itemLimit) {
            ItemNames[itemCounter] = itemName;
            ItemPrices[itemCounter] = itemPrice;
            System.out.println(itemName + " added to the burger");
            totalPrice += itemPrice;
            itemCounter++;
        } else {
            System.out.println("You cant add more then " + itemLimit + " additional items");
        }
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public float[] getItemPrices() {
        return ItemPrices;
    }

    public String[] getItemNames() {
        return ItemNames;
    }

    public int getItemCounter() {
        return itemCounter;
    }

    public String getBreadRoleType() {
        return breadRoleType;
    }

    public String getMeat() {
        return meat;
    }

    public float getPrice() {
        return price;
    }


}

class HealthyBurger extends Hamburger {

    public HealthyBurger(String meat, float price) {
        super("Healthy burger","Brown rye bread roll", meat, price);

    }



  /*  @Override
    public void addItem(String itemName, float itemPrice) {
        super.addItem(itemName, itemPrice);
    }*/
}
class deluxeHamburger extends Hamburger {

    public deluxeHamburger(String meat, float price) {
        super("Deluxe Burger","Brown rye bread roll", meat, price);
    super.addItem("chips",20);
    super.addItem("drink",30);
    }



    @Override
    public void addItem(String itemName, float itemPrice) {
        System.out.println("No additions allowed to Deluxe burger");
    }
}

public class Main {
    static Hamburger burger;
    public static void main(String[] args) {

        orderHamburger();
        System.out.println("\n*******************************************\n");
        orderHealthyBurger();
        System.out.println("\n*******************************************\n");

       orderDeluxeHamburger();
        System.out.println("\n*******************************************\n");


    }

    private static void orderDeluxeHamburger() {
       burger = new deluxeHamburger( "chicken", 200);
        burger.addItem("cheese", 20);


        System.out.println("Your burger is ready.\n Your order details are as follows:\n 1 " +
                "Burger name:" + burger.getBurgerName() +
                "(Bread:" + burger.getBreadRoleType() +
                ", Meat:" + burger.getMeat() +
                ") \nRs." + burger.getPrice() +
                "\nAdditions:" + burger.getItemCounter());
        for (int i = 0; i < burger.getItemCounter(); i++) {
            System.out.println(i + " Item name:" + burger.getItemNames()[i] +
                    " ,Item price:" + burger.getItemPrices()[i] + "\n");
        }
        System.out.println("Total payable amount:" + burger.getTotalPrice());
    }

    private static void orderHealthyBurger() {
         burger = new HealthyBurger("chicken", 200);
        burger.addItem("cheese", 20);
        burger.addItem("tomato", 20);
        burger.addItem("lettuce", 20);
        burger.addItem("carrot", 30);
        burger.addItem("potato", 20);
        burger.addItem("chips", 30);
        burger.addItem("drink", 20);

        System.out.println("Your burger is ready.\n Your order details are as follows:\n 1 " +
                "Burger name:" + burger.getBurgerName() +
                "(Bread:" + burger.getBreadRoleType() +
                ", Meat:" + burger.getMeat() +
                ") \nRs." + burger.getPrice() +
                "\nAdditions:" + burger.getItemCounter());
        for (int i = 0; i < burger.getItemCounter(); i++) {
            System.out.println(i + " Item name:" + burger.getItemNames()[i] +
                    " ,Item price:" + burger.getItemPrices()[i] + "\n");
        }
        System.out.println("Total payable amount:" + burger.getTotalPrice());
    }

    private static void orderHamburger() {
         burger = new Hamburger("Hamburger", "wheat","beef", 200);
        burger.addItem("cheese", 20);
        burger.addItem("tomato", 20);
        burger.addItem("lettuce", 20);
        burger.addItem("carrot", 30);
        burger.addItem("potato", 20);
        burger.addItem("chips", 30);
        burger.addItem("drink", 20);


        System.out.println("Your burger is ready.\n Your order details are as follows:\n 1 " +
                "Burger name:" + burger.getBurgerName() +
                "(Bread:" + burger.getBreadRoleType() +
                ", Meat:" + burger.getMeat() +
                ") \nRs." + burger.getPrice() +
                "\nAdditions:" + burger.getItemCounter());
        for (int i = 0; i < burger.getItemCounter(); i++) {
            System.out.println(i + " Item name:" + burger.getItemNames()[i] +
                    " ,Item price:" + burger.getItemPrices()[i] + "\n");
        }
        System.out.println("Total payable amount:" + burger.getTotalPrice());
    }
}
