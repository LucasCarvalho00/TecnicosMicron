package br.com.micron.lucascarvalho.tecnicosmicron.BEAN;

public class Cliente {

    private Integer Id;
    private String Nome;

    public Cliente(Integer Id, String Nome){
        super();
        this.Id = Id;
        this.Nome = Nome;
    }

    public Cliente(){
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
}
