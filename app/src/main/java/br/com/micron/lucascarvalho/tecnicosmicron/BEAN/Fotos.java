package br.com.micron.lucascarvalho.tecnicosmicron.BEAN;

public class Fotos {

    private Integer Id;
    private String Nome;
    private Integer Categoria;
    private String Foto;

    public Fotos(Integer Id, String Nome, Integer Categoria, String Foto){
        super();
        this.Id = Id;
        this.Nome = Nome;
        this.Categoria = Categoria;
        this.Foto = Foto;
    }

    public Fotos(){
        super();
    }

    public Integer getId() {
        return Id;
    }
    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getNome() {
        return Nome;
    }
    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    public Integer getCategoria() {
        return Categoria;
    }
    public void setCategoria(Integer Categoria) {
        this.Categoria = Categoria;
    }

    public String getFoto() {
        return Foto;
    }
    public void setFoto(String Foto) {
        this.Foto = Foto;
    }
}