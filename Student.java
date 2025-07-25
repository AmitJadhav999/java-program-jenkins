public class Student {
    private int id;
    private String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;

        System.out.println("Creating Student Object" + id);
        System.out.println("Creating Student Object" + name);

    }

    void sayHello() {
        System.out.println("I am Amit Jadhav");

    }

}
