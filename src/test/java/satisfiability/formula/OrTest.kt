package satisfiability.formula;

import org.junit.Test;
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class OrTest {

    @Test
    fun test1() {

        val evaluator = StandardBooleanFormulaEvaluator()

        val values = listOf("x")
        assertFalse { evaluator.eval(Or(values), mapOf("x" to false)) }
        assertTrue { evaluator.eval(Or(values), mapOf("x" to true)) }
    }

    @Test
    fun test2() {

        val evaluator = StandardBooleanFormulaEvaluator()

        val values = listOf("x1", "x2")
        assertFalse { evaluator.eval(Or(values), mapOf("x1" to false, "x2" to false)) }
        assertTrue { evaluator.eval(Or(values), mapOf("x1" to true, "x2" to false)) }
        assertTrue { evaluator.eval(Or(values), mapOf("x1" to false, "x2" to true)) }
        assertTrue { evaluator.eval(Or(values), mapOf("x1" to true, "x2" to true)) }
    }
}
