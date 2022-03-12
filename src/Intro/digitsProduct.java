package Intro;

import java.util.Stack;

public class digitsProduct {

    public static void main(String[] args) {
        Stack s = new Stack();
        String r = "";
        int result = -1;
        int product = 243;
        int i = 9;
        if (product == 0) {
            result = 0;
        } else if (product >= 1 && product <= 9) {
            result = product;
        } else {
            while (i >= 2) {
                if (product % i == 0) {
                    s.push(i);
                    product /= i;
                } else {
                    i--;
                }
            }
            if (product == 1) {
                while (!s.isEmpty()) {
                    r += s.pop();
                }
                result = Integer.parseInt(r);
            } else {
                result = -1;
            }
            System.out.println("result: " + result);
        }
    }

}
