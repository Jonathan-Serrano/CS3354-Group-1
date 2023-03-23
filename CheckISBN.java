import java.util.*;

public class CheckISBN {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //takes input ISBN
        System.out.println("Enter the first 9 digits of an ISBN as integer: ");
        int isbn = input.nextInt();

        int divide = 10;

        //int intValue = Integer.parseInt(intString);

        // assigns each number to its correct d_ value
        int d9 = isbn % divide;
        isbn = isbn / divide;

        int d8 = isbn % divide;
        isbn = isbn / divide;

        int d7 = isbn % divide;
        isbn = isbn / divide;

        int d6 = isbn % divide;
        isbn = isbn / divide;

        int d5 = isbn % divide;
        isbn = isbn / divide;

        int d4 = isbn % divide;
        isbn = isbn / divide;

        int d3 = isbn % divide;
        isbn = isbn / divide;

        int d2 = isbn % divide;
        isbn = isbn / divide;

        int d1 = isbn % divide;
        isbn = isbn / divide;


        // calculate check sum value
        int sum = d1 * 1 + d2 * 2 + d3 *3 + d4 * 4 + d5 * 5 + d6 *6 + d7 * 7 + d8 * 8 + d9 * 9;
        int checkSum = sum % 11;

        System.out.print("The ISBN-10 number is ");

        System.out.print(d1);
        System.out.print(d2);
        System.out.print(d3);
        System.out.print(d4);
        System.out.print(d5);
        System.out.print(d6);
        System.out.print(d7);
        System.out.print(d8);
        System.out.print(d9);


        // prints last digit depending on what it is
        if (checkSum == 10)
        {
            System.out.print("X");
        }
        else
        {
            System.out.print(checkSum);
        }


    }

}
