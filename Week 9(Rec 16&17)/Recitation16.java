/*
Recitation 15 - Week 8.2 - 7/22:
This is the code that the students came up with during class
The solutions to these questions are located on the slide deck which is accessible through canvas
*/

/*
PROBLEM 1 - Print Strings & Big O
Write a program that, given an array of Strings, does two passes of printing all of the strings 
(IE: if there are six strings, it will print all six strings once, and then print them all again).
Ex: String[ ] arr = {“CS”, “111”, “Recitation”}
You would print this:
CS
111
Recitation
CS
111
Recitation
What is the Big-O running time of your algorithm?
*/

//CODE:


/*
PROBLEM 2 - Nested Loops Big O Examples
What are the Big-O's of the following code snippets? Why?
int[] array = ... // Somehow create an array
for(int i = 0; i < array.length; i ++){
    for(int j = 0; j < array.length; j ++){
        System.out.println(array[i]);
    }
}
int[] array = ... // Create an array
for(int i = 0; i < array.length; i ++){
    for(int j = 0; j < 10; j ++){
        System.out.println(array[i]);
    }
}
*/

//ANSWER:
// O(n^2)
// O(n)


/*
PROBLEM 3 - Sequential Search
Complete the following method which would return the index of x in a given array using sequential search; if number is not found, return -1:
public static int sequentialSearch(int[] arr, int x)
Trace the method above for finding the number 1 in [15, 2, 8, 1, 17, 5]
How many total comparisons were made?
What is the best case, worst case, and big O?
*/

//CODE:
public static int sequentialSearch(int[] arr, int x){

    for(i = 0; i < arr.length; i++){
        if (arr[i] == x){
            return i;
        }
        
    return -1;
}
  
  /* 13 comparisons in the case described (1 for initialization, +9 for three uses of for loop (comparison, comparison, and addition), +2 for final for and if comparisons, +1 for return)

/*
PROBLEM 4 - Iterative Binary Search
What is the algorithm for binary search?
Trace the method above for finding the number 2 in [1, 2, 5, 8, 15, 17].
What is the best case, worst case, and big O?
*/

//ANSWER:

// 1. O(log(n))

// 2. STEPS TO FIND 2 FROM ARRAY:
	 // FIRST: find mp → 0+6/2 = 3 SO … in position 3 we have 8
   // SECOND: 8>2, SO … we ignore everything after 8 including 8 itself as well (which is 8,15,17)
   // THIRD: find mp again → 0+2/2 = 1 SO… in position 1 we have 2
   // FOURTH: 2=2 SO … 2 found, return 2

// 3. worst case: even-element array, best case: odd-element array, big O: key located in 3 operations --> O(log(8)) = O(3)


