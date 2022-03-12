package Intro;

import java.util.Arrays;
import java.util.Vector;

public class extractEachKth {
    public static void main(String[] args) {
        int k=1;
       int c=1;
        int inputArray[]={1,1,1,1,1};
        Vector<Integer> v=new <Integer> Vector ();
        for(int i=0;i<inputArray.length;i++){
            if(c==k){
                inputArray[i]=0;
                c=1;
            }
            else{
                v.add(inputArray[i]);
                 c++; 
            }
               
        }
//       for(int i=0;i<inputArray.length;i++){
//           if(inputArray[i]!=0){
//           v.add(inputArray[i]);
//       }
//       }
      int fin[]=new int[v.size()];
       for(int i=0;i<v.size();i++){
           fin[i]=(int)v.get(i);
       }
        System.out.println(Arrays.toString(fin));
       
       
//        int c=0;
//       for(int i=0;i<v.size();i++){
//           
//           if(k-1==c){
//               v.remove(i);
//               c=0;
//           }
//           c++;
//       }
//        System.out.println(v.toString( ));
        
    }
}
