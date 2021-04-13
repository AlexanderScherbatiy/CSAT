package satisfiability.formula;

import org.junit.Test;
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class AndTest {

    @Test
    fun test1() {

        val evaluator = StandardBooleanFormulaEvaluator()

        val values = listOf("x")
        assertFalse { evaluator.eval(And(values), mapOf("x" to false)) }
        assertTrue { evaluator.eval(And(values), mapOf("x" to true)) }
    }

    @Test
    fun test2() {

        val evaluator = StandardBooleanFormulaEvaluator()

        val values = listOf("x1", "x2")
        assertFalse { evaluator.eval(And(values), mapOf("x1" to false, "x2" to false)) }
        assertFalse { evaluator.eval(And(values), mapOf("x1" to true, "x2" to false)) }
        assertFalse { evaluator.eval(And(values), mapOf("x1" to false, "x2" to true)) }
        assertTrue { evaluator.eval(And(values), mapOf("x1" to true, "x2" to true)) }
    }
}
