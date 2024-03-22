/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17_bisiesto;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EVA2_17_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int año;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce un año");
        año = captu.nextInt();
        
        if(año  % 100!=0){
          if(año % 4 == 0)
              System.out.println("Año Bisiesto");
          else 
              System.out.println("No Bisiesto");
          if (año % 400 == 0)
              System.out.println(" Bisiesto");
          


          

              
        }
        
    }
    
}
