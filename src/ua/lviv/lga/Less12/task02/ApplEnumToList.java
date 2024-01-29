package ua.lviv.lga.Less12.task02;

import ua.lviv.lga.Less12.task01.HelmMaterial;
import ua.lviv.lga.Less12.task03.ExeptMessage;

import java.util.*;

public class ApplEnumToList {
    /**
     * @param no imput param
     * @return null
     * @throws ExeptMessage
     * @author Nataliia
     */


    /* Display the menu on the screen   */
    static void menu() {
        System.out.println();
        System.out.println("0 щоб завершити роботу");
        System.out.println("1 : перевірити, чи є такий місяць");
        System.out.println("2 :  всі місяці пори року");
        System.out.println("3 :  всі місяці з певною кількістю днів");
        System.out.println("4 :  всі місяці з меншою кількістю днів");
        System.out.println("5 :  всі місяці з більшою кількістю днів");
        System.out.println("6 :  вивести наступну пору року до вказаної");
        System.out.println("7 :  вивести попередню пору року до вказаної");
        System.out.println("8 :  всі місяці із парною кількістю днів");
        System.out.println("9:   всі місяці із непарною кількістю днів");
        System.out.println("10:  перевірити введений місяць на парність днів");
        System.out.println();
    }

    public static void main(String[] args) throws ExeptMessage, IllegalArgumentException {
        /*reading the entered information*/
        Scanner sc = new Scanner(System.in);

        /*fill arrays with information*/
        List<Months> months = new ArrayList<>();
        months.addAll(List.of(Months.values()));

        List<Sesons> sesons = new ArrayList<>();
        sesons.addAll(List.of(Sesons.values()));

        System.out.println(sesons);
        System.out.println(months);

        /*additional variables*/
        String data;
        int data2;
        boolean cont = true;

        /* processing of entered information */

        while (cont) {

            menu();
            int num = -1;
            switch (sc.next()) {
                case "0":
                    cont = false;
                    break;

                case "1":
                    System.out.println("Введіть назву місяця");
                    sc = new Scanner(System.in);
                    data = sc.next().toUpperCase();

                    try {
                        months.contains(Months.valueOf(data));
                        System.out.println("Є такий місяць  " + data);
                    } catch (Exception e) {
                        throw new IllegalArgumentException("There is no such month.");
                    }

                    break;

                case "2":
                    System.out.println("Введіть назву пори року: ");
                    sc = new Scanner(System.in);
                    data = sc.next().toUpperCase();
                    try {
                        sesons.contains(Sesons.valueOf(data));
                        System.out.println("Місяці пори року " + data + " :");
                        for (int i = 0; i < months.size(); i++) {
                            if (months.get(i).seson.name().equals(data)) {
                                System.out.println(months.get(i).name());
                            }
                        }

                    } catch (Exception e) {
                        throw new IllegalArgumentException("There is no such time of year");
                    }
                    break;

                case "3":
                    System.out.println("Введіть кількість днів: ");
                    sc = new Scanner(System.in);
                    data2 = sc.nextInt();

                    for (int i = 0; i < months.size(); i++) {
                        if (months.get(i).day == data2) {
                            System.out.println("Місяць " + months.get(i).name() + " має " + data2 + " днів");
                            num++;
                        }
                    }


                    if (num < 0) {
                        throw new ExeptMessage("Немає місяця, який має тільки " + data2 + " днів.");

                    }

                    break;
                case "4":
                    System.out.println("Введіть кількість днів: ");
                    sc = new Scanner(System.in);
                    data2 = sc.nextInt();
                    int count = 0;

                    for (int i = 0; i < months.size(); i++) {
                        if (months.get(i).day < data2) {
                            System.out.println("Місяць " + months.get(i).name());
                            count++;
                        }
                    }
                    if (count != 0) System.out.println("Mенше,ніж " + data2 + " днів, мають " + count + " місяців");
                    else System.out.println("Немає місяця з меншою, ніж " + data2 + " днів");

                    break;
                case "5":
                    System.out.println("Введіть кількість днів: ");
                    sc = new Scanner(System.in);
                    data2 = sc.nextInt();
                    count = 0;

                    for (int i = 0; i < months.size(); i++) {
                        if (months.get(i).day > data2) {
                            System.out.println("Місяць " + months.get(i).name());
                            count++;
                        }
                    }
                    if (count != 0) System.out.println("Більше,ніж " + data2 + " днів, мають " + count + " місяців");
                    else System.out.println("Немає місяця з більшою, ніж " + data2 + " днів");

                    break;

                case "6":
                    System.out.println("Введіть назву пори року: ");
                    sc = new Scanner(System.in);
                    data = sc.next().toUpperCase();

                    try {
                        sesons.contains(Sesons.valueOf(data));
                        for (Sesons s : sesons) {
                            if (s.name().equals(data)) num = sesons.indexOf(s);//s.name().equals(data)
                        }

                        if (num == sesons.size() - 1)
                            System.out.println("Наступною " + data + " буде " + sesons.get(0).name());
                        else System.out.println("Наступною за " + data + " буде " + sesons.get(num + 1).name());

                        System.out.println();

                    } catch (Exception e) {
                        throw new IllegalArgumentException("There is no such time of year");
                    }

                    break;
                case "7":
                    System.out.println("Введіть назву пори року: ");
                    sc = new Scanner(System.in);
                    data = sc.next().toUpperCase();
                    try {
                        sesons.contains(Sesons.valueOf(data));
                        for (Sesons s : sesons) {
                            if (s.name().equals(data)) num = sesons.indexOf(s);
                        }

                        if (num == 0)
                            System.out.println("Попередньою до  " + data + " була " + sesons.get(sesons.size() - 1).name());
                        else System.out.println("Попередньою до  " + data + " була " + sesons.get(num - 1).name());

                        System.out.println();

                    } catch (Exception e) {
                        throw new IllegalArgumentException("There is no such time of year");
                    }

                    break;
                case "8":
                    System.out.println("Парну кількість днів мають такі місяці: ");
                    for (Months m : months) {
                        if (m.day % 2 == 0) {
                            System.out.println(m.name());
                        }
                    }
                    break;

                case "9":
                    System.out.println("Непарну кількість днів мають такі місяці: ");
                    for (Months m : months) {
                        if (m.day % 2 != 0) {
                            System.out.println(m.name());
                        }
                    }
                    break;
                case "10":
                    System.out.println("Введіть назву місяця: ");
                    sc = new Scanner(System.in);
                    data = sc.next().toUpperCase();


                    try {
                        months.contains(Months.valueOf(data));
                        for (Months m : months) {
                            if (m.name().equals(data)) num = months.indexOf(m);
                        }
                        if (months.get(num).day % 2 == 0) {
                            System.out.println("Місяць " + data + " має парну кількість днів");
                        } else System.out.println("Місяць " + data + " має непарну кількість днів");

                    } catch (Exception e) {
                        throw new IllegalArgumentException("There is no such month.");
                    }

                    break;


            }

        }

    }

