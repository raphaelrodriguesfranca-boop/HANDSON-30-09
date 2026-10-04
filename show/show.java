package show;

import java.util.Scanner;

public class show {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("\nPossui ingresso?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        int ingresso = scanner.nextInt();

        if (ingresso == 2) {
            System.out.println("Entrada negada: ingresso obrigatório.");
        } else if (ingresso == 1) {

            if (idade >= 18) {
                System.out.println("Entrada liberada!");
            } else {
                System.out.println("\nEstá acompanhado de um responsável?");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                int responsavel = scanner.nextInt();

                if (responsavel == 1) {
                    System.out.println("Entrada liberada!");
                } else {
                    System.out.println("Entrada negada.");
                }
            }

        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}
