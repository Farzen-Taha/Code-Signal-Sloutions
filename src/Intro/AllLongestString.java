/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intro;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Sayed Farzen
 */
public class AllLongestString {
    public static void main(String[] args) {
       
        String a[]={"ab","abc","cd","lcd"};
//        String b[]=new String[a.length];
        ArrayList<String>al=new ArrayList<String>();
        String e=a[0];
        for(String s:a){
            if(s.length()>e.length())
                e=(s);
        }
//        System.out.println(e);
 
        for(String s:a){
            if(s.length()>=e.length()){
                al.add(s); 
             
            }
        }
        String c[]=new String[al.size()];
        c=al.toArray(c);
        
        for(String d:c){
            System.out.println(d);
        }
        
    }
    
}
