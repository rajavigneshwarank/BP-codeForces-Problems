import java.util.*;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();
        long m = sc.nextLong(); 
        long a = sc.nextLong(); 

        long tilesAlongLength = (n + a - 1) / a;
        long tilesAlongWidth = (m + a - 1) / a;

        long totalTiles = tilesAlongLength * tilesAlongWidth;

        System.out.println(totalTiles);
    }
}
