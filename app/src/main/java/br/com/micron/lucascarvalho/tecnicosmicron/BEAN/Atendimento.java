package br.com.micron.lucascarvalho.tecnicosmicron.BEAN;

public class Atendimento {

    private String Protocolo;
    private Integer IdCliente;
    private Integer IdEndereco;
    private Integer IdEnderecoMudanca;
    private String Solicitacao;
    private String Login;
    private String Senha;
    private String Agendamento;
    private String Situacao;

    public Atendimento(String Protocolo, Integer IdCliente, Integer IdEndereco, Integer IdEnderecoMudanca, String Solicitacao, String Login, String Senha, String Agendamento, String Situacao){
        super();
        this.Protocolo = Protocolo;
        this.IdCliente = IdCliente;
        this.IdEndereco = IdEndereco;
        this.IdEnderecoMudanca = IdEnderecoMudanca;
        this.Solicitacao = Solicitacao;
        this.Login = Login;
        this.Senha = Senha;
        this.Agendamento = Agendamento;
        this.Situacao = Situacao;
    }

    public Atendimento(){
        super();
    }

    public String getProtocolo() {
        return Protocolo;
    }
    public void setProtocolo(String Protocolo) {
        this.Protocolo = Protocolo;
    }

    public Integer getIDCliente() {
        return IdCliente;
    }
    public void setIDCliente(Integer IDCliente) {
        this.IdCliente = IDCliente;
    }

    public Integer getIDEndereco() {
        return IdEndereco;
    }
    public void setIDEndereco(Integer IDEndereco) {
        this.IdEndereco = IDEndereco;
    }

    public Integer getIDEnderecoMudanca() {
        return IdEnderecoMudanca;
    }
    public void setIDEnderecoMudanca(Integer IDEnderecoMudanca) {
        this.IdEnderecoMudanca = IDEnderecoMudanca;
    }

    public String getSolicitacao() {
        return Solicitacao;
    }
    public void setSolicitacao(String Solicitacao) {
        this.Solicitacao = Solicitacao;
    }

    public String getLogin() {
        return Login;
    }
    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getSenha() {
        return Senha;
    }
    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getAgendamento() {
        return Agendamento;
    }
    public void setAgendamento(String Agendamento) {
        this.Agendamento = Agendamento;
    }

    public String getSituacao() {
        return Situacao;
    }
    public void setSituacao(String Situacao) {
        this.Situacao = Situacao;
    }
}
