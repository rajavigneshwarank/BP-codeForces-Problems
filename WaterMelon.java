
import java.util.*;
public class WaterMelon{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        int weight = s.nextInt();
        
        if(weight>2 && weight%2==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}