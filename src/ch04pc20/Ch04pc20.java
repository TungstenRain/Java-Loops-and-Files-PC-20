package ch04pc20;
import java.util.Scanner;
/**
 *
 * @author frank.olson
 * date 11/8/2017
 * purpose: to make a square
 */
public class Ch04pc20 {

    public static void main(String[] args) {
        //variables
        int length, i, j;
                
        //create keyboard input
        Scanner keyboard = new Scanner(System.in);
        
        //request input from user
        System.out.print("Please enter a positive integer no greater than 15: ");
        length = keyboard.nextInt();
        
        //create output
        for (i = 0; i < length; i++)
        {
            for (j = 0; j < length; j++)
            {
                System.out.print("X");
            }
            System.out.println();
        }
            
    }
    
}
