import java.math.*;
import java.util.*;

public class Math_Library {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Input side 1: ");
        int side_a = scn.nextInt();
        System.out.print("Input side 2: ");
        int side_b = scn.nextInt();
        System.out.print("The Hypo Of triangle is: ");
        double side_c = Math.sqrt((side_a*side_a) + (side_b*side_b));
        System.out.println(Math.min(side_a, side_c));
    }
}
