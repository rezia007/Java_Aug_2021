import java.util.Scanner;

public class ScannerDemo3{
    public static void main(String[] args) {

        // creates a Scanner object
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");

        // reads an int value
        int data1 = input.nextInt();

        System.out.println("Using nextInt(): " + data1);

        input.close();
    }

}
