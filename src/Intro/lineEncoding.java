package Intro;

public class lineEncoding {

    public static void main(String[] args) {
        String inputString = "a";
        String c = "";
        String finl = "";
        c += inputString.charAt(0);
        for (int i = 1; i < inputString.length(); i++) {
            if (inputString.charAt(i) == c.charAt(0)) {
                c += inputString.charAt(i);
            } else if (c.length() != 1) {
                finl += c.length();
                finl += c.charAt(0);
                c = "";
                c += inputString.charAt(i);

            } else {
                finl += c.charAt(0);
                c = "";
                c += inputString.charAt(i);
            }
        }
        if (c.length() != 1) {
            finl += c.length();
            finl += c.charAt(0);

        } else {
            finl += c.charAt(0);
        }
        System.out.println("finl: " + finl);
//char a[]=inputString.toCharArray();
//int count=1;
//        for(int i=0;i<a.length-2;i++){
//            if(a[i]==a[i+1]){
//                c+=a[i];
//                System.out.println("c: "+c);
//                count++;
//                
//            } else{
//                finl+=count;
//                finl+=c.charAt(i);
//                count=1;
//                c="";
//                c+=a[i+1];
//            }
//        }
//        System.out.println("finl: "+finl);
    }

}
