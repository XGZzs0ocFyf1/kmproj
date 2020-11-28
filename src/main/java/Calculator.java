public class Calculator {


    public double getEquation(double a, double b, double c, double d) {
        return a * (b + c / d);
    }

    public boolean sum(int a, int b) {
        return (a + b) <= 20 && (a + b) >= 10 ? true : false;
    }
}
