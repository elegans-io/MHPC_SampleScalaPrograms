object CallByNeedCallByName extends App {
    def evaluateif[A](c: Boolean, x: => A) = {
      lazy val y = x
      if (c) {
        (y, y)
      } else {
        (x, x) // evaluated twice
      }
    }

    evaluateif(false, 100)
}