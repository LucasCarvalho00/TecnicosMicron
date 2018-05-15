package br.com.micron.lucascarvalho.tecnicosmicron.BEAN;

import java.util.Date;

public class Trajetorio {

    private Integer IdTecnico;
    private Date Datahora;
    private String Latitude;
    private String Longitude;
    private Date Lasttime;

    public Trajetorio(Integer IdTecnico, Date Datahora, String Latitude, String Longitude, Date Lasttime){
        super();
        this.IdTecnico = IdTecnico;
        this.Datahora = Datahora;
        this.Latitude = Latitude;
        this.Longitude = Longitude;
        this.Lasttime = Lasttime;
    }

    public Trajetorio(){
        super();
    }

    public Integer getIdTecnico() {
        return IdTecnico;
    }
    public void setIdTecnico(Integer IdTecnico) {
        this.IdTecnico = IdTecnico;
    }

    public Date getDatahora() {
        return Datahora;
    }
    public void setDatahora(Date Datahora) {
        this.Datahora = Datahora;
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
    public void setLasttime(Date Longitude) {
        this.Lasttime = Lasttime;
    }
}