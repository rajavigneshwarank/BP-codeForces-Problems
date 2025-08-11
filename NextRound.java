import java.util.*;

public class NextRound {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt(); 
        int k = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt(); 
        }

        int cutoffScore = arr[k - 1]; 
        int ct = 0;

        for (int score : arr) {
            if (score >= cutoffScore && score > 0) {
                ct++;
            }
        }

        System.out.println(ct);
        
    }
}
