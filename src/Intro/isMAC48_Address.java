package Intro;

public class isMAC48_Address {

    public static void main(String[] args) {
        String inputString = "00-56-BB-63-45-FE";
        // numbers Ascii Codes: 0:48->9:57
        //Alphabet Ascii Codes: A:65->Z:90 || a:97->z:122
        //"-" Ascii code:45
        /*
        Algorithm:
        1. Input string
        2. Check if inputString's length is 17 (MAC length)

        3. Iterate from begin to the end

        3.1. If index is multiple of 3, then check if it's hyphen

         -if not -> check if it's hexa char or number
        4. Return result bool
        src: https://itdar.tistory.com/entry/Aracade-Intro-47-isMAC48Address-Algorithm-알고리즘-Codefights-CodeSignal-코드파이트-코드시그널-예제-example-c-java-c-scalar [Stack by Stack]
         */

//        if (inputString.length() != 17) {
//            //return false;  
//        }
//        else {
//            for (char a : inputString.toCharArray()) {
//                //check if characters are betwenn A-F or 0-9
//                int index = inputString.indexOf(a);
//                System.out.println("a: " + a);
//                System.out.println("index of a: " + index);
//                index += 1;
//
//                if (index % 3 == 0) {
//                    if (a != '-') {
//                        //return false;
//                        System.out.println("break");
//                        break;
//                    }
//                } else if (((a < 65 || a > 70) && (a < 48 || a > 57))) {
//                    //return false;
//                    System.out.println("false");
//                    break;
//                }
//            }
//        }
//-----------------SECOND SLOUTION-------------------
        if (inputString.length() != 17) {
            //return false;
            System.out.println("out");
        } else {
            for (int i = 0; i < inputString.length(); i++) {

                if ((i + 1) % 3 == 0) {
                    if (inputString.charAt(i) != '-') {
                        //return false;
                        System.out.println("break");
                        break;
                    }
                } else if (((inputString.charAt(i) < 65 || inputString.charAt(i) > 70)
                        && (inputString.charAt(i) < 48 || inputString.charAt(i) > 57))) {
//                    //return false;
                    System.out.println("i: " + i + "  inputString.charAt(i): " + inputString.charAt(i));
                    System.out.println("false");
                    break;
                }
            }
        }
//----------------------------    THIRD SLOUTION----------------------
//return inputString.matches("^([0-9A-F][0-9A-F]-){5}[0-9A-F][0-9A-F]$");

    }
}
