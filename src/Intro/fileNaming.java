package Intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

public class fileNaming {

    public static void main(String[] args) {
//        String names[] = {"a(1)", "a(6)", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a"};
    String names[] = {"doc", "doc", "image", "doc(1)", "doc"}; 
    
        ArrayList finl = new ArrayList();
//        ArrayList names2 = new ArrayList(Arrays.asList(names));
        ArrayList visited = new ArrayList();
        Hashtable<String, Integer> ht = new <String, Integer> Hashtable();
        for (int i = 0; i < names.length; i++) {
            String key = names[i];

            if (!ht.containsKey(key)) {
                ht.put(key, 1);
                visited.add(key);
                finl.add(key);
            } else {
                String temp = key;
                int value = ht.get(key);
                temp = temp + "(" + (value) + ")";

                while (ht.containsKey(temp)) {
                    temp = key + "(" + (++value) + ")";
                }
                ht.put(temp, 1);
                ht.put(key, ++value);

                finl.add(temp);
            }
        }

        System.out.println(ht);
        System.out.println(finl);
        System.out.println(visited);

    }
}
//        int count = 0;
//        String temp = "";
//        for (int i = 0; i < names.length; i++) {
//            String c = names[i];
//            if (!ht.containsKey(c)) {
//                System.out.println("c: " + c);
//                ht.put(c, 1);
//                finl.add(c);
//            } else {
////                finl.add(c + "(" + ht.get(c) + ")");
//                temp = c;
//                temp = temp + "(" + ht.get(c) + ")";
//                
//                if (!ht.containsKey(temp)) {
//                    ht.put(temp, 1);
//                } else {
//                    int t = ht.get(c);
//                    temp = c + "(" + (t += 1) + ")";
//                    ht.put(temp, 1);
//                    finl.add(temp);
////                    int t2 = ht.get(temp);
//                    ht.replace(c, t);
//                }
//            }
//        }
//        System.out.println(ht);
//        System.out.println(finl);
//    }
//
//}
//
//////        int c = 0;
//////        for (int i = 0; i < names.length; i++) {
//////            String crnt = names[i];
//////            System.out.println("crnt: " + crnt);
//////            if (!visited.contains(crnt)&&!finl.contains(crnt)) {
//////                visited.add(crnt);
//////                finl.add(crnt);
//////            } else  {
//////                crnt = crnt + "(" + (++c) + ")";
//////                finl.add(crnt);
//////            }
//////
//////        }
//////
//////        for (Object s : finl) {
//////            System.out.println("s: " + s);
//////        }
////
////    
////
////}
