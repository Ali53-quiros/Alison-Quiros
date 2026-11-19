/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class Registro {
    private String nombreS;
    private String codigoS;
    private String nombreEm;
    private String cedulaEm;

    private Producto[] arregloProducto;
    private int cantidadP;

    public void registrarRegistro() {
        nombreS= JOptionPane.showInputDialog("Ingrese el nombre del supermercado:");
        codigoS= JOptionPane.showInputDialog("Ingrese el código del supermercado:");
        nombreEm= JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
        cedulaEm= JOptionPane.showInputDialog("Ingrese la cédula del empleado:");
        cantidadP= Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de productos que desea ingresar:"));
        arregloProducto = new Producto[cantidadP];
         for (int x = 0; x < arregloProducto.length; x++) {
            JOptionPane.showMessageDialog(null,"Registro del producto número " + (x + 1));
            String codigoP= JOptionPane.showInputDialog("Digite el código del producto:");
            String nombreP= JOptionPane.showInputDialog("Digite el nombre del producto:");
            int cantidadP= Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de productos:"));
            double precioBase= Double.parseDouble(JOptionPane.showInputDialog("Digite el precio base del producto:"));
            String tipoP = JOptionPane.showInputDialog("Seleccione el tipo de producto:\n"+ "1. Alimentos\n"+ "2. Bebidas\n"+ "3. Higiene\n"+ "4. Limpieza");

        }
    }
 
  public void mostrarRegistro() {

        double gananciaTotal = 0;

        String mensaje =  "SUPERMERCADO: " + nombreS+ "\nCódigo del supermercado: " + codigoS+ "\nEmpleado: " + nombreEm+ "\nCédula: " + cedulaEm+ "\n\nPRODUCTOS REGISTRADOS\n";

        for (int x = 0; x < arregloProducto.length; x++) {

             mensaje = mensaje
                    + "\n-----------------------------"+"\nNombre del producto: "+nombreP+"\nCodigo del producto: "+codigoP+"\nCantidad: "+cantidadP+"\nPrecio base: "+precioBase+"\nTipo de producto: "+tipoP+"\nPrecio bruto: "+precioBruto+ "\nGanancia esperada: ";

            gananciaTotal = gananciaTotal
                    + arregloProducto[x].getGanancia();
        }

        mensaje = mensaje
                + "\n\n-----------------------------" + "\nGANANCIA TOTAL ESPERADA: "+ gananciaTotal  + "\n\n-----------------------------";
            JOptionPane.showMessageDialog(null, mensaje);
    }
}


