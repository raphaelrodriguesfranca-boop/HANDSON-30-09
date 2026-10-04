package skins;

import java.util.Scanner;

public class skins {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int moedas = 1500;
        int opcao;

        while (true) {

            System.out.println();
            System.out.println("===== LOJA DE SKINS =====");
            System.out.println();
            System.out.println("1 - Skin Básica   - 100 moedas");
            System.out.println("2 - Skin Rara     - 250 moedas");
            System.out.println("3 - Skin Épica    - 500 moedas");
            System.out.println("4 - Skin Lendária - 1000 moedas");
            System.out.println("0 - Sair");

            System.out.println();
            System.out.println("Saldo: " + moedas + " moedas");

            System.out.print("Escolha uma skin: ");
            opcao = scanner.nextInt();

            if (opcao == 0) {
                System.out.println("Saindo da loja...");
                break;
            }

            if (opcao == 1) {

                if (moedas >= 100) {
                    moedas = moedas - 100;

                    System.out.println();
                    System.out.println("Skin Básica comprada!");
                    System.out.println("Saldo restante: " + moedas + " moedas");

                } else {
                    System.out.println();
                    System.out.println("Saldo insuficiente.");
                }

            } else if (opcao == 2) {

                if (moedas >= 250) {
                    moedas = moedas - 250;

                    System.out.println();
                    System.out.println("Skin Rara comprada!");
                    System.out.println("Saldo restante: " + moedas + " moedas");

                } else {
                    System.out.println();
                    System.out.println("Saldo insuficiente.");
                }

            } else if (opcao == 3) {

                if (moedas >= 500) {
                    moedas = moedas - 500;

                    System.out.println();
                    System.out.println("Skin Épica comprada!");
                    System.out.println("Saldo restante: " + moedas + " moedas");

                } else {
                    System.out.println();
                    System.out.println("Saldo insuficiente.");
                }

            } else if (opcao == 4) {

                if (moedas >= 1000) {
                    moedas = moedas - 1000;

                    System.out.println();
                    System.out.println("Skin Lendária comprada!");
                    System.out.println("Saldo restante: " + moedas + " moedas");

                } else {
                    System.out.println();
                    System.out.println("Saldo insuficiente.");
                }

            } else {

                System.out.println();
                System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
