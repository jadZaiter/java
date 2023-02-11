
package lab7;
import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("enter the length of the array :");
        int [] nb =new int[input.nextInt()];
        System.out.println("fill the array ");
        for(int i=0;i<nb.length;i++){
            nb[i]=input.nextInt(); 
        }
        System.out.println("enter the value of index to see the value ");
        System.out.println(nb[input.nextInt()]);
        
}
    
    



}
