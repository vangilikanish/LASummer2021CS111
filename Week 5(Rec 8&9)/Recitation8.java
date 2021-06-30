 /*
Recitation 8 - Week 5.1 - 6/29:
This is the code that the students came up with during class
The solutions to these questions are located on the slide deck which is accessible through canvas
*/

/*
EVERYONE - Method Signature Practice
What is a method signature? What are its elements?
	
Write the method signature for a method which takes in 2 doubles and returns their average.
	
Write the method signature for a method which takes in the user's name and age and returns true if they are an adult.

Write the method signature for a method which takes in the user's first name and last name and returns their name as "last, first".
*/

//ANSWER:


/*
PROBLEM 1 - Guessing Game
You are to write a program which implements a Guessing Game. 
Generate a random int between 1 to 1,000, and prompt the user to try to guess what the number is. 
As the user enters numbers, the program should tell whether the guess is too high or too low. 
Once the user guesses correctly, have the program output "You win!"
All input and output must be done using StdIn and StdOut libraries.
*/

//CODE: 

public class GuessingGame {
    public static void main(String[] args) {
      int randomInt = (int) (Math.random() * 1000 + 1);
      int guess = 0;
  
      do {
        StdOut.println("Guess an integer between 1 and 1,000:");
        guess = StdIn.readInt();
        if (guess > randomInt) {
          StdOut.println("Too high");
        }
        if (guess < randomInt) {
          StdOut.println("Too low");
        }
      } while (guess != randomInt);
  
      StdOut.println("You win!");
    }
  }
  
  public class GuessingGame 
  {
      public static void main(String[] args)
      {
          int secretNumber;
          int guess;
          secretNumber = (int)(Math.random() * 999 + 1);  
          do 
          {
              StdOut.println("guess a number from 1-1000: ");
              guess = StdIn.readInt();
              if (guess==secretNumber)
                  StdOut.println("Your guess is correct. You win!");
              else 
                  if (guess < secretNumber)
                      StdOut.println("your guess is lower than the secret number");
                  else 
                      if (guess>secretNumber)
                          StdOut.println("your guess is greater than the secret number");
          } while (guess!=secretNumber);
      }         
  }
  
  public class GuessingGame {
      public static void main(String[] args) {
          int randomInt = (int) (Math.random()*1000 + 1);
          int guess = 0;
          while(guess != randomInt){
          StdOut.println("Guess an Integer between 1 and 1000");
          guess = StdIn.readInt();
              if (guess > randomInt){
                  StdOut.println("Too High!");
              }
              if (guess < randomInt){
                  StdOut.println("Too Low!");
              }
              if (guess == randomInt){
                  StdOut.println("CORRECT!");
              }
          }
      }
  }
  
  
  /*
  PROBLEM 2 - MaxMin
  Description: Reads integers from standard input and prints the maximum and minimum of those values to standard output. Assume there is at least one integer.
    Compilation:  javac-introcs MaxMin.java
    Execution:    java-introcs MaxMin 
      -- input required from standard input
      -- use Ctrl-d (Mac) or Ctrl-z (Windows) for EOF
    % java-introcs MaxMin
     23 45 17 56 32
     89 10 53 32 34
     16
     Ctrl-d / Ctrl-z
     maximum = 89, minimum = 10               
  (This is book exercise 1.5.1.)
  */
  
  //CODE:
  
  
  /*
  PROBLEM 3 - Power of 3
  Write the method isPower3 that determines if its integer parameter is a power of 3.
  */
  
  //CODE:
  
  public class problem3 {
      public static void main(String[] args){
          StdOut.print("Enter Integer: ");
          int x = StdIn.readInt();
          boolean y = isPower3(x, 3);
          if(y == false){
              StdOut.println(x +" is not a power of 3!");
          }else{
              StdOut.println(x + " is a power of 3!");
          }
      }
  
          public static boolean isPower3(int integer, int power){
              if(integer % power == 0){
                  return true;
              }else{
                  return false;
              }
          }
  
  
      
  }
  
  public class PowerOf3 {
  
    public static void main(String[] args) {
      while (true) {
        StdOut.println("Enter an integer:");
        StdOut.println("Is power of 3: " + isPower3(StdIn.readInt()));
      }
    }
  
    private static boolean isPower3(int n) {
      double x = Math.log(n) / Math.log(3);
      return (x == Math.floor(x));
    }
  }
  
  
  /*
  PROBLEM 4 - Multiplication Table
  Write a method, printTable, which takes an integer as an argument, and prints a multiplication table of that size. 
  For example, a multiplication table of size 5 looks like:
  printTable(5); 
  1  2  3  4  5
  2  4  6  8 10
  3  6  9 12 15
  4  8 12 16 20
  5 10 15 20 25
  USE NESTED LOOPS!!!! :)
  */
  
  //CODE:
  
  /*
  public class Test{
  public static void main(String[] args){
  //prompt user for a number
      StdOut.println("Enter a number: ");
  
  //read number from user using StdIn
  int n = StdIn.readInt();
   
  //print the number back to the user
  StdOut.println("you entered: " + n); 
  }
  }
  */  
