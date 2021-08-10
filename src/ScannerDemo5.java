import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class ScannerDemo5 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a big integer: ");

            BigInteger value1 = input.nextBigInteger();
            System.out.println("Using nextBigInteger(): " + value1);

            System.out.print("Enter a big decimal: ");

            BigDecimal value2 = input.nextBigDecimal();
            System.out.println("Using nextBigDecimal(): " + value2);

            input.close();
        }
}
