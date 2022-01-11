package pl.imiajd.truchan;
import java.util.Scanner;
import java.util.Stack;
public class Zadanie6 {
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        int liczba = scan.nextInt();
        Stack<Integer> stos = new Stack<>();

        while(liczba>0)
        {
            stos.push(liczba%10);
            liczba=liczba/10;
        }
        while(!stos.isEmpty())
        {
            System.out.println(stos.pop());
        }
    }
}
