package satisfiability.formula;

public interface BooleanFormula {

    boolean evaluate(boolean... values);
}
