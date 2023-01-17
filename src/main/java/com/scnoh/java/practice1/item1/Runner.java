package com.scnoh.java.practice1.item1;

public class Runner {

    public static void main(String[] args) {
        NutritionFacts build = new NutritionFacts.Builder(240, 8)
                .calories(100)
                .sodium(35)
                .carbohydrate(27)
                .build();
    }
}
