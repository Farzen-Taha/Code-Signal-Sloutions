package Graph;

import java.util.Arrays;
import java.util.Comparator;

public class namingRoads {

    public static void main(String[] args) {
        int roads[][] = {
            //        {0,1,0},
            //        {4,1,2},
            //        {4,3,2},
            //        {2,3,1},
            //        {2,0,3}

            {3, 0, 0}, {2, 3, 1}, {0, 2, 2}
        };

        Arrays.sort(roads, Comparator.comparingInt(a -> a[2]));

        boolean res = true;
        for (int i = 0; i < roads.length - 1; i++) {
            if (roads[i][2] + 1 == roads[i + 1][2] && (roads[i][0] == roads[i + 1][1] || roads[i][1] == roads[i + 1][1])) {
                res = false;
            }
        }
        System.out.print(res);
    }
}
