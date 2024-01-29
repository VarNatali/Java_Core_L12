package ua.lviv.lga.Less12.task03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppConsolBooks {
    public static void main(String[] args) throws ExeptMessage {

        List<Books> book = new ArrayList();
        boolean cont = true;

        book.add(new Books("Baitel", "Schchodennyk knygaria", 304, 2019));
        book.add(new Books("Yarros", "Fourth Wing", 512, 2023));
        book.add(new Books("Snyder", "Bloodlands", 544, 2011));
        book.add(new Books("Tartt", "The Secret History", 640, 2017));
        book.add(new Books("Collins", "The Ballad of Songbirds and Snakes", 528, 2020));
        book.add(new Books("Tolkien", "The Hobbit", 310, 2013));
        book.add(new Books("Klopotenko", "Ukrainian Cuisine in 70 Dishes", 176, 2021));

        while (cont) {
            System.out.println(" Press 1 to  schow all collection " + "\n press 2 to add books " + "\n press 3 to remove books" + "\n press 4 to complite");
            System.out.println();
            Scanner sc = new Scanner(System.in);
            switch (sc.next()) {
                case "1":
                    for (Object o : book) {
                        System.out.println(o);
                    }

                    System.out.println();
                    break;

                case "2":
                    Scanner sc2 = new Scanner(System.in);
                    int in;
                    System.out.println("Add Autor :");

                    Books bb = new Books();
                    bb.setAutorSurname(sc2.next());
                    System.out.println("Add Book :");
                    bb.setName(sc2.next());
                    System.out.println("Add year :");
                    bb.setYear(sc2.nextInt());
                    System.out.println("Add page :");
                    bb.setPageCount(sc2.nextInt());
                    book.add(bb);
                    System.out.println(" \n" + book.getLast() + "\n has been successfully added. \n");
                    break;

                case "3":

                    System.out.println("Enter the title of the book: ");
                    sc = new Scanner(System.in);
                    String name = sc.nextLine();


                    int is = isFinde(book, name);

                    if (is >= 0) {
                        System.out.println(" \n" + book.get(is) + "\n has been successfully removed. \n");
                        book.remove(is);
                    }
                    break;

                case "4":
                    cont = false;
                    break;
            }

        }

    }

    private static int isFinde(List<Books> book, String name) throws ExeptMessage {

        int num = -1;
        for (int i = 0; i < book.size(); i++) {
            if (book.get(i).getName().equalsIgnoreCase(name)) {
                num = i;
            }
        }
        if (num < 0) throw new ExeptMessage("No such book was found");
        return num;
    }

}
