package com.scnoh.java.practice1.item2;

public class Tom {

    private static Tom INSTANCE;

    private Tom () {}

    // single checked locking
    public static synchronized Tom getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Tom();
        }
        return INSTANCE;
    }

    // double checked locking
    public static Tom getSyncInstance() {
        if (INSTANCE == null) {
            synchronized (Tom.class) { // blocking 성능 저하 고려.
                if (INSTANCE == null) {
                    INSTANCE = new Tom();
                }
            }
        }
        return INSTANCE;
    }

}
