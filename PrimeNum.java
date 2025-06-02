import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        if (PrimeNumber()) {
            System.out.println("Number is Prime");
        } else {
            System.out.println("Number is not Prime");
        }
    }

    public static boolean PrimeNumber() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
