public class Fabrica  {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("APLICATIVO TELEFONE INICIADO");{
            iphone.ligar();
            iphone.atender();
            iphone.iniciarCorreioVoz();
        }
        System.out.println("--------------------");

        System.out.println("NAVEGADOR WEB INICIADO"); {
            iphone.adicionarNovaAba();
            iphone.atualizarPagina();
            iphone.exibirPagina(null);
        }
        System.out.println("--------------------");

        System.out.println("APLICATIVO DE MUSICA INICIADO");{
            iphone.selecionarMusica();
            iphone.tocar();
            iphone.pausar();
        }
        System.out.println("--------------------");

    }
}