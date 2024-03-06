/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_operadores;

/**
 *
 * @author user
 */
public class EVA2_1_OPERADORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // OPERADORES ARITMÉTICOS:
        //SUMA+, RESTA -, MULTIPLICACIÓN *, DIVISIÓN /
        
        int num1, num2;
        num1 = 5;
        num2 = 3;
        int suma = num1 + num2; // operador de suma +
        // Si el operador + uno de los terrminos es
        //una cadena, todo se combierte a cadena y se unen
        // concatenación: union de cadena de texto
        System.out.println("La suma es" + suma);
        boolean prueba = true;
        System.out.println("El valor de la prueba es " + prueba);
        //MULTIPLICACIÓN *
        int multi;
        multi = num1 * num2;
        System.out.println("La multiplicación es " + multi);
        //DIVISIÓN /
        int divi = 7 / 2;
        System.out.println("La división de 7 / 2 es " + divi);
        double diviDouble = 7 / 2.0;
          System.out.println("La división double de 7 / 2 es " + diviDouble);
          //ACUMULADORES 
          //SUMA +=, RESTA -=, MULTIPLICACIÓN *=, DIVISIÓN /=
          int sumatoria = 0;
          //sumatoria = sumatoria + 90;
          //sumatoria = sumatoria + 80;
          //sumatoria = sumatoria + 80;
         sumatoria += 90;
         sumatoria += 80;
         sumatoria += 80;
          System.out.println("La sumatoria es " + sumatoria);
          sumatoria -= 70;// le resto 70 a sumatoria 
          //sumatoria 
          System.out.println("La sumatoria es " + sumatoria);
          //
          int multiAcum = 1;
          multiAcum *= 100;
          System.out.println("Multiacum = " + multiAcum);
          multiAcum *= 5;
          System.out.println("Multiacum = " + multiAcum);
                  
          
    }
    
}
