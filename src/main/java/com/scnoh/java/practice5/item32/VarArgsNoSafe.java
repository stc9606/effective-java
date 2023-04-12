package com.scnoh.java.practice5.item32;

import java.util.concurrent.ThreadLocalRandom;

public class VarArgsNoSafe {
    public static void main(String[] args) {
        String[] attributes = pickTwo("좋은", "빠른", "저렴한");
    }

    // 자신의 제네릭 매개변수 배열의 참조를 노출 - 안전하지 않다.
    public static <T> T[] toArray(T... args) {
        return args;
    }

    public static <T> T[] pickTwo(T a, T b, T c) {
        switch(ThreadLocalRandom.current().nextInt(3)) {
            case 0: return toArray(a, b);
            case 1: return toArray(a, c);
            case 2: return toArray(b, c);
        }
        throw new AssertionError();
    }
}
