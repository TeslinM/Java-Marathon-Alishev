package day6;

public class Car {
    private int year;
    private String color;
    private String model;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int year) {
        int currentYear = 2022;
        System.out.println(currentYear - year);
        return currentYear - year;
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2018);
        car.setColor("white");
        car.setModel("Escape");

        System.out.println("Год выпуска: " + car.getYear());
        System.out.println("Цвет машины: " + car.getColor());
        System.out.println("Модель машины: " + car.getModel());

        car.info();
        car.yearDifference(car.year);
    }
}
