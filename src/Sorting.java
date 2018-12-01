import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {
        selectionSort();
    }

    public static void bubbleSort(){
        /**
         * Bubble Sort
         *  - start at first element, compare to next, and swap if next element is smaller
         *    do this until the end
         *    then start at first element + length of array, until completed
         *  - O(N*logN) Time Complexity
         * */

        int[] arr = {5,32,8,4,65,9,1,3};
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
    }

    public static void selectionSort(){
        /**
         * Selection Sort
         *  - finds smallest and swaps it with the last element
         * */

        int[] arr = {11,9,17,5,12};
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
            if ( i != minIndex ){
                tmp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = tmp;
            }
        }
    }
}
