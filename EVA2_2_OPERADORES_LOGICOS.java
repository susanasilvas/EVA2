/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_operadores_logicos;

/**
 *
 * @author user
 */
public class EVA2_2_OPERADORES_LOGICOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean A,B ;
        A = false;
        B = false;
        boolean resu;
        //OPERADOR
        resu = A && B;
        System.out.println("Resu = " + resu);
        A = true;
        B = false;
        resu = A && B;
        System.out.println("Resu = " + resu);
        A = true;
        B = true;
        resu = A && B;
        System.out.println("Resu = " + resu);
        A = false;
        B = false;
        resu = A || B;
        System.out.println("Resu (or) = " + resu);
        A = true;
        B = false;
        resu = A || B;
        System.out.println("Resu (or) = " + resu);
    }
    
    
}
