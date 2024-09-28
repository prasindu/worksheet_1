import java.util.Scanner;

public class CentimeterToFeetInches {
    public static void main(String[] args) {
        final double CM_TO_INCH = 2.54;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value in centimeters: ");
        double cm = scanner.nextDouble();

        double totalInches = cm / CM_TO_INCH;
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        System.out.printf("%d feet and %.2f inches\n", feet, inches);
        scanner.close();
    }
}
