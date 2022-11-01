package day5;

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

    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(1991, "Green", "Davidson");
        System.out.println(motorbike.getName());
        System.out.println(motorbike.getColor());
        System.out.println(motorbike.getModel());
    }
}
