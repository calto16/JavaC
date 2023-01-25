package little_OOPS;

public class Main {
    public static void main(String[] args) {
        // inheritance = 	the process where one class acquires,
		//					the attributes and methods of another.
		Car car = new Car();
		car.go();
		Bicycle bike = new Bicycle();
		car.go();
		bike.stop();
        car.speed = 10;
		System.out.println(car.speed);
		System.out.println(bike.pedals);
    }
}
