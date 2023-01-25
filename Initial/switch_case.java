import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        System.out.print("Enter a day of week: ");
        Scanner scn = new Scanner(System.in);
        String day = scn.nextLine();
        switch(day){
            case "sunday":System.out.println("Its your lucky day");
            break;
            case "monday":System.out.println("No wayyy day");
            break;
            case "tuesday":System.out.println("works fine day");
            break;
            case "wednesday":System.out.println("Hanging in between day");
            break;
            case "thursday":System.out.println("boring day");
            break;
            case "friday":System.out.println("Slow day");
            break;
            case "saturday":System.out.println("The day u would never forget");
            break;
            default: System.out.println("Its Not a correct day");
        }
    }
}
