package exceptionhandling;

public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something Went Wrong.");
        } finally {
            System.out.println("The 'try catch' is ended.");
        }
    }

}
