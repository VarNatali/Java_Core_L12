package ua.lviv.lga.Less12.task03;

public class ExeptMessage extends Exception {
    private String mes;

    public ExeptMessage(String mes) {
        super(mes);
        this.mes = mes;
    }

    public String getMessage() {
        return mes;
    }
}
