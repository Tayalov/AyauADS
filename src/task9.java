import java.util.Scanner;
public class task9 {
    public static int bnCoefficient(int n, int k) {// binomial coefficient
        if (k == 0 || k == n) {
            return 1;
        }
        return bnCoefficient(n - 1, k - 1) + bnCoefficient(n - 1, k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(bnCoefficient(n, k));
    }
}
