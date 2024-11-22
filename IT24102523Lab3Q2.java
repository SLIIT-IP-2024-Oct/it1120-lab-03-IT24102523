import java.util.Scanner;


public class IT24102523Lab3Q2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the monthly salary!");
        double salary  = input.nextDouble();
        System.out.println("Enter the number of OT hours");
        double OThours = input.nextDouble();
        System.out.println("Enter the OT hourly rate");
        double OThorlyrate = input.nextDouble();


        double totalOT =OThours * OThorlyrate;
        double totalSalary = salary + totalOT;
        System.out.println("Total salary inculding OT is " + totalSalary);

    }
}