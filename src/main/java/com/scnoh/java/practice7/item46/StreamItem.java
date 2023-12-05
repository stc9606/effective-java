package com.scnoh.java.practice7.item46;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class StreamItem {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("stop");
        words.add("spot");
        words.add("trim");
        words.add("meet");
        words.add("ball");
        words.add("free");
        words.add("trim");
        words.add("meet");

        Map<String, Long> freq = new HashMap<>();
        // 스트림 패러다임을 이해하지 못한 채 API만 사용
        words.forEach(word -> freq.merge(word.toLowerCase(), 1L, Long::sum));

        // 스트림을 제대로 활용해 빈도표를 초기화한다.
//        freq = words.stream().collect(groupingBy(String::toLowerCase, counting()));

        System.out.println("words = " + words);
        System.out.println("freq = " + freq);

        // 가장 흔한 단어 10개를 뽑아내는 파이프라인
        List<String> collect = freq.keySet().stream()
                .sorted(comparing(freq::get).reversed())
                .limit(10)
                .collect(toList());
    }
}
