import java.util.Scanner;

public class jogador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite a quantidade de horas jogadas por semana: ");
        int horas = scanner.nextInt();

        if (idade < 12) {
            System.out.println("Jogador Mirim!");
        } else if (idade <= 17) {
            if (horas <= 10) {
                System.out.println("Jogador Casual!");
            } else {
                System.out.println("Jogador Frequente!");
            }
        } else {
            if (horas <= 5) {
                System.out.println("Jogador Casual!");
            } else if (horas <= 15) {
                System.out.println("Jogador Gamer!");
            } else {
                System.out.println("Gamer Hardcore!");
            }
        }

        scanner.close();
    }
}


