// evaluar la clase Punto3D aplicando la función F(Punto3D) = x^2 + y^2 + z^2 
// usando el operador yield

object YieldArreglo {
    def main(args: Array[String]) = {
        // creamos la lista con varios objetos de la clase Punto3D
        val p1 = new Punto3D(1.0, 2.0, 3.0)
        val p2 = new Punto3D(2.0, 1.0, 1.0)        
        val p3 = new Punto3D(3.0, 3.0, 1.0)
        val p4 = new Punto3D(4.0, 1.0, 7.0)

        val puntos: List[Punto3D] = List(p1, p2, p3, p4)

        val f = for (punto <- puntos) 
                yield ((punto.x * punto.x) + (punto.y * punto.y) + (punto.z * punto.z))
        
        f.foreach {
            println
        }
    }
}