package satisfiability.formula;

import org.junit.Test;
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class AndTest {

    @Test
    fun testConstant() {

        val evaluator = StandardBooleanFormulaEvaluator()

        assertFalse { evaluator.eval(And(listOf(False))) }
        assertTrue { evaluator.eval(And(listOf(True))) }
    }

    @Test
    fun test1() {

        val evaluator = StandardBooleanFormulaEvaluator()

        val values = listOf(Variable("x"))
        assertFalse { evaluator.eval(And(values), mapOf("x" to false)) }
        assertTrue { evaluator.eval(And(values), mapOf("x" to true)) }
    }

    @Test
    fun test2() {

        val evaluator = StandardBooleanFormulaEvaluator()

        val values = listOf(Variable("x1"), Variable("x2"))
        assertFalse { evaluator.eval(And(values), mapOf("x1" to false, "x2" to false)) }
        assertFalse { evaluator.eval(And(values), mapOf("x1" to true, "x2" to false)) }
        assertFalse { evaluator.eval(And(values), mapOf("x1" to false, "x2" to true)) }
        assertTrue { evaluator.eval(And(values), mapOf("x1" to true, "x2" to true)) }
    }

    @Test
    fun test2Mixed() {

        val evaluator = StandardBooleanFormulaEvaluator()

        assertFalse { evaluator.eval(And(listOf(Variable("x1"), False)), mapOf("x1" to false)) }
        assertFalse { evaluator.eval(And(listOf(Variable("x2"), False)), mapOf("x2" to true)) }
        assertFalse { evaluator.eval(And(listOf(Variable("x3"), True)), mapOf("x3" to false)) }
        assertTrue { evaluator.eval(And(listOf(Variable("x4"), True)), mapOf("x4" to true)) }
    }
}
