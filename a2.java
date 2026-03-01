//Creating a interface
interface Vehicle {
    // all are the abstract vehicle
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}

//we use keyword implements to inherit a interface
class Bicycle implements Vehicle {
    int speed;
    int gear;

    //to change gear
    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    //to increase speed
    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    //to decrease speed
    @Override
    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("speed: " + speed + " gear: " + gear);
    }
}

class Car implements Vehicle {
    int speed;
    int gear;

    //to change gear
    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    //to increase speed
    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    //to decrease speed
    @Override
    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("speed: " + speed + " gear: " + gear);
    }
}

class Main1 {
    public static void main(String[] args) {
        // creating an instance of Bicylce
        // doing some operations
        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);

        System.out.println("Bicycle present state: ");
        bicycle.printStates();

        // creating instance of the car.
        Car car = new Car();
        car.changeGear(2);
        car.speedUp(3);
        car.applyBrakes(1);

        System.out.println("Car present state: ");
        bicycle.printStates();
    }
}