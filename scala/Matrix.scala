import java.util.Scanner

object Matrix {
  def main(args: Array[String]): Unit = {
    val scan = new Scanner(System.in)
    print("Número de filas de la matriz cuadrada: ")
    val n: Int = scan.nextInt()

    // capturamos los elementos de la matriz
    var matrix = Array.ofDim[Int](n, n)
    for (i <- 0 until n) {
      for (j <- 0 until n) {
        matrix(i)(j) = scan.nextInt()
      }
    }

    // calculamos la suma de la diagonal
    var sum: Int = 0
    for (i <- 0 until n) {
      sum = sum + matrix(i)(i)
    }

    printf("La suma de la diagonal es: %d", sum)
  }
}
