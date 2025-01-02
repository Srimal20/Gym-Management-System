class Animal {
    void move(){
        System.out.println("Animals can move");
    }
}
class Dog extends Animal{
    @Override
    void move() {
        System.out.println("Dog can walk and run.");
    }
}
class Test1{
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal d = new Dog();
        a.move();
        d.move();
    }
}

