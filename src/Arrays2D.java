public class Arrays2D {

    public static void main(String[] args) {
        int[][] array = generate(5,5);
        toString(array);
        // Output:
        //        0 1 2 3 4
        //        1 2 3 4 5
        //        2 3 4 5 6
        //        3 4 5 6 7
        //        4 5 6 7 8
    }

    private static int[][] generate(int row, int col){
        int[][] array = new int[row][col];
         for (int i=0; i< row ; i++ ){
            for (int j=0; j< col ; j++ ){
                array[i][j] = i+j;
            }
        }
        return array;
    }

    private static void toString(int[][] array){
        for (int i=0; i< array.length ; i++ ){
            StringBuilder string = new StringBuilder();
            for (int j=0; j< array[i].length ; j++ ){
                string.append(array[i][j]).append(" ");
            }
            System.out.println(string);
        }
    }
}
