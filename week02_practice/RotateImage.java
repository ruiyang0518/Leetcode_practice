package week02;

/**
 * Created by 502750454 on 6/29/2017.
 */
public class RotateImage {

//    public static void main(String[] args) {
//        int[][]matrix = new int[3][3];
//        int num = 0;
//        for(int row = 0;row < 3;row++){
//            for(int col = 0; col<3;col++){
//                matrix[row][col] = num;
//                num++;
//            }
//        }
//
//        rotate(matrix);
//
//        for(int row = 0;row < matrix.length;row++){
//            System.out.print("\n");
//            for(int col = 0; col<matrix[0].length;col++){
//                System.out.print(matrix[row][col]);
//            }
//        }
//
//    }
    public static void rotate(int[][]matrix){
        // corner case
        if(matrix == null || matrix.length==0 || matrix[0].length==0){
            return;
        }

        // do right diagonal
        for( int row = 0 ; row < matrix.length; row ++){
            for(int col = row ; col < matrix[0].length; col++){
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }

        // do mirrow
        for(int row = 0; row < matrix.length;row++){
            for(int col = 0; col<matrix[0].length/2;col++){
                int temp = matrix[row][col];
                matrix[row][col] = matrix[row][matrix.length-col-1];
                matrix[row][matrix.length-col-1] = temp;
            }
        }

    }

}
