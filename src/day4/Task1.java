package day4;
/*
1. С клавиатуры вводится число n - размер массива. Необходимо создать массив
указанного размера и заполнить его случайными числами от 0 до 10. Затем вывести
содержимое массива в консоль, а также вывести в консоль информацию о:
а) Длине массива
б) Количестве чисел больше 8
в) Количестве чисел равных 1
г) Количестве четных чисел
д) Количестве нечетных чисел
е) Сумме всех элементов массива
Пример:
Введено число 10. Сгенерирован следующий массив:
[4, 8, 4, 9, 5, 2, 2, 3, 3, 6]
Информация о массиве:
Длина массива: 10Количество чисел больше 8: 1
Количество чисел равных 1: 0
Количество четных чисел: 6
Количество нечетных чисел: 4
Сумма всех элементов массива: 46
 */

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int[] array = new int[n];

        for(int i = 0; i < array.length; i++) {
            array[i] = 0 + (int) (Math.random() * 11);
        }
        System.out.println(Arrays.toString(array));

        int count8 = 0;
        int count1 = 0;
        int countChet = 0;
        int countNeChet = 0;
        int sum = 0;
        System.out.println("Длина массива: " + array.length);
        
        for(int i = 0; i < array.length; i++) {
            if(array[i] > 8) {
                count8++;
            }
        }
        System.out.println("Количество чисел больше 8: " + count8);

        for(int i = 0; i < array.length; i++) {
            if(array[i] == 1) {
                count1++;
            }
        }
        System.out.println("Количество чисел равных 1: " + count1);

        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                countChet++;
            }
        }
        System.out.println("Количество четных числе: " + countChet);

        for(int i = 0; i < args.length; i++) {
            if(array[i] % 2 != 0) {
                countNeChet++;
            }
        }
        System.out.println("Количество нечетных чисел: " + countNeChet);

        for(int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        System.out.println("Сума всех элементов массива: " + sum);
     }
}
