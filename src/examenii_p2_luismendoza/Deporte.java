/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenii_p2_luismendoza;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author luiscarlomendoza
 */
public class Deporte implements Serializable{
    private String nombre;
    private String periodo;
    private ArrayList <Torneo> torneos = new ArrayList();

    public Deporte() {
    }

    public Deporte(String nombre, String periodo) {
        this.nombre = nombre;
        this.periodo = periodo;
    }



    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public ArrayList<Torneo> getTorneos() {
        return torneos;
    }

    public void setTorneos(ArrayList<Torneo> torneos) {
        this.torneos = torneos;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
