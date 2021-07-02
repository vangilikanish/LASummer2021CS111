/*
Recitation 9 - Week 5.2 - 7/1:
This is the code that the students came up with during class
The solutions to these questions are located on the slide deck which is accessible through canvas
*/

/*
EVERYONE - 1D Array
Consider the following three java functions: CALL ME INTO ROOM SO I CAN SHOW THE EXAMPLE THAT IS BEING REFERENCED!
What’s the content of a[]?
int[] a = {12, 32, 60, 100}
halve2(a);
halve2(a)

What’s the content of a[]?
int[] a = {10, 20, 30, 40}
halve3(a);
halve3(a);
*/

//ANSWER:


/*
PROBLEM 1 - Greatest Common Factor
CALL ME INTO ROOM SO I CAN SHOW THE EXAMPLE THAT IS BEING REFERENCED!
The Greatest Common Factor of two numbers is the largest factor that both numbers share. A number's factors are all of the numbers that it is evenly divisible by.
In the above example, 24 and 18 are both divisible by 1, 2, 3, and 6. Since 6 is the largest, it is the GCF.
Write a method called gcf in Methods.java which takes in 2 integers as parameters and returns their Greatest Common Factor.
Now in a separate program called SimplifyFraction.java, take 2 numbers as input from the user (numerator and denominator) via the StdIn, and use the method you just wrote to simply the fraction and output it.
Ex: numerator = 9, denominator = 12; output: “3/4”
*/

//CODE:


/*
PROBLEM 2 - Prime
A number is considered prime if the only numbers it is divisible by are 1 and itself. 
Write a method, isPrime, which takes an integer as a parameter, which will return true if the given number is prime.
*/

public static boolean isPrime(int n) {
    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
  
  public static boolean main(String[] args){
        int n = Integer.parseInt(args[0]);
        int divisor = 2;
        while(divisor*divisor <= n) {
            if(n % divisor == 0) {
                return false;
            } 
            divisor++;
        }
       return true;
      }
  /*
  PROBLEM 3 - ArrayCompares
  CALL ME INTO ROOM SO I CAN SHOW THE EXAMPLE THAT IS BEING REFERENCED!
  Description:  The function eq() takes two integer array arguments and returns true if they have the same length and all corresponding pairs of integers are equal.
  The function id() takes two integer array arguments and returns true if they are identical, i.e., the same array reference, false otherwise.
  */
  
  //CODE:

  
  /*
  PROBLEM 4 - Atoi
  Write the method convert that converts its String parameter into an integer without parsing or atoi with any base.
  You may use the fact that a given integer can be retrieved using ascii values by subtracting the character by 0.
  */
  
  //CODE:
  
  
