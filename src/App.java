
public class App {
    public static void main(String[] args) throws Exception {        
        Historico h = new Historico();

        h.visitarPagina("google.com", "Google");
        System.out.println(h.verPaginaAtual());
    }
}