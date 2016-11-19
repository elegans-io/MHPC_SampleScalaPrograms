object CallByNeedCallByName_2 extends App {
    def f[A](v: A) : A = {
        println("inside f function: " + v)
        v
    }

    def evaluateif[A](c: Boolean, x: => A => A, v: => A) = { //x: => A <-- call by name
      lazy val y = x(v) // memoization
      val z = x(v) // no memoization
      if (c) {
        println(y, y) // y is evaluated only if c is true and only once
      } else {
        println(z, z) // x is evaluated twice
      }
    }

    evaluateif(true, f[String], "first execution")
    evaluateif(false, f[String], "second execution")
}