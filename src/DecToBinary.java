import java.util.Scanner;

public class DecToBinary
{
    public static void main (String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a Decimal number to translate to a Binary Number");
        int userNumber = Integer.parseInt(reader.nextLine());
        decToBinary(userNumber);
    }

    // function to convert decimal to binary
    static void decToBinary(int n)
    {
        // array to store binary number
        int[] binaryNum = new int[1000];

        // counter for binary array
        int i = 0;
        while (n > 0)
        {
            // storing remainder in binary array
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }

        // printing binary array in reverse order
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }
}