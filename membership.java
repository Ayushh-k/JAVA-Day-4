
import java.util.Scanner;
public class membership {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int income = sc.nextInt();
        boolean pendingDues = sc.nextBoolean();

        System.out.println((age>=18&&income>=30000&&pendingDues==true)?"You are eligible for premium membership.":"You are not eligible for premium membership.");
    }
}
