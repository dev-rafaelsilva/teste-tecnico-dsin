package q6;

import java.util.Scanner;

public class ClassificarNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Número " + i + ":");
            if (ehPerfeito(i)) System.out.println("  numero perfeito");
            if (i % 2 == 0) System.out.println("  numero par");
            else System.out.println("  numero impar");
            if (ehPrimo(i)) System.out.println("  numero primo");
        }
    }

    static boolean ehPerfeito(int n) {
        if (n < 2) return false;
        int soma = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) soma += i;
        }
        return soma == n;
    }

    static boolean ehPrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
