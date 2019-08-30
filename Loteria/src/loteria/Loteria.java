package loteria;

import java.util.Scanner;

public class Loteria {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite 6 numeros");
        for (int i = 0; i < 6; i++) {
            capNum(in, i);

        }
    }

    public static int capNum(Scanner in, int i) {
        System.out.println("Digite o " + (i+1) + "º numero");
        return 0;
    }
}
