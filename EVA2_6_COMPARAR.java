/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_comparar;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EVA2_6_COMPARAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CUANDO ES EL MAYOR VALOR ENTERO DOS NUMEROS
        // PIDAN AL USUARIO DOS VALORES ENTEROS 
        int num1, num2;
        Scanner captu = new Scanner (System.in);
        System.out.println("Valor 1:");
        num1 = captu.nextInt();
         System.out.println("Valor 2:");
        num2 = captu.nextInt();
        // CUAL ES EL MAYOR
        if (num1 > num2)
         System.out.println(num1 +" Es mayor!!!");
        else
            if(num1 == num2) // es igual que num2
        System.out.println("Son iguales ");
            else 
        System.out.println(num2 +" Es mayor!!!");   
         }
    }
