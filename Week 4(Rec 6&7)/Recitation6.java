/*
Recitation 6 - Week 4.1 - 6/22:
This is the code that the students came up with during class
The solutions to these questions are located on the slide deck which is accessible through canvas
*/

/*
PROBLEM 1 - Array Average
Write a program which computes the average of an array of integers.
public static void main(String[] args){
	int[] arr = {1,7,3,6,3,2};
	double sum = 0;
	// write your code here
	System.out.println(sum/arr.length);
}
Example:
$ javac ArrayAverage.java
$ java ArrayAverage
3.667
//or sth similar
*/

//CODE:
public static void main(String[] args) {
	int[] arr = {1,7,3,6,3,2};
	double sum = 0;
  for(int i = 0; i < arr.length; i++) {
  	sum += arr[i];
  }
  System.out.println(sum / arr.length);
}


/*
PROBLEM 2 - Matrix 1's and 0's
Write a program which takes a 2D array(this 2D array should be randomly filled with 1s and 0s), and prints:
How many 1's are in the 2D 
array.
How many 0's are in the 2D
array.
Sample 2D array:
{1,0,1,0},
{1,1,0,1},
{1,0,0,1},
{0,0,1,0}
Example:
$ javac OneZeroArray.java
$ java OneZeroArray
There were 8 ones and 8 zeroes.
*/

//CODE:
import java.util.Random;

public class Randomfilled {

    public static void main(String[] args) {
        int[][] arry = new int[3][4];
        arrays(arry);
    }
  
    public static void arrays(int[][] arry) {

        Random n = new Random();
        int z = 0;
        int x = 0;
        for (int i = 0; i < arry.length; i++) {
            for (int j = 0; j < arry[0].length; j++) {
                arry[i][j] = Math.abs(n % 2);

                if (arry[i][j] == 0) {
                    z++;
                }
                if (arry[i][j] == 1) {
                    x++;
                }
            }

        }
    }
}
  

/*
PROBLEM 3 - Nth Column of Matrix
Write a program which takes a 2D integer array, arr, and an integer, n, and creates an array containing the nth column of arr.
You may assume that the matrix has the same number of rows in each column, and that n is a valid column index.
Sample 2D array:
{1,0,1,0},
{1,1,0,1},
{1,0,0,1}
Example:
$ javac NthColumn.java
$ java NthColumn 0
1
1
1
$ java NthColumn 1
0
1
0
*/

//CODE:
public static void main(String[] args){
        int[] a = {1, 0, 1, 0};
        int[] b = {1, 1, 0, 1};
        int[] c = {1, 0, 0, 1};
        int n = Integer.parseInt(args[0]);

        System.out.println(a[n]);
        System.out.println(b[n]);
        System.out.println(c[n]);
    }


/*
PROBLEM 4 - Array Concatenation
Write a program which takes two integer arrays, a and b, and creates an array which is a concatenated with b.
Sample arrays:
a = {1, 2, 3}
b = {4, 5, 6}
Example:
$ javac ArrayConcatenation.java
$ java ArrayConcatenation
1, 2, 3, 4, 5, 6,
*/

//CODE:

public class ArrayConcatenation {
  
  public static void main(String[] args) {
    int[] array1 = {3};
    int[] array2 = {3};
    
    int array1len = array1.length();
    int array2len = array2.length();
    
    int[] concatenate = new int[array1len + array2len];

    
    
  public static void main(String[] args)
{
    int[] a = {1 , 2, 3};
    int[] b = {4 , 5, 6};

    int aLen = array1.length();
    int bLen = array2.length();
    int[] result =  new int[aLen + bLen];

    int[] b = new double[N];
    for (int i = 0; i < N; i++)
        b[i] = a[i];


}
}

