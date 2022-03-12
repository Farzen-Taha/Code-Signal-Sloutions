/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Sayed Farzen
 */
public class PallinderomRearanging {

//    public static char[] chng(char[] b, int i, int j) {
//        char tmp = b[i];
//        b[i] = b[j];
//        b[j] = tmp;
//        return b;
//    }
//    public static char[] rvrs(char a[]) {
//        System.out.println("a: " + Arrays.toString(a));
//        int last = a.length;
//        for (int i = 0; i < a.length / 2; i++, last--) {
//            char tmp = a[i];
//            a[i] = a[last];
//            a[last] = tmp;
//        }
//
//        System.out.println("aRvrse: " + a);
//        return a;
//    }
    public static void main(String[] args) {
        Hashtable<Character, Integer> ht = new <Character, Integer> Hashtable();
        String a = "abbbcbdaa";
        int c = 1, cntr = 0;
        boolean flag = true;
        for (int i = 0; i < a.length(); i++) {
            if (!ht.containsKey(a.charAt(i))) {
                ht.put(a.charAt(i), c);
            } else {
                int b = ht.get(a.charAt(i));
                ht.put(a.charAt(i), b+=1);
            }
        }
        for (Map.Entry<Character, Integer> entry : ht.entrySet()) {
            if (ht.get(entry.getKey())% 2 != 0) {
                cntr++;  
            }
        } 
        
        if (cntr > 1) {
            flag = false;
        }
        System.out.println("flag: " + flag);
//        String s = "abbcabb";
//        char ch[] = s.toCharArray();
//        ArrayList al = new ArrayList();
//        StringBuilder sb = new StringBuilder();
////        for (char a : s.toCharArray()) {
////            al.add(a);
////        }
////        System.out.println(al);
//
////        char s1[] = s.toCharArray();
//        boolean flag = false;
//        for (int i = 0; i < s.length() - 1; i++) {
//
//            for (int j = 0; j < s.length(); j++) {
//
////               sb.append( Arrays.toString(chng(ch,i,j)));
//                String b = Arrays.toString(chng(ch, i, j));
//                String c = Arrays.toString(rvrs(b.toCharArray()));
////                sb.append(b);
//
//                sb.replace(0, sb.length(), b);
////                System.out.println("sb: "+sb);
////                System.out.println("b: "+b);
//
//                if (sb.toString().equals(b)) {
////                    System.out.println(sb.toString());
//                    flag = true;
//                } else {
//
//                }
//            }
//
//        }
//        System.out.println(flag);
    }

}
