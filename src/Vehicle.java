class Vehicle{
    void drive(){
        System.out.println("vehicle is driving!");
    }
}
class car extends Vehicle{
    @Override
    void drive() {
        System.out.println("Car is driving safety!");
        super.drive();
    }

    public static void main(String[] args) {
        car c = new car();
        c.drive();
    }
}