package com.scnoh.java.practice1.item3;

import java.util.Objects;

public final class CaseInsensitiveString {
    private final String s;

    public CaseInsensitiveString(String s) {
        this.s = Objects.requireNonNull(s);
    }

    // equals 규약 대치성 위배 코드
    @Override
    public boolean equals(Object o) {
       if (o instanceof CaseInsensitiveString) {
           return s.equalsIgnoreCase(((CaseInsensitiveString) o).s);
        }

       if (o instanceof String) {
           return s.equalsIgnoreCase((String) o);
       }

       return false;
    }

    public static void main(String[] args) {
        CaseInsensitiveString cis = new CaseInsensitiveString("Test");
        String s = "test";

        // 명백한 대칭성 위배
        System.out.println(cis.equals(s)); // true 반환
        System.out.println(s.equals(cis)); // false


    }

}
