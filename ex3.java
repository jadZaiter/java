
package lab7;

import java.util.Scanner;

public class ex3 {


    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int [] nb=new int [10];
        System.out.println("fill the array : ");
        for(int i=0 ;    i<nb.length ;    i++){
            nb[i]=input.nextInt();
            
        }
        System.out.println("in reverse order :");
        for(int i=9;i>=0;i--){
            System.out.println(nb[i]);
        }
        
        
        
        
    }
    
}
