package zad_6_2;

import java.util.HashSet;

public class zad_6_2 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Alfa");
        set.add("Beta");
        set.add("Delta");
        set.add("Gamma");
        set.add("Theta");
        System.out.println(set);
        String [] tablica = new String[set.size()];
        set.toArray(tablica);
        System.out.print("Elementy tablicy: ");
        for (int i = 0 ; i < tablica.length ; i++) {
            System.out.print(tablica[i] + "  ");
        }
    }
}
