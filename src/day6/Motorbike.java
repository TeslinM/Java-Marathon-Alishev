package day6;

public class Motorbike {
    private int year;
    private String color;
    private String model;

    public Motorbike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public int getName() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int year) {
        int currentYear = 2022;
        int difference = (currentYear - year);
        System.out.println(difference);
        return 0;
    }

    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(1991, "Green", "Davidson");
        System.out.println(motorbike.getName());
        System.out.println(motorbike.getColor());
        System.out.println(motorbike.getModel());

        motorbike.info();
        motorbike.yearDifference(motorbike.getName());
    }
}
