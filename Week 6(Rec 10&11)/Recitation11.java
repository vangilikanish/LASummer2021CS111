/*
Recitation 11 - Week 6.2 - 7/8:
This is the code that the students came up with during class
The solutions to these questions are located on the slide deck which is accessible through canvas
*/

Problem 1 - IntegerSum

When we first learned addition, we used to add two numbers digit by digit, and we can implement this summation algorithm using recursion in Java
3
Write the recursive method sum that computes the sum of its two integer parameters adding one digit at a time. 
Assume the integer parameters have the same number of digits. 
You are not allowed to use “+” or “-” operators on any number greater than 10.
You may NOT use loops.

Group 1 Solution:

Group 2 Solution:

Group 3 Solution:
public class IntegerSum {
 
    public static int Summation(int[] arr)
    {
        int k;
        if (arr[0] == 0 && arr[1] == 0) return 0;
 
        k = (arr[0]%10) + (arr[1]%10);
        arr[0] = arr[0] / 10;
        arr[1] = arr[1] / 10;
        return 10*Summation(arr) + k;
    }
 
    public static void main(String[] args)
    {
        int arr[];
        arr = new int[2];
        
        arr[0] = Integer.parseInt(args[0]);
        arr[1] = Integer.parseInt(args[1]);
        
        StdOut.println(Summation(arr));
 
    }
}


Group 4 Solution:

Problem 2 - xth Harmonic Number

The xth harmonic number is defined as the series:


That is, the first harmonic number (x = 1) is 1. The second (x = 2) is 1 + 0.5 = 1.5.


Write a recursive function, harmonic, which takes an integer as a parameter, and returns the xth harmonic number.


Group 1 Solution:

Group 2 Solution:

Group 3 Solution:

public class HarmonicNum {
 
    public static double Harmonic(int N)
    {
        if (N == 1) return 1.0;
 
        return Harmonic(N-1) + (1.0/N);
    }
 
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        StdOut.println((Harmonic(N)));
 
    }
}

Group 4 Solution:


