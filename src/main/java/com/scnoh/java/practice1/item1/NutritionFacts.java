package com.scnoh.java.practice1.item1;

public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder {
        // 필수 매개변수
        private final int servingSize;
        private final int servings;

        // 선택 매개변수
        private int calories;
        private int fat;
        private int sodium;
        private int carbohydrate;

        public Builder (int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories (int val) {
            this.calories = val;
            return this;
        }

        public Builder fat (int val) {
            this.fat = val;
            return this;
        }

        public Builder sodium (int val) {
            this.sodium = val;
            return this;
        }

        public Builder carbohydrate (int val) {
            this.carbohydrate = val;
            return this;
        }

        public NutritionFacts build () {
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts (Builder builder) {
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
        this.carbohydrate = builder.carbohydrate;
    }
}
