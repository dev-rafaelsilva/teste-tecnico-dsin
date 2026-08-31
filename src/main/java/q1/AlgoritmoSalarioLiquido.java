package q1;

import java.util.Scanner;

public class AlgoritmoSalarioLiquido {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Horas por dia: ");
        double horasPorDia = sc.nextDouble();

        System.out.print("Preço da hora: ");
        String entradaPreco = sc.next();

        double precoHora = Double.parseDouble(
                entradaPreco.replace(",", ".")
        );

        System.out.print("Dias trabalhados no mês: ");
        int diasTrabalhados = sc.nextInt();

        double salarioBruto = horasPorDia * precoHora * diasTrabalhados;

        double desconto = salarioBruto * 0.15;

        double salarioLiquido = salarioBruto - desconto;

        System.out.printf("Salário Bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("Desconto (15%%): R$ %.2f%n", desconto);
        System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);

        sc.close();
    }
}