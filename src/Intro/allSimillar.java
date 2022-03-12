/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Sayed Farzen
 */
public class allSimillar {
 
    public static void main(String[] args) {
        int k, l, temp, count = 0;
        int val;
        boolean flag = false;
        int a[] = {2, 9, 6, 8, 9, 5};
        int b[] = {2, 5, 6, 8, 9, 9};
//        System.out.println(Arrays.toString(a));
        ArrayList<Integer> first = new ArrayList<Integer>();

        ArrayList<Integer> second = new ArrayList<Integer>();
        for (int ae : a) {
            first.add(ae);
        }
        for (int be : b) {
            second.add(be);
        }
        int j = 0;
        for (int i = 0; i < first.size(); i++) {

            if (count == 0) {
                if (Objects.equals(first.get(i), second.get(j))) {
                    j++;
                } else {
//                    System.out.println("firstDiff:" + first.get(i));
//                    System.out.println("SecondDiff:" + second.get(j));
//                    count++;
                    k = i;
                    val =first.get(k);
                    if (second.contains(val)) {
                        l = second.indexOf(val);
                       
                        if (Objects.equals(first.get(l), second.get(l))) {
                            
                            j++;
                        } else {
                            temp = (int) second.get(i);
                            second.set(i, second.get(l));
                            second.set(l, temp);
//                        System.out.println("changed");
                            if (first.equals(second)) {
                                flag = true;
                            } else {
                                flag = false;
                            }
//                        count++;
//                        System.out.println("brak");
//                        j++;
                            break;
                        }

                    }

                }
            }
        }

        System.out.println(flag);

    }

}
