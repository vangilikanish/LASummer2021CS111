/*
Recitation 7 - Week 4.2 - 6/24:
This is the code that the students came up with during class
The solutions to these questions are located on the slide deck which is accessible through canvas
*/

/*
PROBLEM 1 - Difference in Array
Write a program that reads n values from the command line and stores those values in an array, then returns the difference between the largest and smallest values in the array. 
Assume n > 0. The largest and smallest values may be the same.
Example:
$ javac ArrayDiff.java
$ java ArrayDiff 1 2 3 88 87
*/

//CODE:

public class ArrayDiff{
    static public void main(String[] args){
        int[] a = new int[args.length];
        int diff = 0;
        for(int i = 0; i <= args.length - 1; i++){
            a[i] = Integer.parseInt(args[i]);
            for(int j = 0; j <= i; j++){
                if (a[i] - a[j] > diff || a[j] - a[i] > diff){
                    diff = a[i] - a[j];
                    if (a[i] - a[j] < 0){
                        diff = -diff;
                    }
                }
            }
        }
        System.out.println("The maximum difference is " + diff); 
    }
}


/*
PROBLEM 2 - Inplace Reverse
Write a program that reads n values from the command line and stores those values in an array, and then reverses the array in place. 
You cannot use extra storage (another array, etc). 
Example:
$ javac InplaceReverse.java
$ java InplaceReverse 1 2 3 4 5
5, 4, 3, 2, 1,
*/

//CODE:
import java.util.*;

public class recitation2 {
    public static void main(String[]args){

        int f = args.length; /// number of inputs  

        int g[] = new int[f]; /// creating an integer array set with indexes equal to the number of inputs 

        for(int i = 0; i < f; i++){
            g[i] = Integer.parseInt(args[i]);
            
        }
        for (int i = 0; i < f/2; i++){
            int temp = g[i];
            g[i] = g[args.length - i - 1];
            g[f - i - 1] = temp;

        }

        System.out.println(Arrays.toString(g));

    }
}


/*
PROBLEM 3 - Birthday
Description: How many people do you need to ask until you find two with the same birthday? Let's simulate!
 Note: In this program, birthdays are represented as integers 0-364,
 where 0 = Jan 1.
 Examples:
 > java Birthday
 22
 > java Birthday
 29
 > java Birthday
 28
*/

//CODE:


/*
PROBLEM 4 - Commonest
Description: Write a program Commonest that takes any number of command-line arguments, which will be positive integers, and prints the one that occurs most often.
For example
> java Commonest  1 4 5 7  1  7 9 4 4 4 5 1
4
If more than one integer is the commonest, print the first 
one that occurs.
*/

//CODE:
public class Commonest {
  public static void main(String[] args) {
    int[] ints = new int[args.length];
    for (int i = 0; i < args.length; i++) {
      ints[i] = Integer.parseInt(args[i]);
    }

    int[] tallies = new int[ints.length];
    for (int i = 0; i < ints.length; i++) {
      for (int j = 0; j < ints.length; j++) {
        if (ints[i] == ints[j]) {
          tallies[i]++;
        }
      }
    }

    int maxTallyIndex = 0;
    for (int i = 0; i < tallies.length; i++) {
      if (tallies[i] > tallies[maxTallyIndex]) {
        maxTallyIndex = i;
      }
    }
    System.out.println(ints[maxTallyIndex]);
  }
}

