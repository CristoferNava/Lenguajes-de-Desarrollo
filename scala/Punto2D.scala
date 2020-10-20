case class Punto2D(x: Double, y: Double) extends Ordered[Punto2D] {
    val z: Double = x * y
    
    def compare(ext: Punto2D): Int = {
        if (this.x > ext.x) return 1
        else if (this.x < ext.x) return -1
        else return 0
    } 
}