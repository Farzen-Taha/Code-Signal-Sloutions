/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intro;


public class arrayMaxConsecutiveSum {
    public static void main(String[] args) {
        
       int inputArray[]={2, 3, 5, 1, 6};
       int k=3;
//       int sum=0;
//       int max=0;
//       
//       for(int i=0;i<inputArray.length;i++){
//           sum=0;
//           int c=1;
////           int j=i;
//           for(int j=i;j<inputArray.length && c<=k;j++){
//                sum+=inputArray[j];
//                if(sum>max){
//                   
//                   max=sum;
//               }
//                 c++;
//           }
//          
//       }
int sum = 0;
    int max = 0;

    for (int i = 0; i <= inputArray.length-k; i++)
    {
        sum = 0;
        for (int j = i; j < k + i; j++)
        {
            sum += inputArray[j];
        }

        if (sum > max)
            max = sum;
    }
        System.out.println("max: "+max);
    }
}
