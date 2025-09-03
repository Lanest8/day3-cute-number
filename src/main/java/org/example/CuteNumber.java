package org.example;

import java.util.Arrays;

public class CuteNumber {
    public static void main(String[] args) {
        int[] numbers = new int[]{5, 3, 8, 1, 20};
        System.out.println(isGreaterThan10(findFirstEvenNumber(sortAllNumbers(numbers))));
    }

    public static int[] sortAllNumbers(int[] numbers) {
         return Arrays.stream(numbers)
                 .boxed()
                 .sorted((a, b) -> b - a)
                 .mapToInt(Integer::intValue)
                 .toArray();
    }

    public static int findFirstEvenNumber(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .findFirst()
                .orElse(-1);
    }

    public static boolean isGreaterThan10(int number) {
        return number > 10;
    }
}