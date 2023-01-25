import java.util.Random;

public class Random_Num {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt();
        double y = random.nextDouble(20);
        System.out.println(y);
    }
}
