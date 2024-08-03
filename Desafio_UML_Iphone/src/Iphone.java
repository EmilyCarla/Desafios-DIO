public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorDaInternet {

    @Override
    public void tocar() {
        System.out.println("Tocando música atual");
    }

    @Override
    public void pausar() {
        System.out.println("Música atual pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecione a música desejada: " + musica);
    }

    @Override
    public void ligar() {
        System.out.println("Iniciando ligação");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }


    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }


    public static void main(String[] args) {
        
        Iphone meuIphone = new Iphone();

        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Lost in Paradise");

        meuIphone.ligar();
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        meuIphone.exibirPagina("dio.me");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();

    }
   
}
