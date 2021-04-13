package satisfiability.formula;

import org.junit.Test;
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class OrTest {

    @Test
    fun testConstant() {

        val evaluator = StandardBooleanFormulaEvaluator()

        assertFalse { evaluator.eval(Or(listOf(False))) }
        assertTrue { evaluator.eval(Or(listOf(True))) }
    }

    @Test
    fun test1() {

        val evaluator = StandardBooleanFormulaEvaluator()

        val values = listOf(Variable("x"))
        assertFalse { evaluator.eval(Or(values), mapOf("x" to false)) }
        assertTrue { evaluator.eval(Or(values), mapOf("x" to true)) }
    }

    @Test
    fun test2() {

        val evaluator = StandardBooleanFormulaEvaluator()

        val values = listOf(Variable("x1"), Variable("x2"))
        assertFalse { evaluator.eval(Or(values), mapOf("x1" to false, "x2" to false)) }
        assertTrue { evaluator.eval(Or(values), mapOf("x1" to true, "x2" to false)) }
        assertTrue { evaluator.eval(Or(values), mapOf("x1" to false, "x2" to true)) }
        assertTrue { evaluator.eval(Or(values), mapOf("x1" to true, "x2" to true)) }
    }

    @Test
    fun test2Mixed() {

        val evaluator = StandardBooleanFormulaEvaluator()

        assertFalse { evaluator.eval(Or(listOf(Variable("y1"), False)), mapOf("y1" to false)) }
        assertTrue { evaluator.eval(Or(listOf(Variable("y2"), False)), mapOf("y2" to true)) }
        assertTrue { evaluator.eval(Or(listOf(Variable("y3"), True)), mapOf("y3" to false)) }
        assertTrue { evaluator.eval(Or(listOf(Variable("y4"), True)), mapOf("y4" to true)) }
    }
}
