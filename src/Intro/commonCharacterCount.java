/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intro;

import java.util.Collections;
import java.util.Hashtable;

/**
 *
 * @author Sayed Farzen
 */
public class commonCharacterCount {

    public static void main(String[] args) {
        Hashtable<Character, Integer> ht = new Hashtable<Character, Integer>();
        Hashtable<Character, Integer> ht2 = new Hashtable<Character, Integer>();
        String s1 = "abca";
        String s2 = "xyzbac";
        int sum = 0;
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (!ht.containsKey(ch)) {
                int count = 0;
                for (int j = 0; j < s1.length(); j++) {
                    if (ch == s1.charAt(j)) {
                        count++;
                    }
                }
                ht.put(ch, count);
            }
        }
        System.out.println("ht1"+ht);
        for (int i = 0; i < s2.length(); i++) {
            char ch2 = s2.charAt(i);
            if (!ht2.containsKey(ch2)) {
                int count = 0;
                for (int j = 0; j < s2.length(); j++) {
                    if (ch2 == s2.charAt(j)) {
                        count++;
                    }
                }
                ht2.put(ch2, count);
            }
        }
        System.out.println("ht2"+ht2);
        int sum1 = 0;
        for (int j = 0; j < s1.length(); j++) {
            char ch3 = s1.charAt(j);
            System.out.println(ch3);
            if (ht.containsKey(ch3) && ht2.containsKey(ch3)) {
                int a=ht.get(ch3);
                int b=ht2.get(ch3);
                if (a <b ) {
                    sum1 += ht.get(ch3);
                } else {
                    sum1 += ht2.get(ch3);
                }
                ht.remove(ch3);
                ht2.remove(ch3);
            }
        }
        System.out.println(sum1);
//        System.out.println(sum1S);
//        System.out.println("Hashtable"+ht);
//        System.out.println("Hashtable"+ht2);
//        
//        for(int k=0;k<s2.length();k++){
//            char ch2=s2.charAt(k);
//            if(ht.containsKey(ch2)){
//                int n=ht.get(ch2);
//                 int count2=0;
//               for(int l=0;l<s2.length();l++){        
//                   if(ch2==s2.charAt(l))
//                       count2++;
//               } 
//               if(n>count2){
//                   ht.replace(ch2, count2);
//                   n=ht.get(ch2);
//               }
//            }
//        }
//        System.out.println("Hashtable"+ht);
//        System.out.println(sum);
//    }
    }
}
