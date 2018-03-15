/*13) Faça um programa que utilize uma estrutura de repetição para ler 50 
números armazenando-os em um vetor e calcule e exiba a média aritmética deles. 
Em seguida o programa deve apresentar todos os valores armazenados no vetor que sejam menores que a média.*/

import javax.swing.*;

import java.io.*; 

import java.util.Scanner; 

public class ListaEx13 { 

   public static void main ( String args [] ) { 
   
   /* cria mecanismo para fazer a leitura dos dados pelo console*/ 
   
      Scanner entrada = new Scanner(System.in);
   
      /* Declare aqui as variáveis necessárias */
      
      int vetor[] = new int [51];
      int media = 1;
      int valores;
      
   
      /* Coloque aqui as instruções para leitura dos dados */
      try{ 
         
         /*preencher valores*/
         for(int i = 1; i < vetor.length; i++){
         
            vetor[i] = i; 
            
            media = vetor[i] / 2;
            
         
         }
         
         //media
         
          
         
         //exibir valores
         
         for(int i = 1; i < vetor.length; i++){
         
         
            System.out.println(vetor[i]);
         
            
         }
         
         //media
         
         
             System.out.println("\n A media aritmetica do vetor é: " + media);
         
         /*Em seguida o programa deve apresentar todos os valores armazenados no vetor que sejam menores que a média.*/
         
          for(int i = 1; i < vetor.length; i++){
         
            
            if(vetor[i] < media){
               
               System.out.println("\n Os valores menores que a média é: " + vetor[i]);
               
            }   
         
            
         }
         
      }
      catch (Exception e) { 
         
         System.out.println("Ocorreu algum erro!"); 
            
      } 
           
   } 
       
}