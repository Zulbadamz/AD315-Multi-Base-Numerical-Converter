import java.util.Scanner;

public class BaseConverter {

    public static int toDecimal(String number, int base) {
        return Integer.parseInt(number, base);
    }

    public static String fromDecimal(int decimal, int base) {
        return Integer.toString(decimal, base).toUpperCase();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String number = scanner.nextLine().toUpperCase();

        System.out.print("Enter the base of the number (2-16): ");
        int fromBase = scanner.nextInt();

        System.out.print("Enter the base to convert to (2-16): ");
        int toBase = scanner.nextInt();

        if (fromBase < 2 || fromBase > 16 || toBase < 2 || toBase > 16) {
            System.out.println("Error: Bases must be between 2 and 16.");
            return;
        }

        try {
            int decimalValue = toDecimal(number, fromBase);
            String converted = fromDecimal(decimalValue, toBase);

            System.out.println("Converted number: " + converted);

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number for the given base.");
        }

        scanner.close();
    }
}
