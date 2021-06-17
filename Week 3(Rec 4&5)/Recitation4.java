/*
Recitation 4 - Week 3.1 - 6/15:
This is the code that the students came up with during class
The solutions to these questions are located on the slide deck which is accessible through canvas
*/

/*
PROBLEM 1 - Can You Vote?
Write a program that reads in an age via an argument from the command line, and outputs whether or not you are allowed to vote at that age.
When are you allowed to vote?
What data type is an age when it comes to voting? Is there a difference between 17.9 years old, 17 years old, and 18 years old?
*/

//CODE:


/*
PROBLEM 2 - Speeding Tickets
Assume you are about to give a ticket to a person that you caught speeding. Get the speed as the input to your program via an argument from the command line, and output the correct fine:
Speed is less than or equal to 60mph: $0 fine
Speed is above 60 and less than or equal to 75: $100 fine
Speed is above 75 and less than or equal to 90: $200 fine
Speed is above 90: $500 fine
*/

//CODE:
public class SpeedingTicket {
    public static void main(String[] args) {
        int speed = Integer.parseInt(args[0]);
        System.out.println(speed);
        if (speed < 0) {
            System.out.println("error");
        } else if (speed <= 60) {
            System.out.println("$0 fine");
        } else if (speed > 60 && speed <= 75) {
            System.out.println("$100 fine");
        } else if (speed > 75 && speed <= 90) {
            System.out.println("$200 fine");
        } else if (speed > 90) {
            System.out.println("$500 fine");
        } else {
            System.out.println("error");
        }
    }
}

/*
PROBLEM 3 - Loop Print
Print out all numbers from 1 to n in one line with commas separating them
Example:
$ javac LoopPrint.java
$ java LoopPrint 4
1,2,3,4,
*/

//CODE:
	


/*
PROBLEM 4 - Summation of First x Numbers (CALL ME INTO THE BREAKOUT ROOM THERE IS DIAGRAM THAT I CAN SHOW)
A summation, denoted above, is the addition of all of the numbers between i and x. Write three programs which, after reading in a
number,x, via an argument from the command line, computes the summation of the first x numbers with the following techniques:
Using a for-loop.
Using a while-loop.
Using a do...while-loop.
*/

//CODE:
  public static void main(String[] args){
        int x = Integer.parseInt(args[0]);
        int i = 0;
        int sum = 0;
        while(i<x){
            i = i + 1;
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
public static void main(String[] args){
        int x = Integer.parseInt(args[0]);
        int i = 0;
        for(i=0; i<=x; i++){
            sum = i + x;
            System.out.println(sum);
        }
    }
}

/*
PROBLEM 5 - Horizontal Pyramid
Write a program that reads in a number, n, via an argument from the command line, and then creates a horizontal pyramid of height n:
Ex: height = 5:
*
**
***
****
*****
****
***
**
*
*/

//CODE:
public class Main {
    public static void main(String[] args) {
     int rows = n;
      
     for (int n = 1; n <= rows; ++n) {
        for (int j = 1; j <= n; ++j) {
          System.out.print("* ");
         }
         System.out.println();
        }
    }   
}
