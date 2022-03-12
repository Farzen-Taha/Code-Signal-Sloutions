package Intro;

public class buildPalindrom {

    public static boolean Check(String s) {
        int sl = s.length() - 1;
        for (int i = 0; i < s.length() / 2; i++, sl--) {
            if (s.charAt(i) != s.charAt(sl)) {
                return false;
            }
        }
        String finl=s;
        return true;
    }

    public static String Build(String s, int i) {
        System.out.println("S: "+s);
        StringBuilder sb = new StringBuilder(s);
         String r="";
        boolean c=Check(s);
        if (!c) {
            int sl = s.length();
            int j = i;
            sb.insert(sl - j, s.charAt(j));  
            j++;
            s=sb.toString();
            
            Build(s, j);
           
            
        }
        r =s;
        return r;
    }
    

    public static void main(String[] args) {
        String s="abcdc";
        String Result=Build(s,0);
        System.out.println("Result: "+Result);


    }

}
