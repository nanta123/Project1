package id.sch.smktelkom_mlg.project.xirpl604132231.project1;

import android.graphics.drawable.Drawable;

import java.io.Serializable;


/**
 * Created by Mahendra on 09/11/2016.
 */
public class Hotel_list implements Serializable {
    public String judul;
    public String deskripsi;
    public Drawable foto;

    public Hotel_list(String judul, String deskripsi, Drawable foto) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.foto = foto;
    }
}
