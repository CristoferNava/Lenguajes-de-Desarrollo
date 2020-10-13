object Functions {
 def main(args: Array[String]) = {
   // inline functions
   val inlineSum = (a: Int, b: Int) => a + b

   // función currificada
    val res = cSum(2)_ // función incomplenta (parcialmente definida), 
    println(res(3))
    // espera a que se complete su lista de parámetros
    println(inlineSum(2, 4))

    // funciones como parámetros
    aplica(5, 6, inlineSum)
 } 
 
 // función currificada

 def cSum(a: Int)(b: Int): Int = {
   return a + b
 }

 // función que recibe otra función
 def aplica(a: Int, b: Int, myFunc: (Int, Int) => Int) = {
   println(myFunc(a, b))
 }
}