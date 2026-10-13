package Lab01;

import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Height?");
        int height = input.nextInt();
        for (int i = 0; i < height; i++){
            for (int j = height; j >= 0; j--){
                if (j < i) System.out.print('*');
                else System.out.print(' ');
            }
            System.out.print('*');
            for (int j = 0; j < height; j++){
                if (j < i) System.out.print('*');
            }
            System.out.println();
        }
    }
}