    /*checking the entered information for correctness
     * @param  months,  data2
     * @exception  ErrorMessage
     * @author Nataliia
     * @return int element number in the array or  stop on error
     *
     */
 /*   private static int getNumDay(Months[] months, int data2, int num) throws ExeptMessage {
        for (Months m : months) {
            if (m.getDay() == data2) {
                num = m.ordinal();
            }

        }

        if (num < 0) {
            String message = "Немає місяця з такою кількістю днів : " + data2;
            throw new ExeptMessage(message);
        }
        return num;
    }

    /*checking the entered information for correctness
     * @param  sesons,  data2
     * @exception  ErrorMessage
     * @author Nataliia
     * @return int element number in the array or  stop on error
     *
     */
/*    private static int getNumSesons(Sesons[] sesons, String data, int num) throws ExeptMessage {
        for (Sesons m : sesons) {
            if (m.name().equals(data)) {
                num = m.ordinal();
            }

        }
        if (num < 0) {
            String message = "Немає такої пори року як " + data;
            throw new ExeptMessage(message);
        }


        return num;
    }

    /*checking the entered information for correctness
     * @param  months,  data
     * @exception  ErrorMessage
     * @author Nataliia
     * @return int element number in the array or  stop on error
     *
     */
  /*  private static int getNumMonth(Months[] months, String data, int num) throws ExeptMessage {
        for (Months m : months) {
            if (m.name().equals(data)) {
                num = m.ordinal();
            }
        }
        if (num < 0) {
            String message = "Немає такого місяця як " + data;
            throw new ExeptMessage(message);
        }


        return num;*/

}
