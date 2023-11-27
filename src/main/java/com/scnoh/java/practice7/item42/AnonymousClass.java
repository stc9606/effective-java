package com.scnoh.java.practice7.item42;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparingInt;

public class AnonymousClass {

    public static void main(String[] args) {
        // Collections sort 함수가 익명클래스의 인스턴스를 함수 객체로 사용하는 대표적인 예시
        List<String> words = List.of("A", "C", "B", "E", "D");
        Collections.sort(words, new Comparator<String>() { // 함수형 인터페이스라고 부름.
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });

        // java 8 이후부터 함수형 인터페이스라 부르는 이 인터페이스들의 인스턴스를 람다식을 사용해 간결하게 코드를 작성할 수 있다.
        // 함수형 인터페이스라고 부름.
        Collections.sort(words, (o1, o2) -> Integer.compare(o1.length(), o2.length()));

        // 람다 자리에서 비교자 생성 메서드를 사용하여 코드를 더 간결하게 작성할 수 있다.
        Collections.sort(words, comparingInt(String::length)); // 메서드 레퍼런스

        // java 8때 List 인터페이스에 추가된 sort 메서드로 더 간결하게 할 수 있다
        words.sort(comparingInt(String::length));

    }
}
