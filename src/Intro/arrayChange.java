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
public class arrayChange {
    public static void main(String[] args) {
        int inputArray1[]={2, 3, 3, 5, 5, 5, 4, 12, 12, 10, 15};
           int inputArray[]={2, 3, 3, 5, 5, 5, 4, 12, 12, 10, 15};
//  int inputArray1[]={1,1,1};
//           int inputArray[]={1,1,1};
        int x,y,z,count=0;
        int j=0;int c=0;
        for(int i=0;i<inputArray.length-1;i++){
            x=inputArray[i];
            y=inputArray[i+1];
            if(x==y){
                inputArray[i+1]+=1;
            count++;
            }
            else{
            if(x>y){
                z=x-y;
                inputArray[i+1]+=z+1;
                count+=z+1;
                System.out.println("count: "+count);
               
            }
            }
           
        }
        System.out.println(count);
        System.out.println(Arrays.toString(inputArray1));
        System.out.println(Arrays.toString(inputArray));
    }
    
}
