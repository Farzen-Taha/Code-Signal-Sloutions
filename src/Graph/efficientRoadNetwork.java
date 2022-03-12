package Graph;

import java.util.Arrays;

public class efficientRoadNetwork {

    public static void main(String[] args) {
        int n = 6;
//        int roads[][] = {{3, 0}, 
//                         {0, 4}, 
//                         {5, 0}, 
//                         {2, 1}, 
//                         {1, 4}, 
//                         {2, 3}, 
//                         {5, 2}};
//        
        int roads[][] = {
            {0, 4},
            {5, 0},
            {2, 1},
            {1, 4},
            {2, 3},
            {5, 2}};
        System.out.println("roads: " + roads.length);
        int dist[][] = new int[n][n];
        for (int i = 0; i < roads.length; i++) {
            int s = roads[i][0];
            int d = roads[i][1];

            dist[s][d] = 1;
            dist[d][s] = 1;
        }
        //if there is and edge between two nodes and then assign 1 as its wieght.
        //if there is not an edge and i!=j then assigh Infinite as its wieght.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (dist[i][j] == 0 && i != j) {
                    dist[i][j] = 8;
                }
            }
        }
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(dist[i][j] + " ");
            }
            System.out.println();
        }
    }

}
