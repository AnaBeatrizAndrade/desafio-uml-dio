import com.desafio.IPhone;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();

        iPhone.adicionarNovaAba();
        iPhone.exibirPagina();
        iPhone.atualizarPagina();

        iPhone.ligar();

        iPhone.selecionarMusica();
        iPhone.tocar();
    }
}