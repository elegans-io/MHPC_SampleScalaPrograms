object HighOrderFunctions extends App {
    def f(v: Int) : Int = v*2 // defining a function

    // Int => Int is the type of a function from Int to Int
    def apply(f: Int => Int, l: List[Int]) = l.map(f(_)) //declaration of apply function

    val res = apply(f,List(1,2,3,4,5)) // function execution
    println(res)
}
