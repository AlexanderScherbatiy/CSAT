package satisfiability.formula;

import org.junit.Assert;
import org.junit.Test;

public class OrTest {


    @Test
    public void test() {

        Or or = new Or();
        Assert.assertFalse(or.evaluate(false));
        Assert.assertTrue(or.evaluate(true));

        Assert.assertFalse(or.evaluate(false, false));
        Assert.assertTrue(or.evaluate(false, true));
        Assert.assertTrue(or.evaluate(true, false));
        Assert.assertTrue(or.evaluate(true, true));
    }
}
