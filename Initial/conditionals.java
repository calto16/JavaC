import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        int x = scn.nextInt();
        if (x <= 18){
            System.out.println("You are a kid");
        }
        else if (18 < x && x <= 40){
            System.out.println("You are an adult");
        }
        else{
            System.out.println("You are Old MF");
        }
    }
}