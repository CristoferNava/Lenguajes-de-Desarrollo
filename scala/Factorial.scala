import java.util.Scanner

object Factorial {
  def main(args: Array[String]): Unit = {
    val scan = new Scanner(System.in)
    print("Introduce un entero para calcular el factorial: ")
    val x: Int = scan.nextInt()

    var factorial: Int = 1
    for (i <- 1 to x) {
      factorial = factorial * i
    }

    println(factorial)
  }
}
