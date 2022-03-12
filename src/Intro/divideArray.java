
package Intro;

import java.util.ArrayList;
import java.util.Arrays;

public class divideArray {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},
                     {2,1,2},
                     {3,2,1},
                     {4,3,2},
                     {5,3,6}};
        ArrayList al=new ArrayList();
        String m="";
        for(int i=1;i<arr.length;i++){
            for(int j=1;j<arr[i].length;j++){
                m=arr[i-1][j-1]+","+arr[i-1][j]+","+arr[i][j-1]+","+arr[i][j];
              if(!al.contains(m)){
                  al.add(m);
              }
//al.add(m);
            }

        }
        System.out.println("Result: "+al.size());
    }
}
