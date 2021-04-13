package satisfiability.formula

interface BooleanFormula

interface BooleanFormulaEvaluator {
    fun eval(formula: BooleanFormula, values: Map<String, Boolean>): Boolean
}

data class And(val values: List<String>) : BooleanFormula

data class Or(val values: List<String>) : BooleanFormula
