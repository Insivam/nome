// Pega o nome e sobre nome e devolve o nome inteiro

import java.util.Scanner;

public class nome {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Digite seu nome: ");
            String nome = input.nextLine();
            System.out.print("Digite seu sobrenome: ");
            String sobrenome = input.nextLine();
            System.out.println("Seu nome completo é " + nome + " " + sobrenome);
        }
    }
}
