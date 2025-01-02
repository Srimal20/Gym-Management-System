public class Human {
    void naming(){
        String g = "Ishara";
        String p = "Srimal";
        System.out.println(g + " " + p);
    }
}
class Student extends Human{
    @Override
    void naming() {
        super.naming();
        System.out.println("Students!");
    }
}
class Test2{
    public static void main(String[] args) {
        Human h = new Student();
        h.naming();
    }
}
