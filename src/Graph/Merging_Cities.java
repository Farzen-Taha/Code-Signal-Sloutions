package Graph;

import java.util.ArrayList;
import java.util.Iterator;

public class Merging_Cities {

    public static void merg(boolean[][] adj) {
        ArrayList bm = new ArrayList();
        ArrayList<ArrayList> temp=new ArrayList<ArrayList>();
        for (int i = 0; i < adj.length; i += 2) {
            if (adj[i][i+(i <adj.length-1?1:0)]) {
                bm.add(i);
            }
        }
        Iterator it=bm.iterator();
        while(it.hasNext()){
            int d=(int)it.next();
            for(int i=1;i<adj[d].length;i++){
                System.out.println("i: "+i);
                if(adj[d][i]){
//                   temp.get().add(true);
                }
            }  
        }
        for(int j=0;j<temp.size();j++){
            for(int k=0;k<temp.get(j).size();k++){
                System.out.print(temp.get(j).get(k));
            }
            System.out.println();
        }
        System.out.println("-----------------------");
//        System.out.println(bm.toString());

    }

    public static void main(String[] args) {
        boolean adj[][] = {
            {false, true, true, false, false, false, true},
            {true, false, true, false, true, false, false},
            {true, true, false, true, false, false, true},
            {false, false, true, false, false, true, true},
            {false, true, false, false, false, false, false},
            {false, false, false, true, false, false, false},
            {true, false, true, true, false, false, false}
        };

        merg(adj);
    }
}
