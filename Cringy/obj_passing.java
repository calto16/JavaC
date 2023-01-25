package Cringy;

public class obj_passing {
    public static void main(String[] args) {
        my_foods food1 = new my_foods("apple", 10);
        Refrigerator my_ref = new Refrigerator();
        my_ref.add_content(food1);
    }
}

class Refrigerator {
    void add_content(my_foods Food){
        System.out.println(Food.name + " is added to refrigerator...");
    }
}