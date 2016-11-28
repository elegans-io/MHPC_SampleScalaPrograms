object CallByNeedCallByName_2 extends App {
    def f[A](v: A) : A = {
        println("inside f function: " + v)
        v
    }

    def evaluateif[A](c: Boolean, x: A => A, v: => A) = { //x: => A <-- call by name
      lazy val y = x(v) 
      val z = x(v) 
      if (c) {
        println("y", y, y) // y is evaluated twice 
      } else {
        println("z", z, z) // x is evaluated once
      }
    }

    evaluateif(false, f[String], "first execution")
	println("--------------------------------")
    evaluateif(true, f[String], "second execution")
}
