import java.time.LocalDateTime;

class Midia{
    private int id, tipo;
    private String descricao, autor, titulo;
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setTipo(int tipo){
        this.tipo = tipo;
    }
    public int getTipo(){
        return tipo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getAutor(){
        return autor;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return descricao;
    }
    public String toString(){
        return titulo + " - " + descricao + " - " + autor;
    }
}

class Filme extends Midia{
    private LocalDateTime duracao;
    public void setDuracao(LocalDateTime duracao){
        this.duracao = duracao;
    }
    public LocalDateTime getDuracao(){
        return duracao;
    }
    public String toString(){
        return super.toString() + " - " + duracao + '\n';
    }
}

class Serie extends Midia{
    private int temporadas;
    public void setTemporadas(int temporadas){
        this.temporadas = temporadas;
    }
    public int getTemporadas(){
        return temporadas;
    }
    public String toString(){
        return super.toString() + " - " + temporadas + '\n';
    }
}

class Livro extends Midia{
    private int paginas;
    public void setPaginas(int paginas){
        this.paginas = paginas;
    }
    public int getPaginas(){
        return paginas;
    }
    public String toString(){
        return super.toString() + " - " + paginas + '\n';
    }
}

//to do
    // nmidia, nfilme, nserie, nlivro
    // serialização xml em java