public class Test {

    private int number = 42;
    private String text = "Hello";
    private double value = 3.14;

    {
        number = 43;
        text = "Hello1";
        value = 3.15;
    }

    public int getNumber() {
        return number;
    }

    public String getText() {
        return text;
    }

    public double getValue() {
        return value;
    }

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.getNumber());
    }

}