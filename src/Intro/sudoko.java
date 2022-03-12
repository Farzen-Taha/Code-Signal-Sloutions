package Intro;
import java.util.HashSet;
import java.util.Set;

public class sudoko {
    public static boolean gridCheck(int i, int j,int grid[][]) {
        Set s = new HashSet();
        s.add(grid[i - 1][j - 1]);
        s.add(grid[i - 1][j]);
        s.add(grid[i - 1][j + 1]);
        s.add(grid[i][j - 1]);
        s.add(grid[i][j]);
        s.add(grid[i][j + 1]);
        s.add(grid[i + 1][j - 1]);
        s.add(grid[i + 1][j]);
        s.add(grid[i + 1][j + 1]);
        if (s.size() < 9) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        
        int grid[][] = {
            
            {1, 3, 2, 5, 4, 6, 9, 8, 7},
            {4, 6, 5, 8, 7, 9, 3, 2, 1},
            {7, 9, 8, 2, 1, 3, 6, 5, 4},
            {9, 2, 1, 4, 3, 5, 8, 7, 6},
            {3, 5, 4, 7, 6, 8, 2, 1, 9},
            {6, 8, 7, 1, 9, 2, 5, 4, 3},
            {5, 7, 6, 9, 8, 1, 4, 3, 2},
            {2, 4, 3, 6, 5, 7, 1, 9, 8},
            {8, 1, 9, 3, 2, 4, 7, 6, 5}};
//       
        boolean naq = true;
        Set rSet, cSet;
        for (int i = 0; i < grid.length; i++) {
            rSet = new HashSet();
            cSet = new HashSet();
            for (int j = 0; j < grid.length; j++) {
                if ((i == 1 && j == 1) || (i == 1 && j == 4) || (i == 1 && j == 7)
                        || (i == 4 && j == 1) || (i == 4 && j == 4) || (i == 4 && j == 7)
                        || (i == 7 && j == 1) || (i == 7 && j == 4) || (i == 7 && j == 7)) {

                    naq = gridCheck(i, j,grid);

                }
                if (!naq) {
                    break;
                }
                rSet.add(grid[i][j]);
                cSet.add(grid[j][i]);

            }
            if (rSet.size() < 9 || cSet.size() < 9 || (!naq)) {
                System.out.println("i: " + i);
                System.out.println(naq);
                naq = false;
                break;
            }
        }
        System.out.println(naq);
    }

}
