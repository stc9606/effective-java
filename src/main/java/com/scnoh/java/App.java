package com.scnoh.java;

import com.scnoh.java.item1.Calzone;
import com.scnoh.java.item1.NyPizza;
import com.scnoh.java.item1.Pizza;
import com.scnoh.java.item2.Elvis;

import static com.scnoh.java.item1.NyPizza.Size.LARGE;
import static com.scnoh.java.item1.Pizza.Topping.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        Pizza pizza = new NyPizza.Builder(LARGE)
                .addTopping(HAM).addTopping(ONION).build();

        new Calzone.Builder()
                .addTopping(HAM).addTopping(PEPPER)
                .sauceInside().build();

        // 싱글 턴 객체
        Elvis elvis = Elvis.getInstance();
    }
}