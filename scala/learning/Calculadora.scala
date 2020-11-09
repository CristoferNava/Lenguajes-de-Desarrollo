object Calculadora {
  def main(args: Array[String]) = {
    aplica(2, 3, suma(_)(_))
    aplica(7, 3, resta(_)(_))
    aplica(5, 3, multiplicacion(_)(_))
    aplica(10, 2, division(_)(_))
  }

  // funciones currificadas
  def suma(a: Double)(b: Double): Double = {return a + b}
  def resta(a: Double)(b: Double): Double = {return a - b}
  def multiplicacion(a: Double)(b: Double): Double = {return a * b}
  def division(a: Double)(b: Double): Double = {return a / b}

  // función aplica
  def aplica(a: Double, b: Double, f: (Double, Double) => Double) = {
    println(f(a, b))
  }
}