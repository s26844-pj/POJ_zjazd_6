package zad_6_1;
import java.util.LinkedList;

public class zad_6_1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("Pink");
        list.add("orange");
        System.out.println("The Original linked list: " + list);
        System.out.println("Element removed: " + list.getFirst());
        list.removeFirst();
        System.out.println("Element removed: " + list.getLast());
        list.removeLast();
        System.out.println("The New linked list: " + list);

    }
}
