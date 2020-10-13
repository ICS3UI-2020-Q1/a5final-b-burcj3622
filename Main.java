import java.util.Scanner;
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner input = new Scanner(System.in);
   
   // asks user for input
   System.out.println("Please enter the maximum number to sum to:");
  //user input here
    int num = input.nextInt();
  //variable sum 
    int sum = 0;
   //loop to find all of the odd numbers 
    for (int number = 1; number<= num; number = number + 2){
    System.out.println();
  // takes all of the odd numbers and finds the sum
    sum = sum + number;
    }
  // prints to screen the sum of odd numbers
  System.out.println("The sum of the odd numbers is " + sum);
  
  }
}

