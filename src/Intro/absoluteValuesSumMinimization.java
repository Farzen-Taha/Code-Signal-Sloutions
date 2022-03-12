
package Intro;

public class absoluteValuesSumMinimization {
    public static void main(String[] args) {
        int a[]={10,13,12,14};
//        System.out.println(a[(a.length-1)/2]);
        int min=Integer.MAX_VALUE;
        int b=0;
        int c=0;
        for(int i=0;i<a.length;i++){
            b=0;
            for(int j=0;j<a.length;j++){
//                System.out.println("a[j]-a[i]: "+(a[j]-a[i]));
                b+=Math.abs(a[j]-a[i]);
            }
//            System.out.println("a: "+a);
            if(b<min){
               min=b;
               c=a[i];
            }
            else
            if(b==min){
                if(a[i]<b){
                    b=a[i];
                }
            }
        }
        System.out.println(c);
    }
    
}
