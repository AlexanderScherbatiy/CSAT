package satisfiability.formula;

public class And implements BooleanFormula {

    @Override
    public boolean evaluate(boolean... values) {
        boolean result = true;
        for (boolean value : values) {
            result &= value;
        }
        return result;
    }
}
