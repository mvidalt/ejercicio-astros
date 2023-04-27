/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.astros;

public class Satelites extends Astros {

    private double distancia_planeta;
    private double orbita_planetarea;
    private String planeta;

    public Satelites(double distancia_planeta, double orbita_planetarea, String planeta, double radio, double rotacion, double masa, double temperatura, double gravedad) {
        super(radio, rotacion, masa, temperatura, gravedad);
        this.distancia_planeta = distancia_planeta;
        this.orbita_planetarea = orbita_planetarea;
        this.planeta = planeta;
    }

    public double getDistancia_planeta() {
        return distancia_planeta;
    }

    public void setDistancia_planeta(double distancia_planeta) {
        this.distancia_planeta = distancia_planeta;
    }

    public double getOrbita_planetarea() {
        return orbita_planetarea;
    }

    public void setOrbita_planetarea(double orbita_planetarea) {
        this.orbita_planetarea = orbita_planetarea;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    @Override
    public String muestra() {
        String detallesAstro = super.muestra();
        String detallesSatelite = "Satelite :\n"
                + " Distancia al planeta: " + distancia_planeta  + "\n"
                + " Órbita: " + orbita_planetarea  + "\n"
                + " Planeta: " + planeta  + "\n";
        return detallesSatelite + "\n " + detallesAstro;
    }

}
