/*05) Faça um programa que verifique se um número é impar.*/

import java.io.*; 
import java.util.Scanner; 

public class ListaEx5 { 

   public static void main ( String args [] ) { 
   /* cria mecanismo para fazer a leitura dos dados pelo console*/ 
      
      Scanner entrada = new Scanner(System.in);
      /* Declare aqui as variáveis necessárias */
   
      int lado1, lado2, lado3;
      /* Coloque aqui as instruções para leitura dos dados */
   
      try{ 
         System.out.print("Entre com os tres lados de um trialgulo:\n"); 
         
         lado1 = entrada.nextInt(); // entrada.nextFloat() para reais
         lado2 = entrada.nextInt(); // entrada.nextFloat() para reais
         lado3 = entrada.nextInt(); // entrada.nextFloat() para reais

        
         /* Coloque aqui o código para resolver o problema. 
         * Novas variáveis podem ser criadas, se necessário. */ 
         if(lado1 > lado2 + lado3 || lado2 > lado1 + lado3 || lado3 > lado1 + lado2){
            
            System.out.println("Não é um triangulo");
            
         }else if(lado1 == 0 || lado2 == 0 || lado3 == 0) {
         
            System.out.println("Nao é um triangulo ");
         
         }else if(lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
         
            System.out.println("É um triangulo equilátero");
         
         }else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
         
            System.out.println("É um triangulo isósceles");
         
         }else{
         
            System.out.println("É um triangulo escaleno");
         
         }
        
      } catch (Exception e) { 
         
         System.out.println("Ocorreu algum erro!"); 
            
      }
         
   }
       
}