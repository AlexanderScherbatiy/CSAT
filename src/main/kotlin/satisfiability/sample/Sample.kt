package satisfiability.sample

import satisfiability.formula.And
import satisfiability.formula.StandardBooleanFormulaEvaluator


fun main() {

    val evaluator = StandardBooleanFormulaEvaluator()
    println("true and false = ${evaluator.eval(And(listOf("x1", "x2")), mapOf("x1" to true, "x2" to false))}")
    println("true and true = ${evaluator.eval(And(listOf("x1", "x2")), mapOf("x1" to true, "x2" to true))}")
}
