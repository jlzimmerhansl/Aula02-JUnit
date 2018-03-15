public class Ex01{

   public static int fat(int n){
   
      if(n == 0)
         return 1;
      
      else
         return n*fat(n-1);
         
   }
   
   public static int fib(int n){
   
      if(n < 3)
         return 1;
      
      else
         return fib(n-1) + fib(n-2);   
   
   }
   
   public static void hanoi(int n, char a, char b, char c){
      
      if(n > 0){
      
         hanoi(n-1, a, c, b);
            
         System.out.println("passar o disco " + n + " da haste " + a + " para a haste " + c);
            
         hanoi(n-1, b, a, c);   
      
      }
   }
  
   public static int potRec(int m, int n){
   
      if(n == 0)
         return 1;
      
      else
         return m*((int)Math.pow(m, n-1));
         
   }
   
   public static int PotInt(int m, int n){
   
      for(i = 0; i = 
   }

   public static void main(String args[]){
      
      System.out.println("Fatorial: " + fat(3));
      
      System.out.println("Fibonacci: " + fib(7));
      
      hanoi(3, 'a' , 'b' , 'c');
      
      System.out.println("Potencia: " + potRec(2,2));
   
   }

}