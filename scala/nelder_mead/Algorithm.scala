import scala.math.sqrt
import scala.math.pow

object Algorithm {
    def nelderMead(): Unit = {
      val v1 = new Point2D(0, 0)        
      val v2 = new Point2D(1.2, 0)
      val v3 = new Point2D(0, 0.8)
      
      def f(v: Point2D): Double = (v.x*v.x) - (4*v.x) + (v.y*v.y) - (v.y) - (v.x*v.y)
      def sortVs(p1: Point2D, p2: Point2D): Boolean = {
        if (f(p1) > f(p2))
            return false
        return true
      }
      val values: List[Point2D] = List(v1, v2, v3).sortWith(sortVs)
      
      var B: Point2D = values(0) // Best
      var G: Point2D = values(1) // Good
      var W: Point2D = values(2) // Worst
      println(B, G, W)
      while (distance(B, W) > 0.001) {
        val M: Point2D = Midpoint.move(B, G)
        val R: Point2D = Reflection.move(M, W)

        if (f(R) < f(G)) { // case (i)
            // begin case (i)
            if (f(B) < f(R)) 
              W = R // replace W with R
            else {
              // compute E and f(E)
              val E: Point2D = Expansion.move(R, M)
              if (f(E) < f(B)) 
                W = E // replace W with E
              else 
                W = R // replace W with R
            }
        } else { // case (ii)
          // begin case (ii)
          if (f(R) < f(W)) 
            W = R // replace W with R
          // compute C = (W + M) / 2
          val C = Contraction.move(W, M)
          if (f(C) < f(W))
            W = C // replace W with C
          else {
            val S = Shrink.move(B, W) 
            W = S
            G = M
          }
        }
        val values: List[Point2D] = List(B, G, W).sortWith(sortVs)
        B = values(0)
        G = values(1)
        W = values(2)

        println(B, G, W)
      }
  }

  def distance(p1: Point2D, p2: Point2D): Double = sqrt(pow(p2.x-p1.x, 2) + pow(p2.y-p1.y, 2))
}