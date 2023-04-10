package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        float result = (float) dividend / divider;
        if (divider * result == (float) dividend){
            System.out.println("can be divided completely");
        }else {
            if (Float.isInfinite(result)){
                System.out.println("division by zero");
            }else {
                System.out.println("cannot be divided completely");

            }
        }
    }
}
