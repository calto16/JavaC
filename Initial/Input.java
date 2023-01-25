import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is Your Name ?: ");
        String name = scanner.nextLine();
        System.out.print("What is Your Age ?: ");
        int age = scanner.nextInt();
        System.out.println(name);
    }
}
