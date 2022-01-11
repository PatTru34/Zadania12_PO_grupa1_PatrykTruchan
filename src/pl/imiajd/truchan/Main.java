package pl.imiajd.truchan;
import java.util.Collections;
import java.util.LinkedList;
public class Main {


    public static void redukuj(LinkedList<String> pracownicy, int n)
    {
        int j=0;
        for(int i=0;i<pracownicy.size();i++)
        {
            j++;
            if(j%n ==0)
            {
                pracownicy.remove(i);
                j=0;
                i--;
            }
        }
    }
    public static void odwroc(LinkedList<String> lista)
    {
        Collections.reverse(lista);
    }
    public static void main(String[] args) {
	LinkedList<String> lista=new LinkedList<String>();
    lista.add("Kowalski");
    lista.add("Burczymucha");
    lista.add("Braun");
    lista.add("Yaeger");
    lista.add("Ackermann");
    lista.add("Graczyk");
    redukuj(lista,4);
    System.out.println(lista.toString());

    odwroc(lista);
    System.out.println(lista.toString());
    }
}
