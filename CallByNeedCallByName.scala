object CallByNeedCallByName extends App {
    def evaluateif[A](c: Boolean, x: => A) = {
      lazy val y = x // memoization
      val ret = if (c) {
        (y, y)
      } else {
        (x, x) // evaluated twice
      }
	  ret
    }

    val v0 = evaluateif(false, {println("evaluate0") ; 100})
	println(v0)
	println("--------------------")
	val v1 = evaluateif(true, {println("evaluate1") ; 100})
    println(v1)
}
