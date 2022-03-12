
package Intro;

public class isInfinitProcess {
    public static void main(String[] args) {
        int a=8;
        int b=9;
        int a1=a;
        boolean flag=false;
        while(a!=b){
            a++;
            b--;
            if(b<a1){
                flag=true;
                break;
            }
        }
        System.out.println("flag: "+flag);
    }
    
}
