package ua.lviv.lga.Less12.task01;

public class EngineList {
    private int cylinders;

    public EngineList(int cylinders) {
        this.cylinders = cylinders;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "cylinders=" + cylinders +
                '}';
    }
}
