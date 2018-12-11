package pizzashop;

import pizzashop.menu.Pizza;
import java.util.*;

import com.sun.imageio.stream.StreamCloser.CloseAction;

public class App{
    public static void main (String[] args){
        int size = 12;
        String crust = "thin";
        
        Pizza cheesePizza; //Pizza is now a datatype a declaration of class pizza. only in stack
        cheesePizza = new Pizza(size, crust, "Cheese", " Tomato Sauce");// now in the heap
        Pizza peperoniPizza;
        peperoniPizza = new Pizza(size, crust, "Cheese", " Tomato Suace", " Peperoni");

        System.out.println(cheesePizza.toString());
        System.out.println(peperoniPizza.toString());
        scanner.close();
      
    }
}