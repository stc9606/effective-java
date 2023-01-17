package com.scnoh.java.practice1.item2;

public class Elvis {

    private static final Elvis INSTANCE = new Elvis();

    // 정적 메소드
    public static Elvis getInstance() {
        return INSTANCE;
    }

    private Elvis () {

    }
}
