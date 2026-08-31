package q8;

import java.util.Scanner;

public class MatrizCaracol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int n = sc.nextInt();

        int[][] matriz = new int[n][n];
        int valor = 2;
        int topo = 0, base = n - 1, esquerda = 0, direita = n - 1;

        while (topo <= base && esquerda <= direita) {
            for (int col = esquerda; col <= direita; col++) {
                matriz[topo][col] = valor;
                valor += 2;
            }
            topo++;

            for (int lin = topo; lin <= base; lin++) {
                matriz[lin][direita] = valor;
                valor += 2;
            }
            direita--;

            if (topo <= base) {
                for (int col = direita; col >= esquerda; col--) {
                    matriz[base][col] = valor;
                    valor += 2;
                }
                base--;
            }

            if (esquerda <= direita) {
                for (int lin = base; lin >= topo; lin--) {
                    matriz[lin][esquerda] = valor;
                    valor += 2;
                }
                esquerda++;
            }
        }

        for (int[] linha : matriz) {
            for (int num : linha) {
                System.out.printf("%4d", num);
            }
            System.out.println();
        }
    }
}
