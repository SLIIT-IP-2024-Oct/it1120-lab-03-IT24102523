import java.util.Scanner;

public class IT24102523LabQ3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Amount : ");
        int amount = input.nextInt();

        int Notes5000 = amount / 5000;
        amount -= Notes5000 * 5000;

        int Notes1000 = amount / 1000;
        amount -= Notes1000 * 1000;

        int Notes500 = amount / 500;
        amount -= Notes500 * 500;

        int Notes200 = amount / 200;
        amount -= Notes200 * 200;

        int Notes100 = amount / 100;
        amount -= Notes100 * 100;

        int Notes50 = amount / 50;
        amount -= Notes50 * 50;

        int Notes20 = amount / 20;
        amount -= Notes20 * 20;

        int Notes10 = amount / 10;
        amount -= Notes10 * 10;

        int Notes5 = amount / 5;
        amount -= Notes5 * 5;

        int Notes2 = amount / 2;
        amount -= Notes2 * 2;

        int Notes1 = amount;

        System.out.println("5000 Notes : " + Notes5000);
        System.out.println("1000 Notes : " + Notes1000);
        System.out.println("500 Notes : " + Notes500);
        System.out.println("200 Notes : " + Notes200);
        System.out.println("100 Notes : " + Notes100);
        System.out.println("50 Notes : " + Notes50);
        System.out.out.println("20 Notes : " + Notes20);
        System.out.println("10 Notes : " + Notes10);
        System.out.println("5 Notes : " + Notes5);
        System.out.println("2 Notes : " + Notes2);
        System.out.println("1 Notes : " + Notes1);
    }
}

