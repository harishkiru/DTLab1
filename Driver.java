package Lab1;

public class Driver {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        double x,y;

        x = 10;
        y = 2;

        System.out.printf("%.2f + %.2f = %.2f%n", x, y, calculator.add(x, y));
        System.out.printf("%.2f x %.2f = %.2f%n", x, y, calculator.multiply(x, y));

    }
}
