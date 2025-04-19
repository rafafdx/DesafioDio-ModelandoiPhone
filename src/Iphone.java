public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atenderLigacao() {

    }

    @Override
    public void iniciarCorreioVoz() {

    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Acessando o site: " + url);
    }

    @Override
    public void adicionarNovaAba() {

    }

    @Override
    public void atualizarPagina() {

    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Tocando: " + musica);
    }

    @Override
    public void tocarMusica() {

    }

    @Override
    public void pausarMusica() {

    }
}
