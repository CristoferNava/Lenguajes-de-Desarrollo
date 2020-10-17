object Yield {
  def main(args: Array[String]) = {
    // creamos varios objetos 3D
    val p1 = new Punto3D(1.0, 2.0, 3.0)
    val p2 = new Punto3D(2.0, 1.0, 1.0)        
    val p3 = new Punto3D(3.0, 3.0, 1.0)
    val p4 = new Punto3D(4.0, 1.0, 7.0)

    // creamos una lista con los objetos
    val puntos: List[Punto3D] = List(p1, p2, p3, p4)

    // construimos una nueva lista haciendo uso de la función solicitada
    // f(Punto3D) = x*x + y*y + z*z
    val f = for (punto <- puntos) 
            yield ((punto.x * punto.x) + (punto.y * punto.y) + (punto.z * punto.z))
    
    // imprimimos la lista f con los nuevos puntos generados
    f.foreach {
      println
    }
  }
}