package com.scnoh.java.practice1.item1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StaticFactory {

    /**
     * TODO 정적 팩토리 메소드 사용 예
     */

    public static void main(String[] args) {
        String s = new String("hello construct");
        String ss = String.valueOf("hello method");
        List<String> str = new ArrayList<>();
        str.stream().collect(Collectors.groupingBy())

    }
}
