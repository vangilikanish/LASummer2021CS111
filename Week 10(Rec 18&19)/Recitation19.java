/*
Recitation 19 - Week 10.2 - 8/5:
This is the code that the students came up with during class
The solutions to these questions are located on the slide deck which is accessible through canvas
*/

/*
PROBLEM 1 - Insertion Sort
What is the algorithm for Insertion Sort?
Trace Insertion Sort on the following array:
[15, 2, 8, 1, 17, 5]
What is the best case, worse case, and big O?
*/

//ANSWER:

15, 2, 8, 1, 17, 5
2, 15, 8, 1, 17, 5 - 1 comparison
2, 8, 15, 1, 17, 5 - 1 comparison
1, 2, 8, 15, 17, 5 - 3 comparisons
1, 2, 8, 15, 17, 5 - 1 comparison
1, 2, 5, 8, 15, 17 - 4 comparisons




/*
PROBLEM 2 - Selection Sort
What is the algorithm for selection sort?
Trace selection sort over the following array:
[15, 2, 8, 1, 17, 5]
What is the best case, worst case, and big O?
*/

//ANSWER:

    public static void searchSelection(int[] arr){
        for (int i = 0; i < arr.length; i++){
            int min = i;
            for(int j = i; j < arr.length; j++){
                if (arr[j] < arr[min]) min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    
best case is the same as worst case, and is O(n^2)


/*
PROBLEM 3 - Merge Sort
How does the Merge Sort algorithm work?
Use the code below to trace MergeSort on the following array: [L,D,Z,V,G,O,W,B]
List the resulting array after each iteration of the mergesort algorithm. Indicate the number of character-to-character comparisons made for each call to merge
*/

//ANSWER:


