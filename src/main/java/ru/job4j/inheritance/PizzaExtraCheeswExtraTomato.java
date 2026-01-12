package ru.job4j.inheritance;

public class PizzaExtraCheeswExtraTomato extends PizzaExtraCheese {

    @Override
    public String name() {
        return super.name() + " + " + "extra tomato";
    }
}
