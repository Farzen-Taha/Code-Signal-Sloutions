/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intro;

import java.util.Arrays;

/**
 *
 * @author Sayed Farzen
 */
public class isLucky {
    public static void main(String[] args) {
        int n=1230;
        String s= Integer.toString(n);
        int arr[]=new int[s.length()];
        int a;
        int sum1=0,sum2=0;
        int i=0;
        while(n>0){
            a=n%10;
            arr[i]=a;
            n/=10;
            i++;
        }
        for(int j=0;j<arr.length/2;j++){
            sum1+=arr[j];
        }
        for(int k=arr.length/2;k<arr.length;k++){
            sum2+=arr[k];
        }
        System.out.println("sum1"+sum1);
         System.out.println("sum1"+sum2);
        if(sum1==sum2)
            System.out.println(true);
        System.out.println(Arrays.toString(arr));
    }
    
}
