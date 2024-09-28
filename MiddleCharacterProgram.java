import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an odd-length word: ");
        String word = scanner.nextLine();

        if (word.length() % 2 == 1) {
            int middleIndex = word.length() / 2;
            System.out.println("The middle character is: " + word.charAt(middleIndex));
        } else {
            System.out.println("Please enter an odd-length word.");
        }

        scanner.close();
    }
}
