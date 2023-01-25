package Next_step;

public class threads {
    public static void main(String[] args) throws InterruptedException {
        String[] name = {"Apple","Ball", "Cat","Dog"};
        int j = 0;
        for (String i:name){
            System.out.println(i);
            j++;
            Thread.currentThread().setPriority(10);
            Thread.sleep(1500);
        }
    }
}
