import java.util.Scanner;
public class task8 {
    public static String checkDigits(String s) { //состоит ли строка только из цифр проверяет
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return "No";
            }
        }
        return "Yes";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(checkDigits(s));
    }
}
