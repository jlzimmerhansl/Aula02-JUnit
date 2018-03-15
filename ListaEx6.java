/*07) Utilize a estrutura if para fazer um programa que retorne o nome de um produto a partir do código do mesmo. 

Considere os seguintes códigos:
1 Parafuso;
2 Porca;
3 Prego;*/

import java.io.*; 
import java.util.Scanner; 

public class ListaEx6 { 

   public static void main ( String args [] ) { 
   /* cria mecanismo para fazer a leitura dos dados pelo console*/ 
      
      Scanner entrada = new Scanner(System.in);
      /* Declare aqui as variáveis necessárias */
   
      int codigo;
      /* Coloque aqui as instruções para leitura dos dados */
   
      try{ 
      
         do{
         
            System.out.print("Digite um código:\n"); 
         
            codigo = entrada.nextInt(); // entrada.nextFloat() para reais

        
                /* Coloque aqui o código para resolver o problema. 
                * Novas variáveis podem ser criadas, se necessário. */ 
                if(codigo == 1){
            
                   System.out.println("1 Parafuso");
            
                }else if(codigo == 2) {
         
                    System.out.println("2 Porca ");
         
                }else if(codigo == 3){
               
                   System.out.println("Prego");
         
                  }else{
         
                    System.out.println("Diversos");
         
               }
        
        }while(codigo == 0);
        
      } catch (Exception e) { 
         
         System.out.println("Ocorreu algum erro!"); 
            
      }
         
   }
       
}