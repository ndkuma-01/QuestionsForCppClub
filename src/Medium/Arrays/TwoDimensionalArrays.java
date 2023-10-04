package Medium.Arrays;

import java.util.Arrays;

public class TwoDimensionalArrays {
    //2d Arrays are quite literally a matrix:
    // 1 2 3
    // 2 4 6
    // 3 6 9
    // Normally an array can only hold a 'vector' of elements: 1 2 3
    // However 2d arrays can hold vectors of vectors (aka a matrix)

    public static void main(String[] args) {
        //to intialize one use the following syntax
        //You have to declare the number of rows and columns [3][3] <- 3 rows and 3 columns [can hold 9 elements]
        int[][] nums = new int[3][3];

        //to index through a 2d array you need to use a nested for loop:

        for(int i= 0 ; i < nums.length ; i++){ //the reason behind nums.length is that tells you the amount of rows
            for(int j = 0; j < nums[0].length ; j++){ //nums[0].length tells you the number of columns
                nums[i ][j ] = (i)+ (j);
            }
        }

        //to print out each element you must go through them again
        for(int i = 0; i< nums.length; i++){
            for(int j = 0 ; j < nums[0].length; j++){
                System.out.print(nums[i][j]);
            }
            System.out.println();
        }


    }
    //this is the basics behind using 2d arrays, they are very useful for competitive programming
    //we will discuss them more in november
}
