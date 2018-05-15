package br.com.micron.lucascarvalho.tecnicosmicron.BEAN;

public class Telefone {

    private Integer IdCliente;
    private String Telefone;
    private String Tipo;


    public Telefone(Integer IdCliente, String Telefone, String Tipo){
        super();
        this.IdCliente = IdCliente;
        this.Telefone = Telefone;
        this.Tipo = Tipo;
    }

    public Telefone(){
        super();
    }

    public Integer getIdCliente() {
        return IdCliente;
    }
    public void setIdCliente(Integer IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getTelefone() {
        return Telefone;
    }
    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getTipo() {
        return Tipo;
    }
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
}
