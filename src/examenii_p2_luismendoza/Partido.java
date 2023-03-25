/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenii_p2_luismendoza;

import java.io.Serializable;

/**
 *
 * @author luiscarlomendoza
 */
public class Partido implements Serializable{
    private Equipo equipo1;
    private Equipo equipo2;
    private int resultado1;
    private int resultado2;

    public Partido() {
    }

    public Partido(Equipo equipo1, Equipo equipo2, int resultado1, int resultado2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.resultado1 = resultado1;
        this.resultado2 = resultado2;
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }


    public int getResultado1() {
        return resultado1;
    }

    public void setResultado1(int resultado1) {
        this.resultado1 = resultado1;
    }

    public int getResultado2() {
        return resultado2;
    }

    public void setResultado2(int resultado2) {
        this.resultado2 = resultado2;
    }

    @Override
    public String toString() {
        return equipo1 + " : " + resultado1 + " - " + " " + equipo2 + " : " + resultado2 + "\n";
    }
    
    
}
