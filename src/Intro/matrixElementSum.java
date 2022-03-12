/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intro;

/**
 *
 * @author Sayed Farzen
 */
public class matrixElementSum {

    public static void main(String[] args) {
        int s = 0;
//        int score[][] = {{0, 1, 1, 2}, {0, 5, 0, 0}, {2, 0, 3, 3}};
//        int score[][] = {{1, 1, 1, 0}, {0, 5, 0, 1}, {2, 1, 3, 10}};
          int score[][] = {{1}};
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < 4; j++) {
//                System.out.print(score[i][j]);
                if (score[i][j] == 0) {
                    for (int k = i; k < score.length; k++) {
                        score[k][j] = 0;
                    }
                }
                s += score[i][j];
            }
//            System.out.println();
        }
//        System.out.println(s);
//        for (int i = 0; i < score.length; i++) {
//            for (int j = 0; j < 4; j++) {
//                System.out.print(score[i][j]);
////                if(score[i][j]==0){
////                    for(int k=0;k<score.length;k++){
////                        score[k][j]=0;
////                    }
//            }
//            System.out.println();
//
//        }
//        System.out.println(s);
   }
}
