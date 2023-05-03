import java.util.*;
public class Largest_of_three_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of 'a':");
        int a = sc.nextInt();
        System.out.print("Enter the value of 'b':");
        int b = sc.nextInt();
        System.out.print("Enter the value of 'c':");
        int c = sc.nextInt();
        if ((a >= b) && (a >= c)) {
            System.out.println(a+" is grater than "+b+" & "+c);
        }
        else if (b >= c) {
            System.out.println(b+" is grater than "+a+" & "+c);
        }
        else {
            System.out.println(c+" is grater than "+b+" & "+a);
        }
    }
}
