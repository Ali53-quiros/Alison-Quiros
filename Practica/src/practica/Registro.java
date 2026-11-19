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

    private Producto[] arregloProductos;
    private int cantidadP;

    public void registrarInventario() {
        nombreS= JOptionPane.showInputDialog("Ingrese el nombre del supermercado:");
        codigoS= JOptionPane.showInputDialog("Ingrese el código del supermercado:");
        nombreEm= JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
        cedulaEm= JOptionPane.showInputDialog("Ingrese la cédula del empleado:");
        cantidadP= Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de productos que desea ingresar:"));
        arregloProductos = new Producto[cantidadP];
         for (int x = 0; x < arregloProductos.length; x++) {
            JOptionPane.showMessageDialog(null,"Registro del producto número " + (x + 1));
            String codigoP= JOptionPane.showInputDialog("Digite el código del producto:");
            String nombreP= JOptionPane.showInputDialog("Digite el nombre del producto:");
            int cantidad= Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de productos:"));
            double precioBase= Double.parseDouble(JOptionPane.showInputDialog("Digite el precio base del producto:"));
            String tipoProducto = JOptionPane.showInputDialog("Seleccione el tipo de producto:\n"+ "1. Alimentos\n"+ "2. Bebidas\n"+ "3. Higiene\n"+ "4. Limpieza");

            arregloProductos[x] = new Producto(codigoP,nombreP,cantidadP,precioBase,tipoProducto);
        }
    }
 
  public void mostrarRegistro() {

        double gananciaTotal = 0;

        String mensaje =  "SUPERMERCADO: " + nombreS+ "\nCódigo del supermercado: " + codigoS+ "\nEmpleado: " + nombreEm+ "\nCédula: " + cedulaEm+ "\n\nPRODUCTOS REGISTRADOS\n";

        for (int x = 0; x < arregloProductos.length; x++) {

            mensaje = mensaje
                    + "\n-----------------------------"
                    + "\nCódigo del producto: "+ arregloProductos[x].getCodigoP()
                    + "\nNombre del producto: "+ arregloProductos[x].getNombreP()
                    + "\nCantidad: "+ arregloProductos[x].getCantidadP()
                    + "\nPrecio base: "+ arregloProductos[x].getPrecioBase()
                    + "\nTipo de producto: "+ arregloProductos[x].getNombreTipoP()
                    + "\nPrecio bruto: "+ arregloProductos[x].getPrecioBruto()
                    + "\nGanancia esperada: "+ arregloProductos[x].getGanancia();
                gananciaTotal = gananciaTotal + arregloProductos[x].getGanancia();
        }

        mensaje = mensaje
                + "\n\n-----------------------------" + "\nGANANCIA TOTAL ESPERADA: "+ gananciaTotal;
            JOptionPane.showMessageDialog(null, mensaje);
    }
}


