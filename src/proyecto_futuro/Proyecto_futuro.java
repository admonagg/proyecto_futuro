/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_futuro;

/**
 *
 * @author linuxmint20
 */
public class Proyecto_futuro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Nombre, apellidos, modulos y horas de estudio del estudiante.
        int modulos;
        int hEstudio;

        modulos = 7;
        hEstudio = 10;

        String modulos1 = String.valueOf(modulos);
        String hEstudio1 = String.valueOf(hEstudio);

        String veredicto = Proyecto_futuro.veredicto(modulos1, hEstudio1);
        
        System.out.println("Estudiante " + args[0] + " " + args[1] + " " + args[2] + " " + ": " + veredicto);

    }

    static String veredicto(String valor1, String valor2) {

        if (valor1.equals(valor2)) {
            return "Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.";
        }
        if (Integer.valueOf(valor1) > Integer.valueOf(valor2)) {
            return "Poco tiempo de estudio. Debes dedicar más tiempo.";
        }
        return "Ideal. Trabajas los contenidos en casa.";

    }   
}
