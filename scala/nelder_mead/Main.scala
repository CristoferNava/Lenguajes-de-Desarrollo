object Main {
  def main(args: Array[String]): Unit = {
    // definimos las funciones que vamos a evaluar
    val sphere = (v: Point2D) => (v.x*v.x) + (v.y*v.y)
    val example = (v: Point2D) => (v.x*v.x) - (4*v.x) + (v.y*v.y) - (v.y) - (v.x*v.y)
    val rosenbrock = (v: Point2D) => (1-v.x) + 100*((v.y-(v.x*v.x))*(v.y-(v.x*v.x)))

    // pasamos dichas funciones al algoritmo
    val minSphere: Point2D = Algorithm.nelderMead(sphere)
    val minExample: Point2D = Algorithm.nelderMead(example)
    val minRosenbrock: Point2D = Algorithm.nelderMead(rosenbrock)

    // mínimos encontrados
    println(f"Sphere: $minSphere")
    println(f"Example: $minExample")
    println(f"Rosenbrock: $minRosenbrock")
  } 
}