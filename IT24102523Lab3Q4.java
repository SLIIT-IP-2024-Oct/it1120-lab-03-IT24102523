import java.util.Scanner;

public class  IT24102523Lab3Q4{

      public static void main(String[] args) {
           
         Scanner input = new Scanner(System.in); 

         System.out.println("Enter five digit number : ");
         int fivedigit =input.nextInt();


         int digit1 = fivedigit/10000;
         int digit2 = (fivedigit/1000)%10;
         int digit3 = (fivedigit/100)%10;
         int digit4 = (fivedigit/10)%10;
         int digit5 = fivedigit%10;

         System.out.println(digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5);
      }

}