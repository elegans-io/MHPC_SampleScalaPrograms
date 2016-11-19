class Decorator(left: String, right: String) {
  def layout[A](x: A) = left + x.toString() + right
}

object HighOrderFunctions_2 extends App {
  def apply[A](f: A => String, v: A) = f(v)
  val decorator = new Decorator("[", "]")
  println(apply(decorator.layout, 100))
  println(apply(decorator.layout, "100"))  
}