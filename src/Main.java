public class Main {
    public static void main(String[] args) {
        Iphone iphone1 = new Iphone();

        iphone1.selecionarMusica("Radio Gaga");
        iphone1.tocarMusica();
        iphone1.pausarMusica();

        iphone1.ligar("11 987654321");
        iphone1.atenderLigacao();
        iphone1.iniciarCorreioVoz();

        iphone1.exibirPagina("www.apple.com");
        iphone1.atualizarPagina();
        iphone1.adicionarNovaAba();

    }
}