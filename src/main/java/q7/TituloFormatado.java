package q7;

import java.util.Scanner;

public class TituloFormatado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Linha superior: ");
        String superior = sc.nextLine();
        System.out.print("Linha inferior: ");
        String inferior = sc.nextLine();

        int margem = 4; // espaço extra nas laterais
        int larguraConteudo = Math.max(superior.length(), inferior.length()) + margem * 2;
        int larguraTotal = larguraConteudo + 4; // "||" de cada lado

        StringBuilder borda = new StringBuilder();
        for (int i = 0; i < larguraTotal; i++) borda.append("|");

        System.out.println(borda);
        imprimirLinhaVazia(larguraConteudo);
        imprimirLinhaCentralizada(superior, larguraConteudo);
        imprimirLinhaCentralizada(inferior, larguraConteudo);
        imprimirLinhaVazia(larguraConteudo);
        System.out.println(borda);
    }

    static void imprimirLinhaVazia(int largura) {
        System.out.println("||" + " ".repeat(largura) + "||");
    }

    static void imprimirLinhaCentralizada(String texto, int largura) {
        int espacoTotal = largura - texto.length();
        int esquerda = espacoTotal / 2;
        int direita = espacoTotal - esquerda;
        System.out.println("||" + " ".repeat(esquerda) + texto + " ".repeat(direita) + "||");
    }
}