package com.scnoh.java.practice7.item43;

public class MethodReference {

    /**
     * TODO 메서드 참조의 다섯 가지 유형 정리
     *
     *
     * 메서드 참조는 람다의 간단명료한 대안이 될 수 있다. 메서드 참조 쪽이 짧고 명확하다면 메서드 참조를 쓰고,
     * 그렇지 않을 때만 람다를 사용하라.
     */

    /**
     * TODO 정적 메서드 참조
     *
     * Integer::parseInt - 메서드 참조
     *
     * str -> Integer.parseInt(str) - 람다
     */

    /**
     * TODO 한정적 (인스턴스)
     *
     * Instant.now()::isAfter - 메서드 참조
     *
     * Instant then = Instant.now();
     * t -> then.isAfter(t)
     */

    /**
     * TODO 비한정적 (인스턴스)
     *
     * String::toLowerCase - 메서드 참조
     *
     * str -> str.toLowerCase()
     */

    /**
     * TODO 클래스 생성자
     *
     * TreeMap<K,V>::new
     *
     * () -> new TreeMap<K, V>()
     */

    /**
     * TODO 배열 생성자
     *
     * int[]::new
     *
     * len -> new int[len]
     */


}
