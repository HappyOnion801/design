package factory;

public abstract class Pizza {
    public String name;
    public abstract void prapare();
    public void bake(){
        System.out.println(name + " : baking");
    }
    public void cut(){
        System.out.println(name + " : cutting");
    }
    public void box(){
        System.out.println(name + " : boxing");
    }
}

class BJCheesePizza extends Pizza{
    public BJCheesePizza(String name){
        this.name = name;
    }
    @Override
    public void prapare() {
        System.out.println(name + " : prapareing");
    }
}

class BJGreekPizza extends Pizza{
    public BJGreekPizza(String name){
        this.name = name;
    }
    @Override
    public void prapare() {
        System.out.println(name + " : prapareing");
    }
}

class LDCheesePizza extends Pizza{
    public LDCheesePizza(String name){
        this.name = name;
    }
    @Override
    public void prapare() {
        System.out.println(name + " : prapareing");
    }
}

class LDGreekPizza extends Pizza{
    public LDGreekPizza(String name){
        this.name = name;
    }
    @Override
    public void prapare() {
        System.out.println(name + " : prapareing");
    }
}