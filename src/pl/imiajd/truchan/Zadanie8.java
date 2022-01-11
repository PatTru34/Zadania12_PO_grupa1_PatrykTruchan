package pl.imiajd.truchan;
import java.util.ArrayList;

public class Zadanie8 {
    public static <E> void print(Iterable<E> iterable) {
        for (E e : iterable) {
            System.out.print(e + ",");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<String> lista1 = new ArrayList<String>();

        lista1.add("Ala");
        lista1.add("Kot");
        lista1.add("Mysz");
        print(lista1);

        ArrayList<Integer> lista2 = new ArrayList<Integer>();

        lista2.add(1);
        lista2.add(2);
        lista2.add(3);
        print(lista2);
    }
}