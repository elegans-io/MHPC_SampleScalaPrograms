object LazyEvaluation_2 extends App {
    val stream = Stream.from(0) // or (1 to 100000000).toStream
    val filtered_stream = stream.withFilter(_ % 2 == 0)
    val pow2 = filtered_stream.map(x => math.pow(x,2))
    println(pow2(0)) // get the first number
    println(pow2(1)) // get the second number
    println(pow2(2)) // get the third number
    println(pow2(3)) // get the fourth number
    println(pow2.take(5).toList) // take the first 5 elements
}
