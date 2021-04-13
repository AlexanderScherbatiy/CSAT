package satisfiability.sample

import satisfiability.formula.*


fun main() {

    val evaluator = StandardBooleanFormulaEvaluator()
    println("true and false = ${evaluator.eval(And(listOf(Variable("x"), False)), mapOf("x" to true))}")
    println("true and true = ${evaluator.eval(And(listOf(Variable("x"), True)), mapOf("x" to true))}")

    val values = listOf(Variable("x1"), Variable("x2"))
    println("false or false = ${evaluator.eval(Or(values), mapOf("x1" to false, "x2" to false))}")
    println("false or true = ${evaluator.eval(Or(values), mapOf("x1" to false, "x2" to true))}")
}
