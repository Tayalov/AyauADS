import java.util.Scanner;

public class task1 {
    public static int findMin(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        int minOfRest = findMin(arr, n - 1);
        if (arr[n - 1] < minOfRest) {
            return arr[n - 1];
        } else {
            return minOfRest;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findMin(arr, n));//возвращает минимум
    }
}

