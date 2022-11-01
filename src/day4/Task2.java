package day4;
/*
Создать новый массив размера 100 и заполнить его случайными числами из
диапазона от 0 до 10000.
Затем, используя циклы for each вывести:
- наибольший элемент массива
- наименьший элемент массива
- количество элементов массива, оканчивающихся на 0
- сумму элементов массива, оканчивающихся на 0
Использовать сортировку запрещено.
 */

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for(int x = 0; x < array.length; x++) {
            array[x] = 0 + (int) (Math.random() * 10000);
        }

        System.out.println(Arrays.toString(array));
        int max = array[0];
        int min = array[0];
        int kratno10 = 0;
        int sum = 0;

        for(int number : array) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println(max);

        for(int number : array) {
            if(number < min) {
                min = number;
            }
        }
        System.out.println(min);

        for(int number : array) {
            if (number % 10 == 0) {
                kratno10++;
            }
        }
        System.out.println(kratno10);

        for(int number : array) {
            if (number % 10 == 0) {
                sum = sum + number;
            }
        }

        System.out.println(sum);

    }
}
