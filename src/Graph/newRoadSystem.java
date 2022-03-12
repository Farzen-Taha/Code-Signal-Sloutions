package Graph;

public class newRoadSystem {

    public static void main(String[] args) {
//        boolean[][] roadRegister = {{false, true, false, false},
//        {false, false, true, false},
//        {true, false, false, true},
//        {false, false, true, false}
//        };
        boolean[][] roadRegister = {{false, true, false},
        {false, false, false},
        {true, false, false}};
        int ins = 0;
        int outs = 0;
        boolean c = true;
        for (int i = 0; i < roadRegister.length; i++) {
            for (int j = 0; j < roadRegister[i].length; j++) {
                if (roadRegister[i][j]) {
                    outs++;
                }
                if (roadRegister[j][i]) {
                    ins++;
                }
            }
            if (ins != outs) {
//                System.out.println("False");
                c = false;
                break;
            }
            if (!c) {
                break;
            }
        }
        System.out.println("Result: " + c);

    }

}
