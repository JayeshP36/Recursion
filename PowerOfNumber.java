package Recursion;
import java.util.Scanner;

public class PowerOfNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base number: ");
        int x = sc.nextInt();
        System.out.println("Enter the Power: ");
        int y = sc.nextInt();
        System.out.printf("%d ^ %d = %d",x, y, power(x,y));
        sc.close();
    }
    public static int power(int x,int y){
        if (y > 0) {
            return x*power(x,y-1);
        }
        return 1;
    }
}
