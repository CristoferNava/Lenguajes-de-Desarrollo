// Print the first 10 elements

object HelloWorld {
  def main(args: Array[String]) = {
    for (j <- 1 to 5) {
      println(j)
    }

    var a: Array[Int] = new Array[Int](5)

    for (i <- a.indices) {
      a(i) = i
    }

    for (i <- a.indices) {
      println(a(i))
    }
  }
}