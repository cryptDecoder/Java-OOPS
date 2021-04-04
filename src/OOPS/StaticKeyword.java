package OOPS;

public class StaticKeyword {
    static int id;
    static String name;

    // first Static block
    static {
        System.out.println("This is first static block");
        id = 45;
        name = "Raj";
        System.out.println(id);
        System.out.println(name);
    }

    // Second static block
    static {
        System.out.println("This is second Static Block");
        id = 55;
        name = "Ramesh";
        System.out.println(id);
        System.out.println(name);
    }

    public static void main(String[] args) {
        System.out.println("This is a Static Keyword example...");
    }
}
