import java.util.Scanner

object EvenOdd {
  def main(args: Array[String]): Unit = {
    val scan = new Scanner(System.in)
    print("Introduzca un entero: ")
    val number: Int = scan.nextInt()

    var even: Boolean = false
    if (number % 2 == 0) {
      even = true
    }

    even match {
      case true => println("El número es par")
      case false => println("El número es impar")
    }
  }

}
