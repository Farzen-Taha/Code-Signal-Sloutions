package Intro;

import java.util.Arrays;
import java.util.Scanner;

public class isIPv4Address {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        String[] s = in.nextLine().split("\\.");
        if (s.length != 4) {
            flag = false;
        } else {
            for (int i = 0; i < s.length; i++) {
                try {

                    if (s[i].length() == 0 || Integer.parseInt(s[i]) > 255) {
                        flag = false;
                        break;
                    } else {

                        if (s[i].charAt(0) == '0') {
                            if (s[i].equals("0")) {

                            } else {
                                flag = false;
                                break;
                            }
                        }
                    }
                }
                catch(NumberFormatException e){
                    flag=false;
                }
            }

        }
        System.out.println("flag: "+flag);
    }

}
