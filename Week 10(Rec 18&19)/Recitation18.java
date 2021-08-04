/*
Recitation 18 - Week 10.1 - 8/3:
This is the code that the students came up with during class
The solutions to these questions are located on the slide deck which is accessible through canvas
*/

/*
PROBLEM 1 - Sequential Search
Complete the following method which would return the index of x in a given array using sequential search; if number is not found, return -1:
public int sequentialSearch(int[] arr, int x)
Trace the method above for finding the number 1 in [15, 2, 8, 1, 17, 5]
What is the best case, worst case, and big O?
*/

//ANSWER:
public static int sequentialSearch(int[] arr, int x) {
  for (int i = 0; i < arr.length; i++) {
    if (arr[i] == x) {
      return i;
    }
  }
  return -1;
}



public class SequentialSearchCode {
    public static void main (String[] agrs){
        int[] arr = {15, 2, 8, 1, 17, 5};
        int key = 1;

        int index = sequentialSearch(arr, key);
        if (index != -1){
            System.out.println("The first occurence of element " + key + " is located at index " + index);
        }
        else{
            System.out.println("Element is not in the array");
        }
    }
    public static int sequentialSearch(int[] arr, int x){
        // int left = 0;
        // int right = arr.length - 1;

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == x)
                return index;
        }
        return -1;
    }
}

// Best case: O(1)
// Worst case: O(n)
// Typical: O(n)

/*
PROBLEM 2 - Binary Search Tree
Trace a Binary Search of the following dataset, where we are attempting to find the number 8.
{1,3,5,6,12,19,20,25,28,33}
*/
//ANSWER:
Low: 0 High: 9 Middle: 4; 8<12
Low: 0 High: 4 Middle: 2; 8>5
Low: 2 High: 4 Middle: 3; 8>6
Low: 3 High: 4 Middle: 3; Middle == Low, not found





Low = (index = 0), (num = 1)
Mid = (index = 4), (num = 12)
High = (index = 9), (num = 33)

Is mid < OR > OR = target (8 < 12) → soo…

New low, mid, high are:
Low = (index = 0), (num = 1)
Mid = (index = 2), (num = 5)
High = (index = 4), (num = 12)

Is mid < OR > OR = target (8 > 5) → so…

New low, mid, high are:
Low = (index = 3), (num = 6)
Mid = (index = 3), (num = 6)
High = (index = 4), (num = 12)

Is mid < OR > OR = target (8 > 6) → soo…

Final answer = 8 does not exist in the array



/*
PROBLEM 3 - Advanced Binary Search
As a good computer science student, made 9999999 sorted arrays for fun; And someone pranked you by cutting each array into two parts and flip the order of the two parts.
Example: [1 2 3 4 5 6] -> [5 6 1 2 3 4] (where the cut happened is random)
Your task is to make a method that return the index of where this cut happened in O(log2n) time, where  n is the array length; 
*/

//ANSWER:


public static int cutIndex(int[] a) {  
  int lowerBound = 0;
  int upperBound = a.length;
  while (lowerBound < upperBound) {
    int midIndex = lowerBound + (upperBound - lowerBound) / 2;
    if (midIndex <= 0) {
      break;
    }
    if (a[midIndex] < a[midIndex - 1]) {
      return midIndex;
    } else if (a[midIndex] > a[a.length - 1]) {
      lowerBound = midIndex + 1;
    } else {
      upperBound = midIndex;
    }
  }
  return -1;
}

   public static int advBinary(int[] arr){
        int n = arr.length;
        if (n == 1) return 0;
        int[] div1 = new int[n - (n/2)];
        int[] div2 = new int[n - (n/2)];
        System.arraycopy(arr,0,div1,0,n-(n/2));
        System.arraycopy(arr,n/2,div2,0,n-(n/2));
        if(n == 2){
            if(arr[0] >= arr[1])return 0;
            if(arr[0] < arr[1])return 1;
        }
        if(arr[n/2] < arr[n-1])return advBinary(div2);
        if(arr[n/2] >= arr[n-1])return (n/2) + advBinary(div1);
        return 0;
    }

