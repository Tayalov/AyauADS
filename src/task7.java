import java.util.Scanner;
public class task7{
    public static void printReverse(int[] arr, int n) { //обратно выводит цифры из массива
        if (n == 0) {
            return;
        }
        //выводят послед элемент
        System.out.print(arr[n - 1] + " ");
        printReverse(arr, n - 1); //повторяем массив
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        printReverse(arr, n);
    }
}

