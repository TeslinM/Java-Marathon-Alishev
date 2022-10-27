package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int floor = console.nextInt();
        if(floor <= 0) {
            System.out.println("Некорректный ввод");
        }
         else if(floor >= 1 && floor < 5) {
            System.out.println("Малоэтажный дом");
        }
         else if (floor > 4 && floor < 9) {
            System.out.println("Среднеэтажный дом");
        }
         else if(floor > 8) {
            System.out.println("Многоэтажный дом");
        }
    }
}
