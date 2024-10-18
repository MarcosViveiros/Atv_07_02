public class Pagina {
    private String url;
    private String titulo;

    public Pagina(String url, String titulo){
        this.url = url;
        this.titulo = titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getUrl() {
        return url;
    }
    @Override
    public String toString() {
        return titulo + " ("+ url +")";
    }
}
