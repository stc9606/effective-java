package com.scnoh.java.practice1.item1;

public class Calzone extends Pizza {
    private final boolean sauceInside;

    public static class Builder extends Pizza.Builder<Builder> {
        private boolean sauceInside = false; // 기본 값

        public Builder sauceInside() {
            this.sauceInside = true;
            return this;
        }

        @Override
        public Pizza build() {
            return new Calzone(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    Calzone(Builder builder) {
        super(builder);
        this.sauceInside = builder.sauceInside;
    }
}
