package Intro;

import java.util.Stack;

public class nToK {
    public static void main(String[] args) {
        //Algorithm sorce: geegks for geeks.
        Stack s=new Stack();
        String r="";
        int n=576;
        int i=9;
        while(i>=2){
            if(n%i==0){
                s.push(i);
                n/=i;
            }else{
                i--;
            }
        }
         System.out.println(s.toString());
    if(n==1){
        while(!s.isEmpty()){
            r+=s.pop();
        }
       
        System.out.println("r: "+Integer.parseInt(r));
    }else System.out.println("r: -1");}
}
