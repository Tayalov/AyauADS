//ex learn video
import java.util.Scanner;
public class Main{
    public static void printNumber(int n){
        if(n == 0) return;
        System.out.println(n);
        printNumber(n-1);
        System.out.println("BYe"+ n);
    }
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNumber(n);
    }
}

