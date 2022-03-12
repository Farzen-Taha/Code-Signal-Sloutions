/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intro;

import java.util.ArrayList;

public class Circle_of_Numbers {

    public static void main(String[] args) {
        int n = 1000000;
        int firstNumber = 99;
        int secondNumber = 0;
//        ArrayList al = new ArrayList();
//        for (int i = 0; i <= n - 1; i++) {
//            al.add(i);
//        }
        int n2=n/2;
        if(firstNumber>n2){
            secondNumber=firstNumber-n2;
        }
        else if(firstNumber<n/2){
            secondNumber=firstNumber+n2;
        }
        else if(firstNumber==0){
            secondNumber=n-1;
        }
        else if(firstNumber==n-1){
            secondNumber=0;
        }
        System.out.println(secondNumber);
//        int fni = al.indexOf(firstNumber);
//        System.out.println(al.indexOf(2));
//        if (fni == 0) {
//            secondNumber = (int) al.get(al.size() - 1);
//        } else if (fni == al.size() - 1) {
//            secondNumber = (int) al.get(0);
//        } else if (fni < al.size() / 2) {
//            secondNumber = (int) al.get(al.size() / 2 + fni);
//        } else if (fni > al.size() / 2) {
//            int naw = al.size() - fni;
//            secondNumber = (int) al.get(al.size() / 2 - naw);
//        }
//        System.out.println(secondNumber);

    }

}
