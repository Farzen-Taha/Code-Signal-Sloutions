/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intro;

public class spiralNumbers {

    public static void main(String[] args) {
        int n = 5;
        int temp[][] = new int[n][n];
        int counter = 1;
        int firstRow = 0;
        int firstCol = 0;
        int rows = n;
        int col = n;
//        for (int i = firstRow; i < col; i++) {
////                System.out.println("counter: ");
//            temp[firstRow][i] = counter;
//            counter++;
//        }
//        firstRow++;
//
//        for (int i = firstRow; i < rows; i++) {
//            temp[i][col - 1] = counter;
//            counter++;
//        }
//        col--;
//
//        for (int i = col - 1; i >= firstCol; i--) {
//            temp[rows - 1][i] = counter;
//            counter++;
//        }
//        rows--;
//        
//        for (int i = rows - 1; i >= firstRow; i--) {
//            temp[i][firstCol] = counter;
//            counter++;
//        }
//        firstCol++;
        while (firstRow < rows && firstCol < col) {
             for (int i = firstRow; i < col; i++) {
//                System.out.println("counter: ");
            temp[firstRow][i] = counter;
            counter++;
        }
        firstRow++;

        for (int i = firstRow; i < rows; i++) {
            temp[i][col - 1] = counter;
            counter++;
        }
        col--;

            if (firstRow < rows) {
//                System.out.println("tc: "+tc);
                for (int i = col - 1; i >= firstCol; i--) {
            temp[rows - 1][i] = counter;
            counter++;
        }
        rows--;
            }
            if(firstCol < col){
                for (int i = rows - 1; i >= firstRow; i--) {
            temp[i][firstCol] = counter;
            counter++;
        }
        firstCol++;
            }
        }
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                System.out.print(temp[i][j] + " ");
            }
            System.out.println("");
        }

    }

}
