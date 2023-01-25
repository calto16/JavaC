import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        String[] phones = new String[10];
        System.out.print("How many phones do you want? : ");  
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 0; i<n; i++){
            System.out.print("Enter Name of Phone "+i+" : ");
            phones[i] = scn.nextLine();
        }
        for(int i = 0; i<n; i++){
            System.out.println(phones[i]);
        }
    }
}
