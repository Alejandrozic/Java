import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {
        // Run
        int[] arr = {11,9,17,5,12};

        System.out.println(Arrays.toString(bubbleSort(arr)));       // [5, 9, 11, 12, 17]
        System.out.println(Arrays.toString(selectionSort(arr)));    // [5, 9, 11, 12, 17]
        System.out.println(Arrays.toString(insertionSort(arr)));    // [5, 9, 11, 12, 17]

    }

    private static int[] bubbleSort(int[] arr){
        /**
         * Bubble Sort
         *  - start at first element, compare to next, and swap if next element is smaller
         *    do this until the end
         *    then start at first element + length of array, until completed
         *  - O(N*logN) Time Complexity
         * */

        int tmp;

        for ( int i = 0; i < arr.length-1; i ++){
            for ( int j = i+1; j < arr.length; j++){
                if (arr[i] > arr[j]) {
                    tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }

        return arr;
    }

    private static int[] selectionSort(int[] arr){
        /**
         * Selection Sort
         *  - finds smallest and swaps it with the last element
         *  - O(N) Time Complexity
         * */

        int tmp;
        int minIndex;

        for (int i = 0; i < arr.length - 1 ; i++){
            minIndex = i;
            for (int j = i+1; j < arr.length; j++){
                if ( arr[i] > arr[j] ){
                    if ( arr[j] < arr[minIndex] )
                        minIndex = j;
                }
            }
            if (i != minIndex){
                tmp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = tmp;
            }
        }

        return arr;
    }

    private static int[] insertionSort(int[] arr){
        /**
         * Insertion Sort
         *  - divided array to sorted and unsorted,
         *    compare each item from unsorted to sorted array
         *    placing items in order
         *  - O(N^2) Time Complexity
         * */

        int value;
        int index;

        for (int i=1; i < arr.length; i++){
            value = arr[i];
            index = i ;
            while(value < arr[index-1]){
                arr[index] = arr[index -1];
            }
            arr[index] = value;
        }

        return arr;
    }
}
