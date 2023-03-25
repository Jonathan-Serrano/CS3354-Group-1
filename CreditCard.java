import java.util.*;
//test
public class CreditCard {
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a credit card number as a long integer: ");
        long number = input.nextLong();

        System.out.println(number + " is " + (isValid(number) ? "valid" : "invalid"));
    }

    // checks if number is valid by testing all sizes, prefixes,
    // and sum of even and odd places according to algorithm

    public static boolean isValid(long number)
    {
        return (getSize(number) >= 13 && getSize(number) <= 16) && (prefixMatched(number, 4) ||
                prefixMatched(number, 5) || prefixMatched(number, 37) ||
                prefixMatched(number, 6)) && ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0);
    }

    // returns sum of all single digit numbers from even places
    public static int sumOfDoubleEvenPlace(long number)
    {
        int total = 0;
        String value = number + "";
        for (int i = getSize(number) - 2; i >= 0; i -= 2)
        {
            total += getDigit(Integer.parseInt(value.charAt(i) + "") * 2);
        }

        return total;
    }

    // if single digit, returns number. otherwise, sums the two digits and returns
    public static int getDigit(int number)
    {
        if (number < 9)
        {
            return number;
        }
        return (number / 10) + (number % 10);
    }

    // returns sum of all numbers from odd places
    public static int sumOfOddPlace(long number)
    {
        int total = 0;
        String value = number + "";
        for (int i = getSize(number) - 1; i >= 0; i -= 2)
        {
            total += Integer.parseInt(value.charAt(i) + "");
        }
        return total;
    }

    // checks if d is a prefix
    public static boolean prefixMatched(long number, int d)
    {
        return getPrefix(number, getSize(d)) == d;
    }

    // gets number of digits in d
    public static int getSize(long d)
    {
        String value = d + "";
        return (value.length());
    }

    // gets first k digits from number. if # of digits < k, returns number
    public static long getPrefix(long number, int k)
    {
        if (getSize(number) > k)
        {
            String value = number + "";
            return Long.parseLong(value.substring(0, k));
        }
        return number;
    }
}


