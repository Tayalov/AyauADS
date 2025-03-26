import java.util.Scanner;
public class task2 {
    public static double findSum(int[] arr, int n) {
        if (n == 0) {
            return arr[0];
        }
        return arr[n] + findSum(arr, n - 1);
    }
    public static double findAverage(int[] arr, int n) {
        double sum = findSum(arr, n - 1);
        return sum / n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findAverage(arr, n)); //возвращает их среднее значение
    }
}


