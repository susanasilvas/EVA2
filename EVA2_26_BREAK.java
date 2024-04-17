/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_26_break;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EVA2_26_BREAK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        // VAMOS A GENERAR UN ACCESO POR USUARIO Y CONTRASEÑA
        String usuario, pwd;
        
        String USUARIO = "Admin";
        String PASSWORD = "Admin";
       
        Scanner captu = new Scanner(System.in);
        
        //Como es un control de accso, debemos preguntar u numero
        //indeterminado de veces, hasta que el usuario y contraseña sea correcto
        while(true){
          System.out.println("Usuario");
          usuario = captu.nextLine();
          System.out.println("Contraseña");
          pwd = captu.nextLine();
          if(usuario.equals(USUARIO)&& pwd.equals(PASSWORD))// Usuario correcto
          break;
        else
              System.out.println("Datos incorrectos");
        }
       System.out.println("Bienvenido al sistema");
        
    
    }
    
    
}
