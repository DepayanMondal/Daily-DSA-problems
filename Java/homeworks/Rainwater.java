package homeworks;

public class Rainwater {
    public static void main(String[] args) {
        int[] obstacles;
        obstacles = new int[]{4,0,3,6};

        int n = obstacles.length;
        int left=0, right=n-1;
        int stored_water=0;
        int maxLeft=0, maxRight=0;

        while(left <= right) {
            if (obstacles[left] <= obstacles[right]) {
                if (obstacles[left] >= maxLeft) maxLeft = obstacles[left];
                else stored_water += maxLeft - obstacles[left];
                left++;
            } else {
                if (obstacles[right] >= maxRight) maxRight = obstacles[right];
                else stored_water += maxRight - obstacles[right];
                right--;
            }
        }
        System.out.println("Total Rainwater stored: " + stored_water);
    }
}
