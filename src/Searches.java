public class Searches {

    public void linearSearch(){
        /**
         * Linear Search
         *  - searches in linear fashion
         *  - O(N) Time Complexity
         * */

        int[] arr = {1,2,3};
        int find = 2;

        for (int i: arr) {
            if (i == find){
                //...
            }
        }
    }

    public boolean binarySearch(){
        /**
         * Binary Search on sorted array
         *  - searches at mid points of data,
         *    re-sizes search if not found to half (left or right)
         *  - O(logN) Time Complexity
         * */

        int[] arr = {1,5,11,21,32,45,67,89,109};
        int find = 1;
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
