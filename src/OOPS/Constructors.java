package OOPS;

public class Constructors {
    private int empid;
    String name;
    float salary;

    // Simple constructor
    Constructors() {
        this.name = "This is Constructor";
    }

    // constructor by parameter
    Constructors(int id, String name, float salary) {
        this.empid = id;
        this.name = name;
        this.salary = salary;
    }


    public static void main(String[] args) {
        Constructors cs = new Constructors();
        System.out.println(cs.name);
        Constructors cs2 = new Constructors(1, "Raj", 23456);
        System.out.println(cs2.empid + "\n" + cs2.name + "\n" + cs2.salary + "\n");
    }


}
