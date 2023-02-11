package lab7;

import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int odd;
        int[] nb = new int[10];
        System.out.println("fill the array ");
        for (int i = 0; i < 10; i++) {
            nb[i] = input.nextInt();
        }
        //check for the odd number 
        for (int i = 0; i < 10; i++) {
            if (nb[i] % 2 != 0) {
                odd = nb[i];
                System.out.println("the first odd  number is : "+ odd);
                break;
            }
        }

    }

}
