/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intro;

/**
 *
 * @author Sayed Farzen
 */
public class arrayMaximalAdjacentDifference {
    public static void main(String[] args) {
           int inputArray[]={2, 4, 1, 0};
        int max=-2147483648;
    int j=1;
    for(int i=0;i<inputArray.length&&j<inputArray.length;i++,j++){
        System.out.println("aaaa: "+(inputArray[i]-inputArray[j]));
        if( Math.abs(inputArray[i]-inputArray[j])>max)
        max=inputArray[i]-inputArray[j];
        System.out.println("MAx: "+max);
    }
    
    }
    
}
