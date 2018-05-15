package br.com.micron.lucascarvalho.tecnicosmicron.BEAN;


public class Endereco {

    private Integer Id;
    private Integer IdCliente;
    private String CEP;
    private String UF;
    private String Cidade;
    private String Bairro;
    private String Endereco;
    private String Numero;
    private String Complemento;
    private String Referencia;

    public Endereco(Integer Id, Integer IdCliente, String CEP, String UF, String Cidade, String Bairro, String Endereco, String Numero, String Complemento, String Referencia) {
        super();
        this.Id = Id;
        this.IdCliente = IdCliente;
        this.CEP = CEP;
        this.UF = UF;
        this.Cidade = Cidade;
        this.Bairro = Bairro;
        this.Endereco = Endereco;
        this.Numero = Numero;
        this.Complemento = Complemento;
        this.Referencia = Referencia;
    }

    public Endereco(){
        super();
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Integer getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(Integer IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getComplemento() {
        return Complemento;
    }

    public void setComplemento(String Complemento) {
        this.Complemento = Complemento;
    }

    public String getReferencia() {
        return Referencia;
    }

    public void setReferencia(String Referencia) {
        this.Referencia = Referencia;
    }
}
