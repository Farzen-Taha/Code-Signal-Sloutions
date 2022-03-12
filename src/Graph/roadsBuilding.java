
package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class roadsBuilding {
    public static void main(String[] args) {
        int cities=9;
//        StringBuilder s=new StringBuilder();
//        int [][]roads={{0,1},{1,2},{2,0}};
    int roads[][]={{5,8}, 
 {6,0}, 
 {0,5}, 
 {4,1}, 
 {0,1}, 
 {7,0}, 
 {6,8}, 
 {7,3}, 
 {2,6}, 
 {0,2}, 
 {0,3}, 
 {8,7}, 
 {5,4}, 
 {8,4}, 
 {8,2}, 
 {7,1}, 
 {4,6}, 
 {5,6}, 
 {4,2}, 
 {4,7}, 
 {2,7}, 
 {3,6}, 
 {8,0}, 
 {1,6}, 
 {3,2}, 
 {3,4}, 
 {4,0}, 
 {6,7}, 
 {5,7}};
        
        List<List> list=new ArrayList<List>();
        int c[][]=new int [cities][cities];
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[i].length;j++){
                c[i][j]=0;
            }
        }
        for(int i=0;i<roads.length;i++){
            int s=roads[i][0];
            int d=roads[i][1];
            c[s][d]=1;
        }
        for(int i=0;i<c.length;i++){      
            for(int j=0;j<c[i].length;j++){
                List l1=new ArrayList();
                if(c[i][j]==0 && c[j][i]==0 && i!=j && i<j){
                   l1.add(i);
                   l1.add(j);
                   list.add(l1);
                }
            }
            
        }
        System.out.println(Arrays.deepToString(list.toArray()));
    }
}
