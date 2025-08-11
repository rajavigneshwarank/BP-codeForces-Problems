import java.util.*;
public class WayTooLongWords{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        while (t-- > 0) {
            String str = s.next();

            if (str.length() <= 10) {
                System.out.println(str);
            } else {
                int res = str.length() - 2;
                char ft = str.charAt(0);
                char lt = str.charAt(str.length() - 1);

                System.out.println(ft + String.valueOf(res) + lt);
            }
        }
    }
}
