package ua.lviv.lga.Less12.task01;

public class AutoList {
    private int power;
    private int year;
    private EngineList engine;
    private HelmList helm;

    public AutoList(int power, int year, EngineList engine, HelmList helm) {
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
