/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intro;

public class alphbeticShift {
    public static void main(String[] args) {
        String inputString="abcdzs";
        String rslt="";
        char c[]=inputString.toCharArray();
        for(int i=0;i<inputString.length();i++){
              if(c[i]=='z'){
                c[i]='a';
                rslt+=c[i];
            }
              else{
            c[i]=(char)((int)(c[i])+1);
            rslt+=c[i];
              }

        }
       
        System.out.println("rslt: "+ new String (c));
        
//         for(int i=0;i<inputString.length()-1;i++){
//             int a=(inputString.charAt(i)+1);
//             System.out.println(a);
//             inputString.replaceAll(rslt, rslt)
//             
//         
//         }
//        System.out.println(rslt);
    }
    
}
