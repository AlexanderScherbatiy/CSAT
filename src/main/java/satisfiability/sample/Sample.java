package satisfiability.sample;

import satisfiability.formula.And;

public class Sample {
    public static void main(String[] args) {
        And and = new And();
        System.out.printf("true and false = %b%n", and.evaluate(true, false));
        System.out.printf("true and true = %b%n", and.evaluate(true, true));
    }
}
