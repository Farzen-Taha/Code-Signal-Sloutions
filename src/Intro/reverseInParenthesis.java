package Intro;

import java.util.Stack;

public class reverseInParenthesis {

    static void reverse(char b[], int low, int high) {
       
        for(int i=low;i<high;i++, high--){
             char tmp = b[i];
            b[i] = b[high];
            b[high] = tmp;
//            high--;
        }
         System.out.println(high);
        System.out.println(b);
//        if (low < high) {
//            char tmp = b[low];
//            b[low] = b[high];
//            b[high] = tmp;
//             reverse(b, low + 1, high - 1);
//        }
//       
    }

    public static void main(String[] args) {
        String inputString = "foo(bar)baz(blim)";
        Stack<Integer> st = new Stack<Integer>();
        char[] a = inputString.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == '(') {
                st.add(i);
            } else if (a[i] == ')') {
                reverse(a, st.peek() + 1, i-1);
                st.pop();
            }

        }
        String last = "";
        for (int l = 0; l < a.length; l++) {
            if(a[l]!='(' && a[l]!=')')
            last+=a[l];
        }
        System.out.println(last);
    }

}
