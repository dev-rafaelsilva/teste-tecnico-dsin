package q3;

import java.util.Scanner;

public class CustoCarro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Custo de fábrica: ");
        double custoFabrica = sc.nextDouble();

        double valorDistribuidor = custoFabrica * 0.125;
        double valorImpostos = custoFabrica * 0.33;
        double valorCarro = custoFabrica + valorDistribuidor + valorImpostos;
        double valorDesconto = valorCarro * 0.05;
        double valorComDesconto = valorCarro - valorDesconto;

        System.out.printf("Valor do distribuidor: R$ %.2f%n", valorDistribuidor);
        System.out.printf("Valor dos impostos: R$ %.2f%n", valorImpostos);
        System.out.printf("Valor do carro: R$ %.2f%n", valorCarro);
        System.out.printf("Valor do desconto: R$ %.2f%n", valorDesconto);
        System.out.printf("Valor do carro com desconto: R$ %.2f%n", valorComDesconto);

        sc.close();
    }
}