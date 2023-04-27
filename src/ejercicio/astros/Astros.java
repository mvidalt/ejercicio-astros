/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.astros;

/**
 *
 * @author migue
 */
public abstract class Astros {
    
    private double radio;
    private double rotacion;
    private double masa;
    private double temperatura_media;
    private double gravedad;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRotacion() {
        return rotacion;
    }

    public void setRotacion(double rotacion) {
        this.rotacion = rotacion;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getTemperatura() {
        return temperatura_media;
    }

    public void setTemperatura(double temperatura_media) {
        this.temperatura_media = temperatura_media;
    }

    public double getGravedad() {
        return gravedad;
    }

    public void setGravedad(double gravedad) {
        this.gravedad = gravedad;
    }
    
    public Astros(){
        this.radio = 0;
        this.rotacion = 0;
        this.masa = 0;
        this.temperatura_media = 0;
        this.gravedad = 0;
    }


    
    public Astros(double radio, double rotacion, double masa, double temperatura_media, double gravedad) {
        this.radio = radio;
        this.rotacion = rotacion;
        this.masa = masa;
        this.temperatura_media = temperatura_media;
        this.gravedad = gravedad;
    }
    

public String muestra() {
    return "--------------- \n"
            + "Info Astro:\n"
            + "Radio: " + radio + "\n" +
           "Rotación: " + rotacion + "\n" +
           "Masa: " + masa + "\n" +
           "Temperatura media: " + temperatura_media + "\n" +
           "Gravedad: " + gravedad+'\n';
}



}
