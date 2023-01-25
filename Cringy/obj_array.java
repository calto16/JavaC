package Cringy;

import java.util.Scanner;

public class obj_array {
    public static void main(String[] args) {
        my_foods food1 = new my_foods("Burger", 2);
        my_foods food2 = new my_foods("Pizza", 1);
        my_foods food3 = new my_foods("juice", 4);
        my_foods[] khana = {food1,food2,food3};
        for(int i = 0; i<3; i++){
            System.out.println(khana[i].name);
        }
        Scanner scn = new Scanner(System.in);
        for(int i = 0; i<3; i++){
            khana[i].name = scn.nextLine();
        }
        scn.close();
        for(int i = 0; i<3; i++){
            System.out.println(khana[i].name);
        }
    }
    
}
