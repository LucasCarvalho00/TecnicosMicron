package br.com.micron.lucascarvalho.tecnicosmicron.BEAN;

public class Modelo {

    private Integer Id;
    private Integer Fabricante;
    private String Nome;

    public Modelo(Integer Id, Integer Fabricante, String Nome){
        super();
        this.Id = Id;
        this.Fabricante = Fabricante;
        this.Nome = Nome;
    }

    public Modelo(){
        super();
    }

    public Integer getId() {
        return Id;
    }
    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Integer getFabricante() {
        return Fabricante;
    }
    public void setFabricante(Integer Fabricante) {
        this.Fabricante = Fabricante;
    }

    public String getNome() {
        return Nome;
    }
    public void setNome(String Nome) {
        this.Nome = Nome;
    }
}