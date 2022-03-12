package Intro;

public class bishopAndPawn {

    public static void main(String[] args) {
        //(b,bl),(p,p1)->b-p==b1-p1
        String bishop = "h1";
        String pawn = "h3";
        int b, b1;
        int p, p1;
        b = bishop.charAt(0);
        b1 = Integer.parseInt(String.valueOf(bishop.charAt(1)));
        p = pawn.charAt(0);
        p1 = Integer.parseInt(String.valueOf(pawn.charAt(1)));

        if (Math.abs(b - p) ==Math.abs( b1 - p1) ){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
