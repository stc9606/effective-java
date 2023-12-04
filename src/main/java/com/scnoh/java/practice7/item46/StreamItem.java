package com.scnoh.java.practice7.item46;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class StreamItem {

    public static void main(String[] args) {
        Map<String, String> freq = new HashMap<>();
        // 가장 흔한 단어 10개를 뽑아내는 파이프라인
        freq.keySet().stream()
                .sorted(comparing(freq::get).reversed())
                .limit(10)
                .collect(toList());


    }
}
