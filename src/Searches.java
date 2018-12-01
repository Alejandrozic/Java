public class Searches {

    public static void main(String[] args) {
        // Run
        int[] arr = {1,5,11,21,32,45,67,89,109};

        linearSearch(arr,3);    // false
        binarySearch(arr, 32);  // true


    }
    private static boolean linearSearch(int[] arr, int find){
        /**
         * Linear Search
         *  - searches in linear fashion
         *  - O(N) Time Complexity
         * */

        for (int i: arr) {
            if (i == find){
                return true;
            }
        }
        return false;
    }

    private static boolean binarySearch(int[] arr, int find){
        /**
         * Binary Search on sorted array
         *  - searches at mid points of data,
         *    re-sizes search if not found to half (left or right)
         *  - O(logN) Time Complexity
         * */

        int low = 0;
        int mid;
        int high = arr.length;

        while (true){
            mid = (low + high) / 2;
            if ( find == arr[mid])
                return true;
            else if (find < arr[mid])
                high = mid;
            else
                low = mid;
            if (low >= high - 1 )
                return false;
        }
    }
}
