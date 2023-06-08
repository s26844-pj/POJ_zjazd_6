package zad_6_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class zad_6_4 {
    public static void main(String[] args) {
        Map<Integer, String> months = new HashMap<>();
        months.put(1, "January");
        months.put(2, "Febuary");
        months.put(3, "March");
        months.put(4, "April");
        months.put(5, "May");
        months.put(6, "June");
        months.put(7, "July");
        months.put(8, "August");
        months.put(9, "September");
        months.put(10, "October");
        months.put(11, "November");
        months.put(12, "December");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of month from 1 to 12: ");
        int monthNumber = scanner.nextInt();

        if (monthNumber >= 1 && monthNumber <= 12) {
            String monthName = months.get(monthNumber);
            System.out.println("Month number " + monthNumber + " is " + monthName + ".");
        } else {
            System.out.println("Entered incorrect number of month.");
        }
    }
}