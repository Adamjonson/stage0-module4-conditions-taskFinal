package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        int result = (int) ((float) dividend / divider);
        if (divider * result == dividend){
            System.out.println("can be divided completely");
        }else {
            if (result == 0.0){
                System.out.println("division by zero");
            }else {
                System.out.println("cannot be divided completely");

            }
        }
    }
}
