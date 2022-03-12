package Graph;

import java.util.Arrays;

public class financialCrisis {

    public static void main(String[] args) {
        boolean[][] roadRegister = {
            {false, true, true, false},
            {true, false, true, false},
            {true, true, false, true},
            {false, false, true, false}
        };

        boolean[][][] result = new boolean[roadRegister.length][roadRegister.length - 1][roadRegister.length - 1];

        for (int i = 0; i < roadRegister.length; i++) {
            boolean temp[][] = new boolean[roadRegister.length - 1][roadRegister.length - 1];
            for (int j = 0; j < roadRegister.length; j++) {
                for (int k = 0; k < roadRegister[j].length; k++) {
                    if (i == j || k == i) {
                    } else {
                        if (k > i && j > i) {
                            temp[j - 1][k - 1] = roadRegister[j][k];
                        } else if (k > i && j < i) {
//                            System.out.println("i: "+i);
//                            System.out.println("j:"+j);
//                            System.out.println("K: "+k);
                            temp[j][k-1] = roadRegister[j][k];
                        } else if (k < i && j > i) {
                            temp[j-1][k] = roadRegister[j][k];
                        } else if(j<i && k<i){
//                            System.out.printl                                                              
                            temp[j][k] = roadRegister[j][k];
//                            System.out.println("temp [j][k]"+temp[j][k]);
                        }
                    }
                }
                result[i] = temp;
//                for (int l = 0; l < temp.length; l++) {
//                    for (int m = 0; m < temp[j].length; m++) {
//                        System.out.print(temp[l][m] + " ");
//
//                    }
//                    System.out.println();
//                }
            }
        
    }

//    System.out.println (Arrays.deepToString(result));
        for (int l = 0; l < result.length; l++) {
            System.out.println("i: "+l);
            for (int m = 0; m < result[l].length; m++) {
                for (int n = 0; n < result[l][m].length; n++) {
//                    System.out.println("m: " + m);
//                            System.out.println("n: " + n);
                    System.out.print(result[l][m][n] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

}
