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
public class Producto {
   
    private String nombreP;
    private String codigoP;
    private int cantidadP;
    private String tipoP;
    private double precioBase;
    private double precioBruto;
    private double ganancia;

    public Producto(String nombreP, String codigoP, int cantidadP, String tipoP, double precioBase, double precioBruto, double ganancia) {
        this.nombreP = nombreP;
        this.codigoP = codigoP;
        this.cantidadP = cantidadP;
        this.tipoP = tipoP;
        this.precioBase = precioBase;
        this.precioBruto = precioBruto;
        this.ganancia = ganancia;
        
        calcularPrecioBruto();
        calcularGanancia();
}        
    Public void calcularPrecioBruto() {

        switch (tipoP) {

            case "1":
                precioBruto = precioBase * 0.20 + precioBase;
                break;

            case "2":
                precioBruto = precioBase * 0.30 + precioBase;
                break;

            case "3":
                precioBruto = precioBase * 0.25 + precioBase + 500;
                break;

            case "4":
                precioBruto = precioBase * 0.19
                        + precioBase * 0.04 + 1000 + precioBase;
                break;
        }
    }
 public void calcularGanancia() {
 ganancia = (precioBruto - precioBase)* cantidadP;
    }
 public String getCodigoProducto() {
    return codigoP;
    }
  
    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getCodigoP() {
        return codigoP;
    }

    public void setCodigoP(String codigoP) {
        this.codigoP = codigoP;
    }

    public int getCantidadP() {
        return cantidadP;
    }

    public void setCantidadP(int cantidadP) {
        this.cantidadP = cantidadP;
    }

    public String getTipoP() {
        return tipoP;
    }

    public void setTipoP(String tipoP) {
        this.tipoP = tipoP;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getPrecioBruto() {
        return precioBruto;
    }

    public void setPrecioBruto(double precioBruto) {
        this.precioBruto = precioBruto;
    }

    public double getGanancia() {
        return ganancia;
    }

    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }
    
}
public String getNombreTipoProducto() {

    switch (tipoP) {

        case "1":
            return "Alimentos";

        case "2":
            return "Bebidas";

        case "3":
            return "Higiene";

        case "4":
            return "Limpieza";

        default:
            return "Tipo no definido";
    }
}

