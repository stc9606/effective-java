package com.scnoh.java.practice1.item2;

// Bill Pugh Singleton Implementaion
public class Son {
    private Son () {}

    private static class SonHelper {
        private static final Son INSTANCE = new Son();
    }

    public static Son getInstance() {
        return SonHelper.INSTANCE;
    }

}
