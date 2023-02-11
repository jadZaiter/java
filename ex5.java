package lab7;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int even;
        int[] nb = new int[10];
        System.out.println("fill the array ");
        for (int i = 0; i < 10; i++) {
            nb[i] = input.nextInt();
        }
        //check for the even number 
        for (int i = 0; i < 10; i++) {
            if (nb[i] % 2 == 0) {
                even= nb[i];
                System.out.println("the first even  number is : "+ even);
                break;
            }
        }
    }
    
}
