package login;
import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int senhaCorreta = 1234;
        int senha;
        int tentativas = 0;

        do {
            System.out.print("Digite sua senha: ");
            senha = scanner.nextInt();

            tentativas++;

            if (senha != senhaCorreta) {
                System.out.println("\nSenha incorreta.\n");
            }

        } while (senha != senhaCorreta);

        System.out.println("Login realizado com sucesso!");
        System.out.println("Login realizado após " + tentativas + " tentativas.");

        scanner.close();
    }
}
