package q5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PlacaConversor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Placa: ");
        String placa = sc.nextLine().trim().toUpperCase();

        Map<Character, Character> digitoParaLetra = new HashMap<>();
        Map<Character, Character> letraParaDigito = new HashMap<>();
        String letras = "ABCDEFGHIJ";
        for (int i = 0; i < 10; i++) {
            digitoParaLetra.put((char) ('0' + i), letras.charAt(i));
            letraParaDigito.put(letras.charAt(i), (char) ('0' + i));
        }

        if (placa.matches("[A-Z]{3}[0-9]{4}")) {
            char digito = placa.charAt(4);
            char letraConvertida = digitoParaLetra.get(digito);
            String correspondente = placa.substring(0, 4) + letraConvertida + placa.substring(5);
            System.out.println("Padrão: Brasil");
            System.out.println("Correspondente: " + correspondente);
        } else if (placa.matches("[A-Z]{3}[0-9][A-Z][0-9]{2}")) {
            char letra = placa.charAt(4);
            char digitoConvertido = letraParaDigito.get(letra);
            String correspondente = placa.substring(0, 4) + digitoConvertido + placa.substring(5);
            System.out.println("Padrão: Mercosul");
            System.out.println("Correspondente: " + correspondente);
        } else {
            System.out.println("formato inválido");
        }
    }
}