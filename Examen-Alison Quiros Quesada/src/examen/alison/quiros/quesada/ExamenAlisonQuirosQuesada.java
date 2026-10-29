/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen.alison.quiros.quesada;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class ExamenAlisonQuirosQuesada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declarar
        int lealtad=0;
        double recargo=0;
        int descuento=0;
        int costobase=0;
        int recargogps=0;
        int total=0;
        int totalVIP=0;
        int lealtadv=0;
        String [] Yes={"Si","No"};
        String continuar ="S";
        String [] meses={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        //Registro del vehiculo
        int mes= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de mes: "));
        String cliente= JOptionPane.showInputDialog("Ingrese el nombre: ");
        int ced= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula: "));
        int cat= Integer.parseInt(JOptionPane.showInputDialog("Ingrese si es categoria VIP: (1= Si, 2= No"));
        while (continuar.equals("S")){
            int placa= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la placa del vehículo: "));
            String marca= JOptionPane.showInputDialog("Ingrese la marca del vehículo: ");
            double precio= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio base por día: "));
            int cant= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de dias de alquiler: "));
            int seguro= Integer.parseInt(JOptionPane.showInputDialog("Digite si el alquiler incluye seguro completo: (1= Si, 2= No"));
            int gps= Integer.parseInt(JOptionPane.showInputDialog("Digite si el alquiler incluye diapositivo GPS: (1= Si, 2= No"));
    
        //condicion
            if (cant >= 7) {
              costobase=(int) (precio*cant);
              lealtad=lealtad+5;
        }
            if (seguro==1) {
              recargo=5000+precio;
              lealtad=lealtad+2;
        }
            if (gps==1){
              recargogps=(int) (2000+precio);
         }      
            continuar=JOptionPane.showInputDialog("Desea registrar otro vehículo? (Sí= S, No= N");
      }    
      
            total=(int) (costobase+recargo+recargogps);
        if (cat==1){
           totalVIP=(int) (total-0.5);
           lealtadv=lealtad*2;
       }      
         
        JOptionPane.showMessageDialog(null, "================================="+"\n================================="+"\nRESUMEN FINAL DE LOS ALQUILERES"+"\n================================="+"\n================================="+"\nCliente: "+cliente+"\nCedula: "+ced+"\nCategoría: "+cat+"\nMes de registro: "+meses[mes-1]+"\n================================="+"\nCantidad de vehiculos procesados: "+"\nSubtotal antes de descuento VIP: "+total+"\nPuntos antes del bono VIP: "+lealtad+"\n***APLICANDO BENEFICIOS VIP****"+"\nTOTAL A PAGAR: "+totalVIP+"\n PUNTOS DE LEALTAD TOTALES: " +lealtadv+"\n=================================");
    
      
  
   }
}
