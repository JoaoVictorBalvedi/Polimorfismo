public class Jogo {
    protected String nome;
    protected double preco;
    protected String desenvolvedor;

    public Jogo() {
        this.nome = "Sem Nome";
        this.preco = 0.0;
        this.desenvolvedor = "Desconhecido";
    }

    public Jogo(String nome, double preco, String desenvolvedor) {
        this.nome = nome;
        this.preco = preco;
        this.desenvolvedor = desenvolvedor;
    }

    public void exibirDetalhes() {
        System.out.println("Jogo: " + nome + " | Desenvolvedor: " + desenvolvedor + " | Preço: " + preco);
    }

    public void iniciar() {
        System.out.println("Iniciando o jogo " + nome + "...");
    }
}