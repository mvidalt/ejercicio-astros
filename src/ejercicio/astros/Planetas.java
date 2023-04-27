/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.astros;

/**
 *
 * @author migue
 */
public class Planetas extends Astros {

    private double distancia_sol;
    private double orbita_al_sol;
    private boolean satelites;

    public Planetas(double distancia_sol, double orbita_al_sol, boolean satelites, double radio, double rotacion, double masa, double temperatura_media, double gravedad) {
        super(radio, rotacion, masa, temperatura_media, gravedad);
        this.distancia_sol = distancia_sol;
        this.orbita_al_sol = orbita_al_sol;
        this.satelites = satelites;
    }

    public double getDistancia_sol() {
        return distancia_sol;
    }

    public void setDistancia_sol(double distancia_sol) {
        this.distancia_sol = distancia_sol;
    }

    public double getOrbita_al_sol() {
        return orbita_al_sol;
    }

    public void setOrbita_al_sol(double orbita_al_sol) {
        this.orbita_al_sol = orbita_al_sol;
    }

    public boolean isSatelites() {
        return satelites;
    }

    public void setSatelites(boolean satelites) {
        this.satelites = satelites;
    }

    public String muestraAstros() {
        return "Astro: " + super.muestra();
    }

    @Override
    public String muestra() {
        String detallesAstro = super.muestra();
        String detallesSatelite = "Planeta :\n"
                + " Distancia: " + distancia_sol + "\n"
                + "Órbita: " + orbita_al_sol + "\n"
                + "Satélites: " + satelites + "\n";
        return detallesSatelite + "\n " + detallesAstro;
               
    }

    @Override
    public String toString() {
        return "Planetas{" + "distancia_sol=" + distancia_sol + ", orbita_al_sol=" + orbita_al_sol + ", satelites=" + satelites + '}';
    }
}
