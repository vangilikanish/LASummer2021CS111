/*
Recitation 5 - Week 3.2 - 6/17:
This is the code that the students came up with during class
The solutions to these questions are located on the slide deck which is accessible through canvas
*/

/*
PROBLEM 1 - Prime?
Write a program that will determine if a number is prime or not. 
If the number is prime, it will return true. 
If not, it will return false.
From the all knowing WIKIPEDIA:
A prime number is a natural number greater than 1 that is not a product of two smaller natural numbers. 
*/

//CODE:
public class Prime{
    public static void main(String[] args){
      int n = Integer.parseInt(args[0]);
      int divisor = 2;
      boolean prime = true;
      while(divisor < n) {
          if(n % divisor == 0) {
              prime = false; 
          } 
          divisor++;
      }
      if(prime == true) System.out.println(n + " is prime!");
      if(prime == false) System.out.println(n + " is not prime...");
    }
  
  }
  
public class prime {
    public static void main(String[] args){
        int x = Integer.parseInt(args[0]);
        int m = x/2;
        int flag = 0;
        if(x ==0 || x==1){
        flag = 1;
            System.out.println(x+" is not a prime number");
        }else {
            for(int i=2; i<=m; i++){
                System.out.println(x + " is not a prime number");
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            System.out.println(x + " is prime number");
        }
    }
}
  
/*
PROBLEM 2 - Powers of Two
This program takes a command-line argument n and prints a table of the powers of 2 that are less than or equal to 2^n. Remarks: Works only if 0 <= n < 31, because 2^31 overflows an int.
Examples:
> java PowersOfTwo 5
0 1
1 2
2 4
3 8
4 16
5 32
*/

//CODE:

public class PowersofTwoProblem 
{
    public static void main(String[] args) {
        // reads the command-line argument
        int user_input = Integer.parseInt(args[0]);
        int powerOfTwo = 1;      
        for (int i=0 ; i <= user_input ; i++) 
        {
            System.out.println(i + " " + powerOfTwo);   
            powerOfTwo *= 2;              
        }
    }
}

/*
PROBLEM 3 - Roll Loaded Dies
Description: 
Simulate the roll of a loaded six-sided die, where the values 1, 2, 3, 4, and 5 appear with probability 1/8 and the value 6 appears with probability 3/8.
Print the resulting number.
Hint: Use Math.random() to generate a random pobability.
*/

//CODE:
public class Dice {
    public static void main(String[] args) {
        double r = Math.random();
        int die;
        if (r < 1.0 / 8.0)
            die = 1;
        else if (r < 2.0 / 8.0)
            die = 2;
        else if (r < 3.0 / 8.0)
            die = 3;
        else if (r < 4.0 / 8.0)
            die = 4;
        else if (r < 5.0 / 8.0)
            die = 5;
        else
            die = 6;
        System.out.println(die); 
    }
}

/*
PROBLEM 4 - Square Census
Description: Write a program SquareCensus that takes a single command-line argument n, which is an integer. 
First, print out all of the positive square numbers less than or equal to n (in increasing order). 
Then, print their sum. Use the format shown in this 
example: 
*       > java SquareCensus 11 
*       1
*       4
*       9
*       The sum is 14
*/

//CODE:
public class SquareCensus {
    public static void main(String[] args) {
        
        int n = Integer.parseInt(args[0]);
        int sum = 0;
    
        for (int i = 0; i <= n; i++){
            if (Math.sqrt(i)%1 == 0) {
                i += sum; 
            }
    
        }
        System.out.println(sum);
    
    }
}

public class squarecensus {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int sum = 0;
        for (int i = 1; i*i <= n; i++) {
            System.out.println(i*i);
            sum = sum + i*i;
        }
        System.out.println(sum);
    }
}
