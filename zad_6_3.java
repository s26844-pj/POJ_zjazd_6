package zad_6_3;

import java.util.Iterator;
import java.util.TreeSet;

public class zad_6_3 {
    public static void main(String[] args) {
        TreeSet<String> tree1 = new TreeSet<>();

        tree1.add("Blue");
        tree1.add("Green");
        tree1.add("White");
        tree1.add("Red");
        tree1.add("Grey");

        System.out.println("a) Drzewo zawierające 5 nazw kolorów:");
        System.out.println(tree1);

        Iterator iter_set = tree1.iterator();
        System.out.println("\nb) Wyświetlenie tree1 poprzez iterator: ");
        while (iter_set.hasNext()) {
            System.out.print(iter_set.next());
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("\nc) Dodawanie do drzerwa tree1 nowe drzewo tree2: ");
        TreeSet<String> tree2 = new TreeSet<>();
        tree2.add("Purple");
        tree2.add("Orange");
        tree2.add("Black");
        System.out.println("Drzewo tree1: " + tree1);
        System.out.println("Drzewo tree2: " + tree2);
        tree1.addAll(tree2);
        System.out.println("Drzewo tree1 po dodaniu tree2: " + tree1);
        System.out.println();
        System.out.print("d) Odwrócona kolejność elementów tree1: \n");
        for (String color : tree1.descendingSet()) {
            System.out.println(color);
        }
        System.out.println();
        System.out.println("e) Wypisanie pierwszego i ostaniego elementu przechowywanego w drzewie tree1. \n" +
                        "Drzewo tree1: " + tree1);
        System.out.println("Pierwszy element tree1 to: " + tree1.first());
        System.out.println("Ostatni element tree1 to: " + tree1.last());
        TreeSet<String> tree3 = (TreeSet<String>) tree1.clone();
        System.out.println();
        System.out.println("f) Sklonowanie tree1 do tree3. \ntree1: " + tree1 + "\nNowe drzewo tree3: " + tree3);
        System.out.println();
        System.out.println("g) Liczba elementów przechowywanych w drzewie. \nDrzewo tree1: " + tree1 + "\nRozmiar" +
                " tree1: " + tree1.size());
        System.out.println();
        System.out.println("h) Porównanie elementów przechowwywanych w tree1 i tree2:");
        for (String element : tree1) {
            boolean hasEquivalentElement = tree2.contains(element);
            String annotation = hasEquivalentElement ? " - element z tree1, istnieje również w tree2." : " - element z " +
                    "tree1, nie istnieje w tree2.";
            System.out.println(element + annotation);
        }
        }
    }
