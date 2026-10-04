package lanchonete;
import java.util.Scanner;

public class lanchonete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0;
        int opcao;

        do {
            System.out.println("\n===== LANCHONETE =====");
            System.out.println("1 - Pizza         - R$ 30,00");
            System.out.println("2 - Hambúrguer    - R$ 20,00");
            System.out.println("3 - Batata        - R$ 12,00");
            System.out.println("4 - Refrigerante  - R$ 8,00");
            System.out.println("0 - Finalizar");

            System.out.print("\nEscolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    total += 30;
                    System.out.println("Pizza adicionada!");
                    break;

                case 2:
                    total += 20;
                    System.out.println("Hambúrguer adicionado!");
                    break;

                case 3:
                    total += 12;
                    System.out.println("Batata adicionada!");
                    break;

                case 4:
                    total += 8;
                    System.out.println("Refrigerante adicionado!");
                    break;

                case 0:
                    System.out.println("Finalizando pedido...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        double desconto = 0;

        if (total < 50) {
            System.out.println("\nSem desconto.");

        } else if (total < 100) {
            desconto = total * 0.05;
            System.out.println("\n5% de desconto.");

        } else {
            System.out.println("\nVocê é estudante?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");

            int estudante = scanner.nextInt();

            if (estudante == 1) {
                desconto = total * 0.15;
                System.out.println("15% de desconto.");
            } else if (estudante == 2) {
                desconto = total * 0.10;
                System.out.println("10% de desconto.");
            } else {
                System.out.println("Opção inválida. Nenhum desconto aplicado.");
            }
        }

        double valorFinal = total - desconto;

        System.out.printf("\nTotal: R$ %.2f%n", total);
        System.out.printf("Desconto: R$ %.2f%n", desconto);
        System.out.printf("Valor final: R$ %.2f%n", valorFinal);

        scanner.close();
    }
}
