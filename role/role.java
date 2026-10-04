package role;
import java.util.Scanner;

public class role {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quanto dinheiro você possui? R$ ");
        double dinheiro = scanner.nextDouble();

        if (dinheiro < 20) {
            System.out.println("Rolê em casa.");

        } else if (dinheiro < 50) {
            System.out.println("\nEstá chovendo?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            int chuva = scanner.nextInt();

            if (chuva == 1) {
                System.out.println("Streaming + comida.");
            } else if (chuva == 2) {
                System.out.println("Praça ou parque.");
            } else {
                System.out.println("Opção inválida.");
            }

        } else if (dinheiro < 100) {
            System.out.println("Cinema.");

        } else {
            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();

            if (idade < 18) {
                System.out.println("Shopping + cinema.");
            } else {
                System.out.println("Show, restaurante ou churrasco com a galera.");
            }
        }

        scanner.close();
    }
}

