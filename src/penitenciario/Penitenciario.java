/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penitenciario;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Penitenciario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
       int N, MESES, cif=0;//cif contador de if
       
       String nombre;
        System.out.println("DIGITE EL NUMERO DE INTERNOS EN EL PENITENCIARIO: ");
        N=leer.nextInt();
        String [][]reporte = new String [N][2];
 
       for (int c=0;c<N;c++){
           System.out.println("DIGITE EL NOMBRE DEL INTERNO #"+(c+1));
           nombre=leer.next();
           System.out.println("DIGITE EL NUMERO DE CONDENA EN MESES");
           MESES=leer.nextInt();
           
           if(MESES<36){
           cif++;
           reporte [c][0] = nombre;
           reporte [c][1] = String.valueOf(MESES);
           }
           
           
       }
           
          
       for(int i=0;i<N;i++){
           if( (reporte[i][0] != null) && (reporte[i][1] != null)){
           System.out.println("Nombre del recluso "+reporte[i][0]+" numero #"+(i+1));
           System.out.println("Condena en meses: "+reporte[i][1]);
       }       
       }
        System.out.println("EL NUMERO DE INTERNOS CON MENOS DE 36 MESES DE CONDENA ES DE: "+cif);
        
    }
    
}
    

