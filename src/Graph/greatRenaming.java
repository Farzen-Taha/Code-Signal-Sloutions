package Graph;

import java.util.Arrays;

public class greatRenaming {

    public static void main(String[] args) {
        boolean[][] roadRegister
                = {{false, true, true, false},
                {true, false, true, false},
                {true, true, false, true},
                {false, false, true, false}};
        boolean result[][] = new boolean[roadRegister.length][roadRegister[0].length];

        for (int i = 0; i < roadRegister.length; i++) {
            for (int j = 0; j < roadRegister[i].length; j++) {
                result[i+(i < roadRegister.length-1 ? 1 : -i)][j + (j < roadRegister[i].length -1? 1 : -j)]=roadRegister[i][j];      
                        
            }
        }
        for(boolean a[]:result){
            System.out.println(Arrays.toString(a)+"\n");
        }
    }

}
