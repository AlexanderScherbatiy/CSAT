package satisfiability.formula

interface BooleanFormula

interface BooleanFormulaEvaluator {
    fun eval(formula: BooleanFormula, values: Map<String, Boolean> = mapOf()): Boolean
}

object True : BooleanFormula

object False : BooleanFormula

data class And(val values: List<BooleanFormula>) : BooleanFormula

data class Or(val values: List<BooleanFormula>) : BooleanFormula

data class Variable(val name: String) : BooleanFormula
