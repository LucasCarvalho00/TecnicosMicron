package br.com.micron.lucascarvalho.tecnicosmicron.BEAN;

import java.util.Date;

public class Coordenadas {

    private Integer IdEndereco;
    private String Latitude;
    private String Longitude;
    private Date Lasttime;

    public Coordenadas(Integer IdEndereco, String Latitude, String Longitude, Date Lasttime){
        super();
        this.IdEndereco = IdEndereco;
        this.Latitude = Latitude;
        this.Longitude = Longitude;
        this.Lasttime = Lasttime;
    }

    public Coordenadas(){
        super();
    }

    public Integer getIdEndereco() {
        return IdEndereco;
    }
    public void setIdEndereco(Integer IdEndereco) {
        this.IdEndereco = IdEndereco;
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
