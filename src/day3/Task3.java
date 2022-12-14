package day3;
/*
Реализовать программу, которая 5 раз запрашивает от пользователя два числа -
делимое и делитель. Для этих двух чисел программа рассчитывает результат деления
и выводит его в консоль. Если пользователь вводит 0 в качестве делителя, вместо
того, чтобы останавливать работу цикла принудительно, мы пропускаем итерацию и
выводим в консоль сообщение “Деление на 0”.
Ключевое слово else использовать в этой программе нельзя.
Пример:
4 2 - ваш ввод в консоль
2.0 - ответ программы
100 0 - ваш ввод в консоль
Деление на 0 - ответ программы
13 10 - ваш ввод в консоль
1.3 - ответ программы
и так далее… (еще 2 итерации)
 */

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        for(int i = 0; i < 5; i++) {
            System.out.println("Введие 2 числа");
            double delimoe = console.nextDouble();
            double delitel = console.nextDouble();

            switch ((int) delitel) {
                case 0:
                    System.out.println("Деление на 0");
                    break;
                default:
                    System.out.println(delimoe / delitel);
            }
        }
    }
}
