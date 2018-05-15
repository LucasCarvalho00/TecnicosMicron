package br.com.micron.lucascarvalho.tecnicosmicron.BEAN;

public class Parametros {

    private Integer Id;
    private String Atributo;
    private Integer Indice;
    private String Valor;

    public Parametros(Integer Id, String Atributo, Integer Indice, String Valor){
        super();
        this.Id = Id;
        this.Atributo = Atributo;
        this.Indice = Indice;
        this.Valor = Valor;
    }

    public Parametros(){
        super();
    }

    public Integer getId() {
        return Id;
    }
    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getAtributo() {
        return Atributo;
    }
    public void setAtributo(String Atributo) {
        this.Atributo = Atributo;
    }

    public Integer getIndice() {
        return Indice;
    }
    public void setIndice(Integer Indice) {
        this.Indice = Indice;
    }

    public String getValor() {
        return Valor;
    }
    public void setValor(String Valor) {
        this.Valor = Valor;
    }
}
