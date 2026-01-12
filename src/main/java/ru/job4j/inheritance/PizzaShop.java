package ru.job4j.inheritance;

public class PizzaShop {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        PizzaExtraCheese pizzaExtraCheese = new PizzaExtraCheese();
        PizzaExtraCheeswExtraTomato pizzaExtraCheeswExtraTomato = new PizzaExtraCheeswExtraTomato();
        System.out.println(pizza.name());
        System.out.println(pizzaExtraCheese.name());
        System.out.println(pizzaExtraCheeswExtraTomato.name());
    }
}
