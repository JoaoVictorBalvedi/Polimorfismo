public class JogoIndie extends Jogo {
    private String estiloArtistico;

    public JogoIndie(String nome, double preco, String desenvolvedor, String estiloArtistico) {
        super(nome, preco, desenvolvedor);
        this.estiloArtistico = estiloArtistico;
    }

    @Override
    public void iniciar() {
        System.out.println("Iniciando o jogo Indie com estilo artístico " + estiloArtistico);
    }

    public void mostrarEstiloArtistico() {
        System.out.println("Estilo artístico: " + estiloArtistico);
    }
}
