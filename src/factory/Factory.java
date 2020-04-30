package factory;

public abstract class Factory {
    public abstract Pizza createPizza(String type);
}

class BJFactory extends Factory{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        if("Greek".equals(type)) pizza = new BJCheesePizza("BJCheesePizza");
        else if("Cheese".equals(type)) pizza = new BJCheesePizza("BJCheesePizza");
        else pizza = null;
        return pizza;
    }
}

class LDFactory extends Factory{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        if("Greek".equals(type)) pizza = new LDCheesePizza("LDGreekPizza");
        else if("Cheese".equals(type)) pizza = new LDCheesePizza("LDCheesePizza");
        else pizza = null;
        return pizza;
    }
}
