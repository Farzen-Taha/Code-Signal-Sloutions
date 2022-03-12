package Intro;

import java.util.ArrayList;

/*
int differentSymbolsNaive(String s) {
    HashSet h = new HashSet();
    for (char c : s.toCharArray()) {h.add(c);}
    return h.size();}
*/
//return (int) s.chars().distinct().count();
public class differentSymbolsNaive {
    public static void main(String[] args) {
        String s="bcccddff";
        ArrayList al=new ArrayList();
        for(char c:s.toCharArray()){
            if(!al.contains(c))
                al.add(c);
            
        }
        System.out.println(al.size());
    }
    
}
