package OOPS;

interface printable {
    void print();

    int add(int x, int y);

    void result(String name, float percentage);

    boolean pass_fail(int percentage);
}

public class InterfaceExample implements printable {
    @Override
    public void print() {
        System.out.println("This is interface call!!!!!");
    }

    @Override
    public int add(int x, int y) {
        return x + y;
    }

    @Override
    public void result(String name, float percentage) {

        if (percentage >= 40) {
            System.out.println(name + "pass " + true);
        } else {
            System.out.println(false);
        }
    }

    @Override
    public boolean pass_fail(int percentage) {
        return percentage >= 40;
    }


    public static void main(String[] args) {
        InterfaceExample obj = new InterfaceExample();
        obj.print();
        int c = obj.add(12, 23);
        System.out.println(c);

        obj.result("Raj", 25);
        boolean result = obj.pass_fail(45);
        System.out.println(result);


    }
}
