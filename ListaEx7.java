/*utilize a estrutura while para ler 50 números e calcule e exiba a média aritmética deles.*/

import java.io.*; 
import java.util.Scanner; 

public class ListaEx7 { 

   public static void main ( String args [] ) { 
   /* cria mecanismo para fazer a leitura dos dados pelo console*/ 
      
      Scanner entrada = new Scanner(System.in);
      /* Declare aqui as variáveis necessárias */
   
      int contador = 0;
      /* Coloque aqui as instruções para leitura dos dados */
   
      try{ 
      
         while(contador < 50){
            
            System.out.println("nuemro" + contador);
            contador++;
            
         }
         
         contador / 2;
        
      } catch (Exception e) { 
         
         System.out.println("Ocorreu algum erro!"); 
            
      }
         
   }
       
}