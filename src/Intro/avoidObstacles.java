/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intro;

import java.util.Arrays;

public class avoidObstacles {

    public static void main(String[] args) {
        int inputArray[] = {1, 4, 10, 6, 2};
        boolean flag = false;
        Arrays.sort(inputArray);
        int sps =  1;
        System.out.println("sps---->"+sps);
        while (!flag) {
            int j=0;
            for (int i = 0; i < inputArray.length; i++) {
                if (inputArray[i] % sps != 0) {
                    j++;
                } else {
                    sps++;
                    break;
                }
            }
            if(j==inputArray.length){
                flag=true;
            }
        }
        System.out.println("flag: "+flag);
        System.out.println("sps: "+sps);

    }
}
