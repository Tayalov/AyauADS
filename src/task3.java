import java.util.Scanner;
public class task3 {
    public static boolean isPrime(int n, int i) {//for checking whether“n” is prime.

        if (n <= 1) {
            return false;
        }
        if (i * i > n) {
            return true;
        }
        if (n % i == 0) {
            return false;
        }
        return isPrime(n, i + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isPrime(n, 2)) {
            System.out.println("Prime"); //two distinct factors, it is a prime number.
        } else {
            System.out.println("Composite");// more than two
        }
    }
}
