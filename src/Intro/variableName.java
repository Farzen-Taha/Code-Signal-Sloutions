/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intro;

import java.util.ArrayList;


public class variableName {
    public static void main(String[] args) {
        String name="b+4__g";
        boolean b=true;
        for(char a: name.toCharArray()){
            if((Character.isDigit(name.charAt(0)))||!(Character.isAlphabetic(a)|| Character.isDigit(a)|| a=='_'))
                b=false;
        }
        System.out.println(b);
    }
    
}
