// if we run as " java main_arguments 1,2,3 ?

public class Argument {
    public static void main(String[] args) {
        String[][] argument1 = new String[2][2];
        int x;
        argument1[0] = args;
        x = argument1[0].length;
        for(int y = 0; y<x; y++){
            System.out.println("" + argument1[0][y]);
        }
    }
}
