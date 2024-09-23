public class JogoFreeToPlay extends Jogo {
    private boolean possuiComprasInGame;

    public JogoFreeToPlay(String nome, double preco, String desenvolvedor, boolean possuiComprasInGame) {
        super(nome, preco, desenvolvedor);
        this.possuiComprasInGame = possuiComprasInGame;
    }

    @Override
    public void iniciar() {
        System.out.println("Iniciando o jogo Free-to-Play, compras in-game disponíveis: " + possuiComprasInGame);
    }

    public void mostrarComprasInGame() {
        if (possuiComprasInGame) {
            System.out.println("Este jogo possui compras in-game.");
        } else {
            System.out.println("Este jogo não possui compras in-game.");
        }
    }
}
