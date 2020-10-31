case class Point2D(x: Double, y: Double) extends Ordered[Point2D] { 
    def +(ext: Point2D): Point2D =  new Point2D(this.x + ext.x, this.y + ext.y) 

	def -(ext: Point2D): Point2D =  new Point2D(this.x - ext.x, this.y - ext.y)

    def *(esc: Int): Point2D =  new Point2D(this.x * esc, this.y * esc)
    
    def /(esc: Int): Point2D = new Point2D(this.x / 2, this.y / 2)

    def compare(ext: Point2D): Int = {
        if (this.x > ext.x) return 1
        else if (this.x < ext.x) return -1
        else return 0
    } 
}