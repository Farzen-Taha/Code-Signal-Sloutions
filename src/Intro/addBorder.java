/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Sayed Farzen
 */
public class addBorder {
    public static void main(String[] args) {
        
    String []picture={"abc","cde"};
    ArrayList <String>al=new ArrayList<String>(Arrays.asList(picture));
        int a=al.get(0).length();
        int b=(int)(al.size()+1);
        String s="";
        for(int i=0;i<a+2;i++){
            s+="*";
        }
//        int i=0;
//        while(i!=b+1){
//            System.out.println(i);
//            if(i==0)
//                al.add(i, "-- " + s + "-- ");
//            else if (i == b) {
////                System.out.println("s"+s);
//                al.add(i, s + "k");
//            } else {
//                al.set(i, "*" + al.get(i) + "*");
//            }
//                i++;
//        }
        
        for(int i=0;i<=b;i++){
            if(i==0 || i==b)
                al.add(i,s);
            else
                al.set(i, "*"+al.get(i)+"*");
        }
        String picture2[]=new String[(int)al.size()];
        al.toArray(picture2);
        System.out.println("pic: "+Arrays.toString(picture2));
        System.out.println(al);
    }
   
    
    
}
