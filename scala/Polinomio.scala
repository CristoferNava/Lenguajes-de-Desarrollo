import java.util.Scanner

object Polinomio {
  def main(args: Array[String]): Unit = {
    val scan = new Scanner(System.in)
    println("Ingrese el valor de x: ")
    val x = scan.nextFloat()

    val result: Float = 2 + (5 * x) - (x * x)
    println(result)
  }
}
