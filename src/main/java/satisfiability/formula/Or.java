package satisfiability.formula;

public class Or implements BooleanFormula {

    @Override
    public boolean evaluate(boolean... values) {
        boolean result = false;
        for (boolean value : values) {
            result |= value;
        }
        return result;
    }
}
