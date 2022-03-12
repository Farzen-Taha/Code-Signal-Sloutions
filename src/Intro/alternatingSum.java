
package Intro;

public class alternatingSum {
    public static void main(String[] args) {
        int a[]={50, 60, 60, 45, 70};
        
        int sum1=0;
        int sum2=0;
        for(int i=0;i<a.length;i++){
            if(i%2==0)
            sum1+=a[i];
            else
                sum2+=a[i];
        }
//        for(int i=1;i<a.length;i+=2){
//            sum2+=a[i];
//        }
        System.out.println(sum1);
         System.out.println(sum2);
    }
}
