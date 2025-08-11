import java.util.*;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] parts = sc.next().split("\\+");
        Arrays.sort(parts);
        System.out.println(String.join("+", parts));
    }
}
