package day4;
/*
3. Заполнить двумерный массив (матрицу) случайными числами от 0 до 50. Размер
матрицы задать m=12 , n=8 (m - размерность по строкам, n- размерность по колонкам).
В консоль вывести индекс строки, сумма чисел в которой максимальна. Если таких
строк несколько, вывести индекс последней из них.
Пример сгенерированной матрицы(для простоты  m=3 ,  n=5 ):
3 2 1 5 7 // сумма - 18
1 2 5 6 2 // сумма - 16
3 4 9 6 4 // сумма - 26
Ответ: 2 (индекс строки, сумма чисел в которой максимальна)
 */

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[12][8];

        for(int i = 0; i < 12; i++) {
            for(int j = 0; j < 8; j++) {
                array[i][j] = (int) (Math.random() * 50);
            }
        }


        int maxSum = 0;
        int maxSumidx = 0;
        for(int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            if (sum >= maxSum) {
                maxSum = sum;
                maxSumidx = i;
            }
        }

        System.out.println(maxSumidx);
    }
}
