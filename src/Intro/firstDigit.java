
package Intro;
import java.util.regex.*;

public class firstDigit {
    public static void main(String[] args) {
        String inputString="var_1_2_Int";
//        Pattern p=Pattern.compile("[0-9]");
//        Matcher m=p.matcher(inputString);
//        boolean f=m.find();
//        if(f){
//            System.out.println("yes");
//        }
        String replaceAll = inputString.replaceAll("[^0-9]","");
//        for(int i=0;i<inputString.length();i++){
//            if(Character.isDigit(inputString.charAt(i))){
//                c=(inputString.charAt(i));
//                break;
//            }
//        }
System.out.println("inputString: "+replaceAll);
    }
    
}
