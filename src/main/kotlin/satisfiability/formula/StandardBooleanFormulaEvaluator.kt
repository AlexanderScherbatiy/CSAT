package satisfiability.formula

import java.lang.RuntimeException

class StandardBooleanFormulaEvaluator : BooleanFormulaEvaluator {
    override fun eval(formula: BooleanFormula, values: Map<String, Boolean>): Boolean =
        when (formula) {
            is And -> formula.values.fold(true, { acc, name -> acc && values.bool(name) })
            is Or -> formula.values.fold(false, { acc, name -> acc || values.bool(name) })
            else -> throw RuntimeException("Unknown formula: $formula")
        }
}

private fun Map<String, Boolean>.bool(name: String): Boolean =
    this.getOrElse(name) { throw RuntimeException("varible $name is not defined in map: ${this.keys}") }