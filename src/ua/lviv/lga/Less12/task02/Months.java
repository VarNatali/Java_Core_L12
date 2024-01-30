package ua.lviv.lga.Less12.task02;

import static ua.lviv.lga.Less12.task02.Sesons.AUTUMN;
import static ua.lviv.lga.Less12.task02.Sesons.SPRING;
import static ua.lviv.lga.Less12.task02.Sesons.SUMMER;
import static ua.lviv.lga.Less12.task02.Sesons.WINTER;

public enum Months {
    JANUARY(WINTER, 31),
    FEBRUARY(WINTER, 28),

    MARCH(SPRING, 31),

    APRIL(SPRING, 30),

    MAY(SPRING, 31),

    JUNE(SUMMER, 30),

    JULY(SUMMER, 31),

    AUGUST(SUMMER, 31),

    SEPTEMBER(AUTUMN, 30),

    OCTOBER(AUTUMN, 31),

    NOVEMBER(AUTUMN, 30),

    DECEMBER(WINTER, 31);

    final Sesons seson;
    final int day;

    Months(Sesons seson, int day) {
        this.seson = seson;
        this.day = day;
    }

    public Sesons getSes() {
        return seson;
    }

    public int getDay() {
        return day;
    }
}



