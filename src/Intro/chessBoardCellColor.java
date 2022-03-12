
package Intro;


public class chessBoardCellColor {
    public static int chng(char c){
        int a=0;
         switch (c){
            case 'A':
                a=1;
            break;
            case 'B':
                a=2;
            break;
            case 'C':
                a=3;
            break;
            case 'D':
                a=4;
            break;
            case 'E':
                a=5;
            break;
            case 'F':
                a=6;
            break;
            case 'G':
                a=7;
            break;
            case 'H':
                a=8;
            break;
        }
        return a;
    }
    public static void main(String[] args) {
        String cell1="B3";
        String cell2="H8";
        boolean same=false;
        int a=chng(cell1.charAt(0));
        int b=chng(cell2.charAt(0));
        //Odd and Odd
        if(a%2!=0 && Character.getNumericValue(cell1.charAt(1))%2!=0){
            //Odd and Odd || Even and Even
            if(b%2!=0 && Character.getNumericValue(cell2.charAt(1))%2!=0 || b%2==0 && Character.getNumericValue(cell2.charAt(1))%2==0){
                same=true;
                
            }
            
        }
        
        //Even and Even
        if(a%2==0 && Character.getNumericValue(cell1.charAt(1))%2==0){
            //Odd and Odd || Even and Even
            if(b%2!=0 && Character.getNumericValue(cell2.charAt(1))%2!=0 || b%2==0 && Character.getNumericValue(cell2.charAt(1))%2==0){
                same=true;
                
            }
            
        }
        //Odd and Even
        if(a%2!=0 && Character.getNumericValue(cell1.charAt(1))%2==0){
            //Odd and Even || Even and Odd
            if(b%2!=0 && Character.getNumericValue(cell2.charAt(1))%2==0 || b%2==0 && Character.getNumericValue(cell2.charAt(1))%2!=0){
                same=true;
                
            }
            
        }
        //Even and Odd
        if(a%2==0 && Character.getNumericValue(cell1.charAt(1))%2!=0){
            //Odd and Odd || Even and Even
            if(b%2!=0 && Character.getNumericValue(cell2.charAt(1))%2!=0 || b%2==0 && Character.getNumericValue(cell2.charAt(1))%2==0){
                same=true;
                
            }
            
        }
        System.out.println(same);
        
    }
    
}
