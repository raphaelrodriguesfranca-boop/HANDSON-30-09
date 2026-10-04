package dueloJogadores;

import java.util.Random;

public class duelo {
    public static void main(String[] args) {
        Random random = new Random();

        int vidasJogador1 = 3;
        int vidasJogador2 = 3;

        int pontosJogador1 = 0;
        int pontosJogador2 = 0;

        int rodada = 1;

        while (vidasJogador1 > 0 && vidasJogador2 > 0) {

            int numeroJogador1 = random.nextInt(10) + 1;
            int numeroJogador2 = random.nextInt(10) + 1;

            System.out.println("\n===== RODADA " + rodada + " =====");

            System.out.println("Jogador 1 tirou: " + numeroJogador1);
            System.out.println("Jogador 2 tirou: " + numeroJogador2);

            if (numeroJogador1 > numeroJogador2) {

                System.out.println("\nJogador 1 venceu a rodada!");
                System.out.println("Jogador 2 perdeu uma vida!");

                pontosJogador1 += 10;
                vidasJogador2--;

            } else if (numeroJogador2 > numeroJogador1) {

                System.out.println("\nJogador 2 venceu a rodada!");
                System.out.println("Jogador 1 perdeu uma vida!");

                pontosJogador2 += 10;
                vidasJogador1--;

            } else {

                System.out.println("\nEmpate!");
                System.out.println("Ninguém perdeu vida.");

                pontosJogador1 += 5;
                pontosJogador2 += 5;

                System.out.println("Cada jogador recebeu 5 pontos.");
            }

            System.out.println("\nVidas do Jogador 1: " + vidasJogador1);
            System.out.println("Pontos do Jogador 1: " + pontosJogador1);

            System.out.println("\nVidas do Jogador 2: " + vidasJogador2);
            System.out.println("Pontos do Jogador 2: " + pontosJogador2);

            rodada++;
        }

        System.out.println("\n===== RESULTADO FINAL =====");

        System.out.println("\nJogador 1");
        System.out.println("Vidas: " + vidasJogador1);
        System.out.println("Pontos: " + pontosJogador1);

        System.out.println("\nJogador 2");
        System.out.println("Vidas: " + vidasJogador2);
        System.out.println("Pontos: " + pontosJogador2);

        if (vidasJogador1 > 0) {
            System.out.println("\nVencedor: Jogador 1");
        } else {
            System.out.println("\nVencedor: Jogador 2");
        }
    }
}
