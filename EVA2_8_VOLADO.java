/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_8_volado;

/**
 *
 * @author user
 */
public class EVA2_8_VOLADO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //numero aleatoreo en java: valores enteros 0 y 1
        // 0.2566
        //0.65656
        double moneda;
        moneda = Math.random();
        System.out.println("El valor de la moneda = " + moneda);
        
        // 0.5 es la mitad del rango
        if (moneda > 0.5 )
        System.out.println("CARA");
        else
       System.out.println("CRUZ");  
        
    }
    
}
