package day3;
/*
 Реализовать программу, которая пока работает, принимает на вход от пользователя
два числа - делимое и делитель. Для этих двух чисел программа рассчитывает
результат деления и выводит его в консоль. Программа останавливает свою работу
тогда, когда пользователь вводит 0 в качестве делителя.
(для этих вещественных чисел необходимо использовать тип double и метод
nextDouble() у Scanner’а соответственно).
Пример:
1 2 - ваш ввод в консоль
0.5 - ответ программы
100 77 - ваш ввод в консоль
1.2987012987012987 - ответ программы
3 0 - ваш ввод в консоль
работа программы завершается
 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите два числа");
        double delimoe = console.nextDouble();
        double delitel = console.nextDouble();

        if(delimoe == 0 || delitel == 0) {
            System.exit(0);
        }

        double result = delimoe/delitel;
        System.out.println(result);
    }
}
