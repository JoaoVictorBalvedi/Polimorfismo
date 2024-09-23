public class JogoAAA extends Jogo {
    private int nivelGraficos;

    public JogoAAA(String nome, double preco, String desenvolvedor, int nivelGraficos) {
        super(nome, preco, desenvolvedor);
        this.nivelGraficos = nivelGraficos;
    }

    @Override
    public void iniciar() {
        System.out.println("Iniciando o jogo AAA com gráficos no nível " + nivelGraficos);
    }

    public void mostrarGraficos() {
        System.out.println("Exibindo gráficos no nível " + nivelGraficos);
    }
}
