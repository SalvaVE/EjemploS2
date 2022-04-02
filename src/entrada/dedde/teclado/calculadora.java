package entrada.dedde.teclado;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class calculadora {
     public static void main(String[] args) {
         double cantidad1=0, cantidad2=0;
         
         BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
         try{
             System.out.println("Ingresar cantidad 1 : ");
             
             cantidad1 = Double.parseDouble(leer.readLine());
             System.out.println("Ingresar cantidad 2 : ");
             cantidad2 = Double.parseDouble(leer.readLine());
             }catch (Exception e) {
                 System.out.println(e.getMessage());
                 
         }
         System.out.println(cantidad1 + " " + cantidad2);
     }
    
    
}
