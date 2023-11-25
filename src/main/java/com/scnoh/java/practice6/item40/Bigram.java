package com.scnoh.java.practice6.item40;

import java.util.HashSet;
import java.util.Set;

public class Bigram {

    private final char first;
    private final char second;

    public Bigram(char first, char second) {
        this.first = first;
        this.second = second;
    }

    /**
     * 1. @Override를 명시하지 않으면 재정의 한 게 아니라 "다중정의" 한 것.
     * 2. equals를 재정의하려면 매개변수는 Object 이어야 한다.
     *
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Bigram)) // 반드시 타입 체크를 하자.
            return false;

        Bigram b = (Bigram) o;
        return b.first == first && b.second == second;
    }

    // equals를 재정의 했다면, hashCode도 반드시 재정의해주자. (item10)
    public int hashCode() {
        return 31 * first + second;
    }

    public static void main(String[] args) {
        Set<Bigram> s = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            for (char ch = 'a'; ch <= 'z'; ch++)
                s.add(new Bigram(ch, ch));
        }
        System.out.println(s.size());
    }

}
