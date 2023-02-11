
package lab7;
import java.util.Scanner;

public class Lab7 {

   
    public static void main(String[] args) {
     Scanner input =new Scanner (System.in);
     int sum=0;
     //declare array of size 3 and of type integer and to save the nubers 
     int [] nb=new int [3];
     //loop to fill the array by a number from user and put the sum in variable sum
     for(int i=0;i<3;i++){
         nb[i]=input.nextInt();
         sum+=nb[i];
     }
        System.out.println("sum: " + sum);
      
    }
 
    
}
