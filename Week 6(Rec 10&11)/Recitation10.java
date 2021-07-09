/*
Recitation 10 - Week 6.1 - 7/6:
This is the code that the students came up with during class
The solutions to these questions are located on the slide deck which is accessible through canvas
*/

/*
PROBLEM 1 - Recursive Factorial
Write a recursive method for finding the factorial of a given number: 
public int factorial(int n)
You may assume you won't be given a negative number, nor a number larger than 13, and that factorial(0) is 1.

What is the base case?
What is the recursive step?
*/


//CODE:



public class factorial { 
    public static int factorial(int n) {
    if (n == 0 || n == 1){
          return 1;
    }
        else {
            return n * factorial(n-1);
           }
    }
        
      
  /*
  PROBLEM 2 - Recursive Fibonacci
  Fibonacci's sequence is a sequence in which the current term is obtained by adding the previous two terms. The first two terms of the sequence are 1. Here are the first 10:
  
  Write a recursive method, fib, which takes an integer, n, as a parameter, and computes the nth term of the sequence.
  */
  
  //CODE:
  
      public class fibonacci {
        
        public static void main(String[] args){
            //take in n
          System.out.println("Enter nth number: ");
          int n = StdIn.readInt();
                  
          //print computed nth term
          System.out.println("nth term: " + fibonacci(n));		
        }
         
        public static int fibonacci(int n) {
            if(n<=2)
          { 
            return 1; 
          }
              
          else return fibonacci(n-1) + fibonacci(n-2);
        
          }
      
      }
  
      public class tribonacci {
        
        public static void main(String[] args){
                fibonacci(n);		
        }
         
        public static int tribonacci(int n) {
            if(n<=3)
          { 
            return 1; 
          }
              
          else arr[n] = tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);
        
          }
      
      }
    
    
        public class fill { 
            public static void fill(int[] arr, int index) { 
          
              if (index<=1) {
              arr[index] = 0; 
              
            }
              else if (index == 2 || index ==3) {
              
              arr[index] = 1; 
            } 
           else arr[index] = fill(index-1) + fill(index-2) + fill(index-3);
        
          }
   
        } 
      }
  
  /*
  PROBLEM 3 - Tribonacci xt
  Write the method fill that fills up its parameter integer array with tribonacci using recursion. The method header is given below:
  public static void fill( int[] arr, int index){}
  
  *Tribonacci is Fibonacci but adding previous 3 nums rather than 2;
      Ex: [ 0, 1, 1, 2, 4, 7, 13, 24, 44, 81]
  */
  
  //CODE:
        public class fill{
        
          public static void fill(int[],arr,int index){
            
            static int tribo(int n);
            
        if (n==0||n==1||n==2) {
          return 0;
        }
          if (n==3) {
            return 1;
          }
            
                   
            
          if (n<=2){
            return 1
            return 0
            return 0    
          }
            
          else {
            return tribo((n-1))+tribo((n-2))+tribo((n-3));
          }
          }
          
          
          
        }
  
  
  /*
  PROBLEM 4 - Recursive Triangle
  Write two recursive methods that take one integer as a parameter, and print triangles of the given height.
  */
  
  //CODE:
                public class Triangle{
            public static void main (String [] args {
              int n = Integer.parseInt(args[0]);
                  
              public static void triangle(int n){
                if (n < 1) return;
              triangle (n-1);
                for (int i = 0; i < n; i++) {
                  System.out.print("*");
                }
                System.out.println();
                
              }
            }
                                     
  public class Triangle{
      public static void main(String [] args){
          int n = Integer.parseInt(args[0]);
          trianglePrint(n);
  
      }
  
      public static void trianglePrint(int n){ 
          if (n <= 0) {
              return;
          }
          else{
  
              System.out.println("*");
              for(int i = n; i > 0; i--){
                  System.out.print("*");
                  n--;
                  trianglePrint(n);
              }
                 
          }
      }
  }                
