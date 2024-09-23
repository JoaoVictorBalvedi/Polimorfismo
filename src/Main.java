import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Jogo jogoAAA = new JogoAAA("Cyberpunk 2077", 199.99, "CD Projekt Red", 10);
        Jogo jogoIndie = new JogoIndie("Hollow Knight", 39.99, "Team Cherry", "Desenho animado");
        Jogo jogoFreeToPlay = new JogoFreeToPlay("Fortnite", 0.0, "Epic Games", true);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Cyberpunk 2077");
            System.out.println("2. Hollow Knight");
            System.out.println("3. Fortnite");
            System.out.println("0. Sair");
            System.out.print("Selecione o jogo: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    menuJogo(jogoAAA);
                    break;
                case 2:
                    menuJogo(jogoIndie);
                    break;
                case 3:
                    menuJogo(jogoFreeToPlay);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    public static void menuJogo(Jogo jogo) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nOpções para " + jogo.nome + ":");
            System.out.println("1. Mostrar detalhes");
            System.out.println("2. Iniciar jogo");
            if (jogo instanceof JogoAAA) {
                System.out.println("3. Mostrar gráficos");
            } else if (jogo instanceof JogoIndie) {
                System.out.println("3. Mostrar estilo artístico");
            } else if (jogo instanceof JogoFreeToPlay) {
                System.out.println("3. Mostrar compras in-game");
            }
            System.out.println("0. Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    jogo.exibirDetalhes();
                    break;
                case 2:
                    iniciarJogo(jogo);
                    break;
                case 3:
                    if (jogo instanceof JogoAAA) {
                        ((JogoAAA) jogo).mostrarGraficos();
                    } else if (jogo instanceof JogoIndie) {
                        ((JogoIndie) jogo).mostrarEstiloArtistico();
                    } else if (jogo instanceof JogoFreeToPlay) {
                        ((JogoFreeToPlay) jogo).mostrarComprasInGame();
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    public static void iniciarJogo(Jogo jogo) {
        jogo.iniciar();
    }
}
