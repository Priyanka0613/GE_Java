import java.util.Scanner;

public class powerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("Enter n: ");
        int N =sc.nextInt() ; 

        if (N < 0 || N >= 31) {
            System.out.println("N should be in the range 0 <= N < 31");
            return;
        }

        int powerOfTwo = 1;
        for (int i = 0; i <= N; i++) {
            powerOfTwo *= 2;
        }
        System.out.println("Power of two:" + powerOfTwo);
    }
}
