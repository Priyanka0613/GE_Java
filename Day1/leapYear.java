import java.util.Scanner;

public class leapYear {
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year (4 digits): ");
        int year = scanner.nextInt();

        if (year >= 1000 && year <= 9999) {
            if (isLeapYear(year)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("Enter a 4-digit year.");
        }
    }
}
