class Car{
    public void start(){
        System.out.println("Car started");
    }
    public void accelerate(){
        System.out.println("Car is accelerating");
    }
    public void changeGear(){
        System.out.println("Gear Changed Manually");
    }
}

class LuxuryCar extends Car{

    public void changeGear(){
        System.out.println("Gear Changed Automatically");
    }
    public void openRoof(){
        System.out.println("Sunroof is opened");
    }
}

public class MethodOverridingExample{
    public static void main(String[] args) {
        //method overriding example

        // Car c = new Car();
        // c.start();
        // c.accelerate();
        // c.changeGear();

        // LuxuryCar lc = new LuxuryCar();
        // lc.start(); //coming from parent class
        // lc.accelerate(); //Car is accelerating, coming from parent class
        // lc.changeGear(); //Gear Changed Automatically  //overrided method
        // lc.openRoof();

        Car c = new LuxuryCar(); //ref of car and obj of Luxury car //means calling a smart tv as old which will work as it will do all things what old tv does, but cant call something wjich is not present
        c.changeGear();  //Luxury car
        //c.openRoof(); //can not call something which is not in Car class
    }
}