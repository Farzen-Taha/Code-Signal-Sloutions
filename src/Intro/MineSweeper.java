package Intro;

public class MineSweeper {

    public static void cal(boolean matrix[][], int rslt[][], int i, int j) {
        //Rgiht
        if(j<matrix[0].length-1){
//            System.out.println("i: "+i);
//            System.out.println("j: "+j);
            if(matrix[i][j+1]){
                rslt[i][j]++;
            }
        }
        //Down 
        if(i<=matrix.length-2){
//            System.out.println("i: "+i);
//            System.out.println("j: "+j);
            if(matrix[i+1][j]){
              rslt[i][j]++;  
            }
        }
        //left
        if(j>0){
//            System.out.println("i: "+i);
//            System.out.println("j: "+j);
            if(matrix[i][j-1]){
                rslt[i][j]++;
            }
        }
        //up
        if(i>0){
//            System.out.println("i: "+i);
//            System.out.println("j: "+j);
            if(matrix[i-1][j]){
                rslt[i][j]++;
            }
        }
        //upRigh
        if(i>0 && j< matrix[0].length-1){
//            System.out.println("i: "+i);
//            System.out.println("j: "+j);
            if(matrix[i-1][j+1]){
                rslt[i][j]++;
            }
            
        }
        //upLeft
        if(i>0 && j>0){
//            System.out.println("i: "+i);
//            System.out.println("j: "+j);
            if(matrix[i-1][j-1]){
                rslt[i][j]++;
            }
        }
        //Down Righ
        if(i<=matrix.length-2 && j<= matrix[0].length-2){
//            System.out.println("i: "+i);
//            System.out.println("j: "+j);
            if(matrix[i+1][j+1]){
                rslt[i][j]++;
            }
        }
        //down left
        if(j>0&& i< matrix.length-1){
//            System.out.println("i: "+i);
//            System.out.println("j: "+j);
            if(matrix[i+1][j-1]){
                rslt[i][j]++;
            }
        }
            
            
    }

    public static void main(String[] args) {

        boolean matrix[][] = {{false,true,true,false}, {true,true,false,true}, {false,false,true,false}};
        int rslt[][] = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                rslt[i][j]=0;
                cal(matrix, rslt, i, j);
            }
        }
        for (int k = 0; k < rslt.length; k++) {
            for (int l = 0; l < rslt[k].length; l++) {
                System.out.print(rslt[k][l] + " ");
            }
            System.out.println("");
        }
    }
}
