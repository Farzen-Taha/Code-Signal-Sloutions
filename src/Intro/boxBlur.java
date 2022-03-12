package Intro;

import java.util.Arrays;


public class boxBlur {

    public static int Average(int img[][], int row, int col) {
        int result=(img[row-1][col-1]+ img[row-1][col]+img[row-1][col+1]
               +img[row][col-1] + img[row][col] + img[row][col+1]
               +img[row+1][col-1]+ img[row+1][col] + img[row+1][col+1])/9;
                
        return result ;
    }

    public static void main(String[] args) {
        int image[][] = {{7, 4, 0, 1}, {5, 6, 2, 2}, {6, 10, 7, 8},{1, 4, 2, 0}};
        int row=image.length;//number of rows.
        int col=image[0].length;//number of columns.
        int img2[][]=new int[row-2][col-2];//Due to ignoring the borders,rows and cols of result will always be 2 col and row less than original array.
        for(int i=1;i<row-1;i++){//itterating up to 1 row before the final row.
            for(int j=1;j<col-1;j++){//itterating up to 1 column before the final column.
                img2[i-1][j-1]=Average(image,i,j);//Taking the average.
                
            }
        }

//        for (int i = 0; i < img2.length; i++) {
//            for (int j = 0; j < img2.length; j++) {
//                System.out.print(img2[i][j]);
//            }
//            System.out.println("");
//
//        }
//    
    }

}
