import java.util.*;
public class Income_tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax = 0;
        if (income <= 500000) {
            System.out.println(tax);
        }
        else if (income >= 500000 && income <= 100000) {
            tax = 20*(income/100);
            System.out.println(tax);
        }
        else
        {
            tax = 30*(income/100);
            System.out.println(tax);
        }
    }
}
