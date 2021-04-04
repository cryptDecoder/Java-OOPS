package OOPS;


class Teacher {
    String name = "Satish";
    String Subject = "CEH11";

    void does() {
        System.out.println("Teaching CEH11");
    }
}

public class InheritanceExample extends Teacher {
    String city = "Pune";

    public static void main(String[] args) {
        InheritanceExample ie = new InheritanceExample();
        System.out.println(ie.name + "\n" + ie.Subject + "\n" + ie.city);
        ie.does();
    }

}



