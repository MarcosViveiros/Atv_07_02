public class Historico {
    private Pilha<Pagina> pilha;
    private Pagina paginaAtual;

    public Historico(){
        this.pilha = new Pilha<>();
        this.paginaAtual = null;
    }

    public void visitarPagina(String url, String titulo){
        if(paginaAtual != null){
            pilha.push(paginaAtual);
        }paginaAtual = new Pagina(url, titulo);
    }

    public void voltar(){
        if(!pilha.empty()){
            paginaAtual = pilha.pop();
        }
    }

    public String verPaginaAtual(){
        return paginaAtual != null ? paginaAtual.toString() : "Nenhuma pagina visitada";
    }
}
