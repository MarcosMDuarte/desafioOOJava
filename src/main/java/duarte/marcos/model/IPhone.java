package duarte.marcos.model;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private int volume;
    private String numero;
    private String paginaAtual;


    @Override
    public void tocarMusica() {
        System.out.println("Toca Música");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausar Música");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionar " + musica);
    }

    @Override
    public void ligar() {
        System.out.println("Realizar chamada de Telefone.");
    }

    @Override
    public void atender() {
        System.out.println("Atender chamada de Telefone.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciar correio de voz.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Acessar página da internet");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adiciona nova aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualiza página");
    }
}