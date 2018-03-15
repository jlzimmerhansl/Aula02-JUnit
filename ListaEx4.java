/*04) Faça um programa que receba 4 valores e retorne o menor entre eles.*/

import java.io.*; 
import java.util.Scanner; 

public class ListaEx4 { 

   public static void main ( String args [] ) { 
   /* cria mecanismo para fazer a leitura dos dados pelo console*/ 
      
      Scanner entrada = new Scanner(System.in);
      /* Declare aqui as variáveis necessárias */
   
      int nro1,nro2,nro3, nro4;
      /* Coloque aqui as instruções para leitura dos dados */
   
      try{ 
         System.out.print("Entre com quatro valores inteiros:\n"); 
         
         nro1 = entrada.nextInt(); // entrada.nextFloat() para reais
         nro2 = entrada.nextInt(); // entrada.nextLine() para strings
         nro3 = entrada.nextInt(); // entrada.nextLine() para strings
         nro4 = entrada.nextInt(); // entrada.nextLine() para strings
      
        
         /* Coloque aqui o código para resolver o problema. 
         * Novas variáveis podem ser criadas, se necessário. */ 
         if(nro1 < nro2 && nro1 < nro3 && nro1 < nro4){
            
            System.out.println("O numero " + nro1 + " é menor");
            
         }else if(nro2 < nro1 && nro2 < nro3 && nro2 < nro4){
            
            System.out.println("O numero " + nro2 + " é menor");
            
         }else if(nro3 < nro1 && nro3 < nro2 && nro3 < nro4){
         
            System.out.println("O numero " + nro3 + " é menor");
         
         
         }else{
         
            System.out.println("O numero " + nro4 + " é menor");
         
         
         }
        
      } catch (Exception e) { 
         
         System.out.println("Ocorreu algum erro!"); 
            
      }
         
   }
       
}