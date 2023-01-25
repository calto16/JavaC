import java.util.*;
import java.lang.Math;
class x{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
                double ans = 0;
                for(int k = 0; k< n; k++){
                    ans = ans + ((Math.pow(2,k)*b));
                    System.out.print((int)ans+a+" ");
                }
                System.out.println();
        }
    }
}