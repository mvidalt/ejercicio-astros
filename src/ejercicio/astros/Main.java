/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.astros;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author migue
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Planetas> planetasList = new ArrayList<>();
// Crear los planetas del sistema solar

// Mercurio
        Planetas mercurio = new Planetas(57.91, 87.97, false, 2439.7, 1407.6, 0.33, 167, 3.7);

// Venus
        Planetas venus = new Planetas(108.2, 224.7, false, 6051.8, -5832.5, 4.87, 464, 8.9);

// Tierra
        Planetas tierra = new Planetas(149.6, 365.26, true, 6371, 23.93, 5.97, 15, 9.8);

// Marte
        Planetas marte = new Planetas(227.9, 686.98, true, 3389.5, 24.62, 0.64, -63, 3.7);

// Júpiter
        Planetas jupiter = new Planetas(778.5, 4332.82, true, 69911, 9.93, 1898, -110, 23.1);

// Saturno     
        Planetas saturno = new Planetas(1433.5, 10759.22, true, 58232, 10.66, 568, -140, 9);

// Urano
        Planetas urano = new Planetas(2872.5, 30688.5, true, 25362, -17.24, 86.8, -195, 8.7);

// Neptuno
        Planetas neptuno = new Planetas(4495.1, 60182, true, 24622, 16.11, 102, -200, 11);

// Plutón
        Planetas pluton = new Planetas(5906.4, 90560, true, 1188.3, -153.3, 0.0146, -229, 0.6);

        //Satelites de Tierra
        Satelites luna = new Satelites(384400, 27.3, "Tierra", 1737.1, 27.3, 0.073, 220, 1.62);

        // Satelites de Marte
        Satelites phobos = new Satelites(9377, 0.319, "Marte", 11.1, 0.3189, 1.072 * Math.pow(10, -9), -20, 0.0006);
        Satelites deimos = new Satelites(23460, 1.26, "Marte", 6.2, 1.26, 1.476 * Math.pow(10, -10), -30, 0.00033);

        // Satélites de Júpiter
        Satelites io = new Satelites(421800, 1.769, "Júpiter", 1821.6, 0.004, 8.94E22, 130, 1.796);
        Satelites europa = new Satelites(671100, 3.551, "Júpiter", 1560.8, 0.47, 4.8E22, 102, 1.314);
        Satelites ganimedes = new Satelites(1070400, 7.155, "Júpiter", 2634.1, 0.177, 1.48E23, 110, 1.428);
        Satelites calisto = new Satelites(1882700, 16.69, "Júpiter", 2410.3, 0.192, 1.08E23, 134, 1.235);
        Satelites amaltea = new Satelites(181000, 0.498, "Júpiter", 167.3, 0.498, 2.08E18, 80, 0.007);
        Satelites himalia = new Satelites(11480000, 251.06, "Júpiter", 140, 0.409, 3.28E18, 80, 0.036);
        Satelites elara = new Satelites(11741000, 259.64, "Júpiter", 86, 0.433, 8.7E17, 80, 0.04);
        Satelites pasifae = new Satelites(23523000, 735.5, "Júpiter", 50, 0.369, 1.91E17, 80, 0.004);
        Satelites sinope = new Satelites(23799000, 758.5, "Júpiter", 38, 0.397, 1.03E17, 80, 0.003);

        //Satelites de Saturno
        Satelites encelado = new Satelites(238020, 0.9424218, "Saturno", 252, 1.4, 1.08e20, -201, 0.113);
        Satelites titan = new Satelites(1.22187e6, 15.945, "Saturno", 2575, 0.36, 1.3452e23, -179, 1.352);
        Satelites mimas = new Satelites(185404, 0.942422, "Saturno", 198, 0.9, 3.8e19, -201, 0.064);

        //Satelites de Urano
        Satelites oberon = new Satelites(583520, 13.46, "Urano", 761.4, -0.38, 3.014e20, -197, 0.346);
        Satelites titania = new Satelites(435910, 8.71, "Urano", 788.9, -0.34, 3.486e20, -193, 0.38);
        Satelites umbriel = new Satelites(266300, 4.144, "Urano", 584.7, -0.36, 1.275e20, -203, 0.23);

        //Satelites de Neptuno
        Satelites triton = new Satelites(354759, -5.877, "Neptuno", 1353.4, 5.87, 2.14e22, -235, 0.78);
        Satelites proteus = new Satelites(117647, 1.122, "Neptuno", 210, -1.1, 5.02e19, -220, 0.063);
        Satelites nereida = new Satelites(5513813, 360.136, "Neptuno", 170, -360.136, 3.16e19, -218, 0.04);

        //Satelites de Pluton
        Satelites caronte = new Satelites(19591, 6.387, "Plutón", 606, 6.39, 1.586e21, -233, 0.28);
        Satelites nix = new Satelites(48694, 24.86, "Plutón", 54, -24.86, 4.5e16, -227, 0.005);
        Satelites hydra = new Satelites(64583, 38.2, "Plutón", 43, -38.2, 4.5e16, -223, 0.005);


        Scanner entrada = new Scanner(System.in);
        String nombreAstro;

        while (true) {
            System.out.println("¿Qué astro desea buscar? (Escriba 'salir' para terminar)");
            nombreAstro = entrada.nextLine();

            if (nombreAstro.equalsIgnoreCase("salir")) {
                System.out.println("¡Hasta luego!");
                break;
            }

            switch (nombreAstro) {
                case "Mercurio":
                    System.out.print(mercurio.muestra());
                    break;
                case "Venus":
                    System.out.print(venus.muestra());
                    break;
                case "Tierra":
                    System.out.print(tierra.muestra());
                    break;
                case "Marte":
                    System.out.print(marte.muestra());
                    break;
                case "Jupiter":
                    System.out.print(jupiter.muestra());
                    break;
                case "Saturno":
                    System.out.print(saturno.muestra());
                    break;
                case "Urano":
                    System.out.print(urano.muestra());
                    break;
                case "Neptuno":
                    System.out.print(neptuno.muestra());
                    break;
                case "Pluton":
                    System.out.print(pluton.muestra());
                    break;
                case "Luna":
                    System.out.print(luna.muestra());
                    break;
                case "Phobos":
                    System.out.print(phobos.muestra());
                    break;
                case "Deimos":
                    System.out.print(deimos.muestra());
                    break;
                case "Io":
                    System.out.print(io.muestra());
                    break;
                case "Europa":
                    System.out.print(europa.muestra());
                    break;
                case "Ganimedes":
                    System.out.print(ganimedes.muestra());
                    break;
                case "Calisto":
                    System.out.print(calisto.muestra());
                    break;
                case "Amaltea":
                    System.out.print(amaltea.muestra());
                    break;
                case "Himalia":
                    System.out.print(himalia.muestra());
                    break;
                case "Elara":
                    System.out.print(elara.muestra());
                    break;
                case "Pasifae":
                    System.out.print(pasifae.muestra());
                    break;
                case "Sinope":
                    System.out.print(sinope.muestra());
                    break;
                default:
                    System.out.println("Astro no encontrado.");
                    break;
            }

        }
    }
}
