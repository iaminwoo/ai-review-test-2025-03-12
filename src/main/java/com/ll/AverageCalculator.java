package com.ll;

public class AverageCalculator {

    public static double calculateAverage(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0.0; // 예외 처리 추가
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return (double) sum / numbers.length; // 형변환 추가
    }

    public static void main(String[] args) {
        int[] myList = {1, 2, 3, 4, 5};
        double average = calculateAverage(myList);
        System.out.println("Average: " + average);
    }
}
