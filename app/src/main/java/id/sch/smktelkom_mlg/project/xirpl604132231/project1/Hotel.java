package id.sch.smktelkom_mlg.project.xirpl604132231.project1;

import java.io.Serializable;

/**
 * Created by Mahendra on 09/11/2016.
 */
public class Hotel implements Serializable {
    public String judul;
    public String deskripsi;
    public String foto;

    public Hotel(String judul, String deskripsi, String foto) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.foto = foto;
    }


}
