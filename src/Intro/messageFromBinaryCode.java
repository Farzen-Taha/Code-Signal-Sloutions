/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intro;

import java.util.Arrays;


public class messageFromBinaryCode {
    public static void main(String[] args) {
        String code="010010000110010101101100011011000110111100100001";
        String arr[];
        int start=0;
        int end =8;
        String temp="",msg="";
        char t;
        while(end<=code.length()){
            temp=code.substring(start, end);
            t=(char)Integer.parseInt(temp,2);
            msg+=t;
            start=end;
            end+=8;
        }
        System.out.println("msg: "+msg);
       
    }
    
}
