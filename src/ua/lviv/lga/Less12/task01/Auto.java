package ua.lviv.lga.Less12.task01;

public class Auto {
    private int power;
    private int year;
    private Engine engine;
    private Helm helm;

    public Auto(int power, int year, Engine engine, Helm helm) {
        this.power = power;
        this.year = year;
        this.engine = engine;
        this.helm = helm;
    }

    public int getPower() {
        return power;
    }

    public int getYear() {
        return year;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Auto: {" + "power= " + power +
                ", year= " + year +
                '}';
    }
}
