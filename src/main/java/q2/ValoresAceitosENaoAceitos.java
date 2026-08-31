package q2;

import java.util.Scanner;

public class ValoresAceitosENaoAceitos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("A: ");
        int a = sc.nextInt();

        System.out.print("B: ");
        int b = sc.nextInt();

        System.out.print("C: ");
        int c = sc.nextInt();

        System.out.print("D: ");
        int d = sc.nextInt();

        boolean condicao =
                (b > c)
                        && (d > a)
                        && ((c + d) > (a + b))
                        && (c > 0)
                        && (d > 0)
                        && (a % 2 == 0);

        System.out.println(
                condicao
                        ? "Valores aceitos"
                        : "Valores não aceitos"
        );

        sc.close();
    }
}