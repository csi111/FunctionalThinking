package functionalthinking.chapter3

class Employee constructor(val name: String,
                           val salary: Int)

val paidMore: (Employee, Int) -> Boolean = { e, amount -> e.salary > amount }
val isHighPaid = { e: Employee -> paidMore(e, 100000) }
