
package theCore;

public class tennisSet {
    public static boolean tenSet(int score1,int score2){
        boolean result=false;
        if((score1<5 &&score2==6)||(score1>=6 && score2<5)){
            result=true;
        }else if((score1==7 &&score2>4&&score2<7) ||(score2==7 &&score1>4&&score1<7)){
            result=true;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(tenSet(8,5)+"\n");
        System.out.println(tenSet(6,5)+"\n");
        System.out.println(tenSet(3,6)+"\n");
        int n=37,k=3;
        
        String b=Integer.toBinaryString(n);
        System.out.println("b: "+b);
        System.out.println(Integer.toBinaryString(n).substring(0,b.length()-k));
        System.out.println(Integer.toBinaryString(n).substring((b.length()-k)+1));
//          String f= Integer.toBinaryString(n).substring(0,b.length()-k)+'0'+Integer.toBinaryString(n).substring(k);
//        System.out.println(b.length());
//        String f= Integer.toBinaryString(n).substring(0,Integer.toBinaryString(n).length()-k)+'0'+Integer.toBinaryString(n).substring((Integer.toBinaryString(n).length()-k)+1);
        System.out.println((int)(n-Math.pow(2, k-1)));
//        System.out.println(b);
        System.out.println(Integer.parseInt(Integer.toBinaryString(n).substring(0,Integer.toBinaryString(n).length()-k)+'0'+Integer.toBinaryString(n).substring((Integer.toBinaryString(n).length()-k)+1),2));
//        System.out.println(Integer.parseInt(Integer.toBinaryString(n).substring(0,k)+'0'+Integer.toBinaryString(n).substring(k+1),2));
       
//        System.out.println("F: "+f);
//        System.out.println("Binary of n: "+Integer.toBinaryString(n));
//        
//        System.out.println("Binary of kth: "+Integer.toBinaryString(n).charAt(Integer.toBinaryString(n).length()-k));
        
//        System.out.println( Integer.parseInt( Integer.toBinaryString(n).replace(Integer.toBinaryString(n).charAt(Integer.toBinaryString(n).length()-k),'0'),2));
    }
    
  
}
