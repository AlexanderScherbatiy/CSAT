package satisfiability.formula;

import org.junit.Assert;
import org.junit.Test;

public class AndTest {


    @Test
    public void test() {

        And and = new And();
        Assert.assertFalse(and.evaluate(false));
        Assert.assertTrue(and.evaluate(true));

        Assert.assertFalse(and.evaluate(false, false));
        Assert.assertFalse(and.evaluate(false, true));
        Assert.assertFalse(and.evaluate(true, false));
        Assert.assertTrue(and.evaluate(true, true));
    }
}
