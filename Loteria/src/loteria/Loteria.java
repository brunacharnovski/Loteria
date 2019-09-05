/*
@Bruna Charnovski
 */
package loteria;

import java.util.Random;
import java.util.Scanner;

public class Loteria {

    public static void main(String[] args) {
        int[] valores = new int[6];
        imprimeVetor(valores);
//        int[] valores2;
//        valores2 = new int [6];
//        valores2 [0] = 0;
//        valores2 [1] = 0;
//        valores2 [2] = 0;
//        valores2 [3] = 0;
//        valores2 [4] = 0;
//        valores2 [5] = 0;
        // para comentar a linha ou varias linhas ctrl + shift + c

        Scanner in = new Scanner(System.in);
        System.out.println("Digite 6 numeros");
        for (int i = 0; i < 6; i++) {
            int num = -1;
            while (num == -1) {
                num = capNum(in, i);
                for (int j = 0; j < i; j++) {
                    if (valores[j] == num) {
                        num = -1;
                    }
                }
            }
            valores[i] = num;
            imprimeVetor(valores); // ctrl + spaco
        }
        Random r = new Random();
        int[] bolas = new int[6];
        
        for (int i = 0; i < 6; i++) {
            int bola = -1;
            do {
                bola = (r.nextInt(60) + 1);
                for (int j = 0; j < i; j++) {
                    if (bolas[j] == bola) {
                        bola = -1;
                        break;
                    }
                }
            } while (bola == -1);

            bolas[i] = bola;
            imprimeVetor(bolas);
        }
    }

    public static int capNum(Scanner in, int i) {
        System.out.println("Digite o " + (i + 1) + "º numero");
        int num = in.nextInt();
        if (num >= 1 && num <= 60) {
            return num;
        } else {
            return -1;
        }
    }

    public static void imprimeVetor(int[] vet) {
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }
        System.out.println("");
    }
}
