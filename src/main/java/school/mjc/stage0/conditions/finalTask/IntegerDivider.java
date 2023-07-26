package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        if (divider == 0) {
            System.out.println("Division by zero");
            return;
        }

        int result = dividend / divider;
        if (result * divider == dividend) {
            System.out.println("Can be divided completely");
        } else {
            System.out.println("Cannot be divided completely");
        }
    }
}

