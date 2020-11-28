import java.time.LocalDate;

public class Main {


    public  void createAndInit(){
        int a = 1;
        long b = 1l;
        short c = 1;
        double d  = 1;
        char e = 'c';
        String f = "s";
        byte g = 1;
        float h = 1;
        boolean isSomeThing = false;
    }

    /**
     * @return result of equation a * (b + c / d), where a,b,c,d double numbers
     */
    public double getEquation(double a, double b, double c, double d) {
        return a * (b + c / d);
    }

    /**
     * @param a int
     * @param b int
     * @return true if sum of a and b in the set of [10, 20], false if not in it
     */
    public boolean sum(int a, int b) {
        return (a + b) <= 20 && (a + b) >= 10 ? true : false;
    }

    public void printSign(int number) {
        String sign = number >= 0 ? "positive" : "negative";
        System.out.printf("This is %s number.\n", sign);
    }


    public boolean isNegative(int number) {
        return number < 0 ? true : false;
    }

    public void greeter(String name) {
        String output = String.format("Hello %s", name);
        System.out.print(output);
    }

    //check leap year by Date Time API
    public boolean isLeapYear(int year) {
        LocalDate someWhen = LocalDate.ofYearDay(year, 1);
        return someWhen.isLeapYear();
    }

    /**
     * @return true if year is leap false if not leap
     */

    public boolean isLeapYearBeforeLocalDate(int year) {
        boolean isLeap = false;
        if (year % 4 == 0) isLeap = true;
        if (year % 100 == 0) isLeap = false;
        if (year % 400 == 0) isLeap = true;
        return isLeap;
    }
}
