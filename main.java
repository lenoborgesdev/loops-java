import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int contador = 0;
        for (int i = 1; i <= 10; i++) {
            contador = i;
            System.out.println(i);
        }
        System.out.println(contador);
    }
}
