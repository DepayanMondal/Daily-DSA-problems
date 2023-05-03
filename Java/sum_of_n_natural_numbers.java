import java.util.*;
public class sum_of_n_natural_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter range: ");
        int range = sc.nextInt();
        int counter = 1;
        int sum = 0;
        while(counter <= range) {
            sum += counter;
//            System.out.print(counter+" ");
            counter++;
        }
        System.out.println("sum is: " + sum);
    }
}
