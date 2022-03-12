package Graph;

import java.util.ArrayList;
import java.util.Arrays;
/*
------------------------Algorithm----------------------
1:Create an adjency list from roads[][].
    do while graph has conquereable cities{
2:find the cities that has 1 or less naighbors and has not been conquered yet.
3:add those cites to conquered cities, save the day that it was conquereda and delete the city..
4:decrese the overall size of graph.
5:delte all edges to and from the conquered cities.
}
6:return the days.
*/
public class CitiesConquering {

    public static int[] cityConquer(int n, int roads[][]) {
        ArrayList<ArrayList> al = new ArrayList<ArrayList>();
        int result[] = new int[n];
        ArrayList conquered = new ArrayList();
        Arrays.fill(result, -1);
        for (int i = 0; i < n; i++) {
            al.add(new ArrayList());
        }
        for (int[] road : roads) {
            int s = road[0];
            int d = road[1];
            al.get(s).add(d);
            al.get(d).add(s);
        }
        int c1 = al.size(), day = 0, c2 = 0;
        while (c2 != c1) {
            day++;
            c2 = c1;
            ArrayList deleted = new ArrayList();
            for (int i = 0; i < al.size(); i++) {
                if (al.get(i).size() <= 1 && (!conquered.contains(i))) {
                    result[i] = day;
                    deleted.add(i);
                    conquered.add(i);
                    c1--;
                }
            }
            for (Object ob : deleted) {
                int ob2 = (int) ob;
                //delte edges from conquered
                if (al.contains(al.get((ob2)))) {
                    al.get(ob2).clear();
                }
                for (int i = 0; i < al.size(); i++) {
                    al.get(i).remove(ob);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int roads[][] = {{1, 0}, {1, 2}, {8, 5}, {9, 7},
        {5, 6}, {5, 4}, {4, 6}, {6, 7}};

        System.out.println(Arrays.toString(cityConquer(10, roads)));

    }
}
