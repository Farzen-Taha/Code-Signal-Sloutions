package Intro;

import java.util.Arrays;

public class stringsRearrangement {

    public static boolean compare(String first, String second) {
        boolean c = true;
        int count = 0;
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                count++;
            }
            if (count > 1) {
                c = false;
                break;
            }
        }
//        System.out.println("comp return: "+c);
        return c;
    }

    public static void change(String arr[], int i) {
        String temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
    }

    public static boolean check(String sqns[]) {
//        int i = 0;
        boolean c = false;
        for (int i = 0; i <= sqns.length - 2; i++) {
            String first = sqns[i];
            String second = sqns[i + 1];
            if (compare(first, second)) {
                c = true;
            } else {
                c=false;
                break;
            }
        }
        return c;
    }

    public static void main(String[] args) {
//        String sqns[] = {"aba", "bbb", "bab"};
      String sqns[] = {"abc",  "bef", "bcc", "bec", "bbc", "bdc"};
//        String sqns[] = {"aa", "bb", "ab"};
int counter=0;
        boolean c = false;
        for (int i = 0; i <= sqns.length-1; i++) {
            for (int j = 0; j <=sqns.length -1; j++) {
                System.out.println(counter+": "+Arrays.toString(sqns));
                if (check(sqns)) {

                    c = true;

                    break;
                } else {
                    counter++;
                    String temp = sqns[i];
                    sqns[i] = sqns[j];
                    sqns[j] = temp;
//                    System.out.println(Arrays.toString(sqns));
                }
            }
            if (c) {
//                System.out.println(Arrays.toString(sqns));
                break;
            }
        }
        System.out.println(c);
//        int i = 0;
//        while (i <= sqns.length - 2) {
//            String first = sqns[i];
//            String second = sqns[i + 1];
//            if (!check(first, second)) {
//                change(sqns, i);
//                i = 0;
//            } else {
//                i++;
//            }
//        }
//        if (i == sqns.length - 2) {
//            System.out.println(" true");
//        } else {
//            System.out.println(" False");
//        }
    }

//        for (int i = 0; i < sqns.length - 1; i++) {
//            String first = sqns[i];
//            String second = sqns[i + 1];
//            c = check(first, second);
//            System.out.println("c: " + c);
//            if (!c) {
////                String temp = sqns[i];
////                sqns[i] = sqns[i + 1];
////                sqns[i + 1] = temp;
//                String temp = first;
//                first = second;
//                second = temp;
//                c = check(first, second);
//                System.out.println("sC: " + c);
//
//            }
//        }
//        System.out.println("Fc: " + c);
//    }
}
