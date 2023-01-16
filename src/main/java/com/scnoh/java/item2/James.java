package com.scnoh.java.item2;

public class James {

    private static James INSTANCE;

    private James () {};

    static {
        try {
            INSTANCE = new James();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static James getInstance() {
        return INSTANCE;
    }

}
