package factory;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while(true){
            System.out.print("\nPlease input pizza type: ");
            Pizza pizza = new BJFactory().createPizza(cin.nextLine());
            if(pizza == null) break;
            pizza.prapare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
    }
}
