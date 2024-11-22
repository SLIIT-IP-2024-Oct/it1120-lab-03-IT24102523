import java.util.Scanner;

public class IT24102523Lab3Q1B  {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the price of 1kg : ");
        double price = input.nextDouble();
        System.out.println("Enter the number of killograms you wanat");
        double kg = input.nextDouble();


        double total = price * kg;
        double disscount = total * 0.1;
        double totalamount = total - disscount;

        System.out.println("The total amount with 10% is:" + (total - disscount));



    }
}