package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        double[] numbers = {15.4, 13.2, 1.4, -3.4, 5.6, 9.2, 11.1, -4.2, 5.5, 14.1, -11.1, 14.2, 13.3, 15.6};
        int numberCount = 0;
        double allNumber = 0.0;
        boolean proverka = false;

        for (double cast : numbers) {
            if (cast < 0) {
                proverka = true;
            } else if (cast > 0 && proverka) {
                numberCount++;
                allNumber += cast;
                System.out.println(cast);
            }
        }

        System.out.println("Среднее арифметическое = " + allNumber / numberCount);

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    double temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(numbers));
        }


    }
}
