package satisfiability.formula

import java.lang.RuntimeException

class StandardBooleanFormulaEvaluator : BooleanFormulaEvaluator {
    override fun eval(formula: BooleanFormula, values: Map<String, Boolean>): Boolean =
        when (formula) {
            is True -> true
            is False -> false
            is Variable -> values.bool(formula.name)
            is And -> formula.values.fold(true, { acc, f -> acc && eval(f, values) })
            is Or -> formula.values.fold(false, { acc, f -> acc || eval(f, values) })
            else -> throw RuntimeException("Unknown formula: $formula")
        }
}

private fun Map<String, Boolean>.bool(name: String): Boolean =
    this.getOrElse(name) { throw RuntimeException("varible $name is not defined in map: ${this.keys}") }