package day6;

public class Airplane {
    String producer;
    int year;
    int length;
    int weight;
    int fuel;

    public int getFuel() {
        return fuel;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Airplane(String producer, int year, int length, int weight, int fuel) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void info() {
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }

    public void fillUp(int fuel) {
        this.fuel = fuel;
    }
}

class TestAirplane {
    public static void main(String[] args) {
        Airplane samolet = new Airplane("Boing", 2005, 200, 6000, 300);
        samolet.setYear(1999);
        samolet.setLength(500);
        samolet.fillUp(500);
        samolet.fillUp(9000);
        samolet.info();
    }
}

