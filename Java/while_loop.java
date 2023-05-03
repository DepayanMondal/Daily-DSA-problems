import java.util.*;
public class while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int counter = 1;
        while(counter <= range) {
            System.out.print(counter+" ");
            counter++;
        }
        System.out.println("printed 1 to 10");
    }
}
