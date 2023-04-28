/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpudi2;
import java.util.*;
/**
 *
 * @author SUPCOMERCIO
 */
public class TPudi2 {

    /**
     * @param args the command line arguments
     */
    
    public static int triangulo (int n1, int n2){
        int area;
        area = (n1*n2)/2;
        return area;
    }
 
    public static int rectangulo (int n1, int n2){
        int area;
        area = n1 * n2;
        return area;
    }
    
    
     public static void menu(){
         Scanner leer;
         leer = new Scanner(System.in);
         int op, n1, n2;
         int r;
         do{
         System.out.println("ELIJA UNA OPCION");
         System.out.println("1. Area de un trigalgulo");
         System.out.println("2. Area de un rectangulo");
         System.out.println("3. Radio de un circulo");
         System.out.println("4. SALIR");
         op = leer.nextInt();  
         
         switch (op){
             case 1: System.out.println("Ingrese la base del triangulo");
             n1 = leer.nextInt();
             System.out.println("Ingrese la altura del triangulo");
             n2 = leer.nextInt();
             r = TPudi2.triangulo(n1, n2);
             System.out.println("El area del triangulo es: " + r);
             break;
             
             case 2: System.out.println("Ingrese la base del rectangulo");
             n1 = leer.nextInt();
             System.out.println("Ingrese la base del rectangulo");
             n2 = leer.nextInt();
             r = TPudi2.rectangulo(n1, n2);
             System.out.println("El area del rectangulo es: " + r);
             break;
         }
         
     } while (op !=4);
     }
    public static void main(String[] args) {
        // TODO code application logic here
        TPudi2.menu();

    }
    
}
