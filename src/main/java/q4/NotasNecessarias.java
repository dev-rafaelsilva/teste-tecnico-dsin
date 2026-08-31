package q4;

import java.util.Scanner;

public class NotasNecessarias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor: ");
        int valor = sc.nextInt();
        int original = valor;

        int[] notas = {100, 50, 20, 10, 5, 2, 1};
        int[] quantidades = new int[notas.length];

        for (int i = 0; i < notas.length; i++) {
            quantidades[i] = valor / notas[i];
            valor = valor % notas[i];
        }

        System.out.println("Valor lido: " + original);
        for (int i = 0; i < notas.length; i++) {
            System.out.println(quantidades[i] + " nota(s) de R$ " + notas[i] + ",00");
        }
    }
}
