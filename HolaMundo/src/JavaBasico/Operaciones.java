/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBasico;


//importar una clase pára leer el teclado** despues del paquete y antes de la clase

import java.util.Scanner;
/**
 *
 * @author ESTUDIANTE
 */
public class Operaciones {
   
    
    
    
    
    public static void main(String[] args) {
        
        Scanner genial= new Scanner(System.in);
        
    int vInt;
    float vFloat;
    String vStr;
    boolean b1, b2;
        
        vInt=10+5;
        System.out.println("vInt = 10 + 5: " + vInt);
        
        vInt=10-5;
        System.out.println("vInt = 10 - 5: " + vInt);
        
        vInt=10*5;
        System.out.println("vInt = 10 * 5: " + vInt);
        
        vInt=10/5;
        System.out.println("vInt = 10 / 5: " + vInt);
        
        vStr="Dianita ";
        vStr=vStr + "CCB";
        System.out.println("Felicidad " + vStr);
        
        b1=true;
        b2=false;
        System.out.println("b1 and b2: " + (b1 && b2));
        System.out.println("b1 or b2: " + (b1 || b2));
        System.out.println("not b1: " + (!b1));
        System.out.println("not b2: " + (!b2));
        
        //leer texto
        //System.out.println("Introduzca texto: ");
        //System.out.println(genial.nextLine());
        
        
        // CICLOS
        
        // la variable declarada dentro del for solo sirve dentro de ese bloque
        
        int i;
        for(i=0; i<5; i++){
       
            //System.out.println(i);
        
        }
        
        //incrementa la variable y luego suma
        i=5;
        i= ++i +2;
        System.out.println(i);
        
        
        // suma y luego incrementa la variable
        i=5;
        i= i++ +2;
        System.out.println(i);
       

}
    
}


