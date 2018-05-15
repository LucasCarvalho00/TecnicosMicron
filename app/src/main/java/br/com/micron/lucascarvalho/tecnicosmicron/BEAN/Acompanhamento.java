package br.com.micron.lucascarvalho.tecnicosmicron.BEAN;

import java.sql.Date;

public class Acompanhamento {

    private String Protocolo;
    private Date Datahora;
    private String Tipo;
    private String Latitude;
    private String Longitude;
    private Date Lasttime;

    public Acompanhamento(String Protocolo, Date Datahora, String Tipo, String Latitude, String Longitude, Date Lasttime) {
        super();
        this.Protocolo = Protocolo;
        this.Datahora = Datahora;
        this.Tipo = Tipo;
        this.Latitude = Latitude;
        this.Longitude = Longitude;
        this.Lasttime = Lasttime;
    }

    public Acompanhamento() {
        super();
    }

    public String getProtocolo() {
        return Protocolo;
    }
    public void setProtocolo(String Protocolo) {
        this.Protocolo = Protocolo;
    }

    public Date getDatahora() {
        return Datahora;
    }
    public void setDatahora(Date Datahora) {
        this.Datahora = Datahora;
    }

    public String getTipo() {
        return Tipo;
    }
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getLatitude() {
        return Latitude;
    }
    public void setLatitude(String Latitude) {
        this.Latitude = Latitude;
    }

    public String getLongitude() {
        return Longitude;
    }
    public void setLongitude(String Longitude) {
        this.Longitude = Longitude;
    }

    public Date getLasttime() {
        return Lasttime;
    }
    public void setLasttime(Date Lasttime) {
        this.Lasttime = Lasttime;
    }
}
