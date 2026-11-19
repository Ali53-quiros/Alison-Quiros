/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Registro registro= new Registro();

        registro.registrarInventario();

        registro.mostrarInventario();
    }
    
}
