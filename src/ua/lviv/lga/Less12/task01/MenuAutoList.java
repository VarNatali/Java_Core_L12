package ua.lviv.lga.Less12.task01;

import java.util.*;

public class MenuAutoList {
    static void menu() {
        System.out.println();
        System.out.println(" Щоб вивести всі авто, атисніть 1");
        System.out.println(" Щоб засетити однакове значення в список Авто натисніть 2");
        System.out.println(" Щоб завершити роботу натисніть 3");
        System.out.println();
    }

    public static void main(String[] args) {
        boolean fin = true;
        List<HelmMaterial> material = new ArrayList<>();

        material.addAll(List.of(HelmMaterial.values()));

        Scanner sc = new Scanner(System.in);

        /* Сформували список , з яким далі працюємо */
        List<AutoList> auto = new ArrayList();

        for (int i = 0; i < getRandom(5, 12); i++) {
            auto.add(new AutoList(getRandom(50, 600), getRandom(1930, 2023), new EngineList(getRandom(1, 16)), new HelmList(getRandom(40, 60), material.get(getRandom(0, 1)))));
        }


        while (fin) {
            menu();
            switch (sc.next()) {
                case "1":
                    System.out.println("Size of List:" + auto.size());
                    System.out.println(auto);
                    break;

                case "2":
                    System.out.println("список до заміни: ");
                    System.out.println(auto);
                    int chan = getRandom(0, auto.size() - 1);
                    System.out.println("заміна на: " + auto.get(chan));

                    for (int i = 0; i < auto.size(); i++)
                        auto.set(i, auto.get(chan));
                    System.out.println(auto);
                    break;
                case "3":
                    fin = false;
                    break;

            }
        }
    }


    public static int getRandom(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("Значення min має бути більшим за значення max");
        }
        Random r = new Random();
        return r.nextInt(max - min + 1) + min;

    }


}
