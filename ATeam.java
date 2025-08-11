import java.util.*;


public class ATeam {
      public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt(); 
        int nop = 0; 

        for (int i = 0; i < n; i++) {
            int p = s.nextInt();
            int v = s.nextInt();
            int t = s.nextInt();

            int sum = p + v + t;

            if (sum >= 2) { 
                nop++;
            }
        }

        System.out.println(nop);
    }
}
