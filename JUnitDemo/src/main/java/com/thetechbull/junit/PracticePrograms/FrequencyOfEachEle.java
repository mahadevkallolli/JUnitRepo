package com.thetechbull.junit.PracticePrograms;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachEle {

    public static void main(String[] args) {
        String string = "java";
        Map<Character, Long> map = string.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        map.entrySet().stream().filter(e -> e.getValue() > 1).forEach(System.out::println);

    }

    public static Map freqOfEachEle() {
        return null;
    }

}
