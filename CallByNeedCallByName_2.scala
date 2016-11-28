object CallByNeedCallByName_2 extends App {
    def f[A](v: A) : A = {
        println("inside f function: " + v)
        v
    }

    def evaluateif[A](c: Boolean, x: A => A, v: => A) = { //x: => A <-- call by name
      lazy val y = x(v) 
      if (c) {
        println("y", y, y) // y is evaluated once
      } else {
        println("x(v)", x(v), x(v)) // x is evaluated twice
      }
    }

    evaluateif(false, f[String], "first execution")
	println("--------------------------------")
    evaluateif(true, f[String], "second execution")
}
