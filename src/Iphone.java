public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    public void ligar () {
        System.out.println("Ligando");
    }
    public void atender() {
        System.out.println("Atendeu");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Iniciou a ligação.");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo a página.");
    }
    public void adicionarNovaAba() {
        System.out.println("Adicionou a página.");
    }
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    public void tocar() {
        System.out.println("Musica tocando.");
    }
    public void pausar() {
        System.out.println("Musica pausada.");
    }
    public void selecionarMusica() {
        System.out.println("Musica selecionada.");
    }

}
