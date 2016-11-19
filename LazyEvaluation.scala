object LazyEvaluation extends App {
    println("begin strict")
    val strict_var = { println("TEST0") ; "value" }
    println ("TEST1")
    println (strict_var)
    println("end strict")
    println("--------------------------------")
    println("begin lazy")
    lazy val lazy_var = { println ("TEST0") ; "value" }
    println ("TEST1")
    println (lazy_var) // computation of the value
    println("end lazy")
}
