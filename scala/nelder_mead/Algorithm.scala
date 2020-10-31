object Algorithm {
    def nelderMead(): Unit = {
        val v1 = new Point2D(0, 0)        
        val v2 = new Point2D(1.2, 0)
        val v3 = new Point2D(0, 0.8)

        def orden(p1: Point2D, p2: Point2D): Boolean = {
            if (p1.z > p2.z)
                return false
            return true
        }
        val test: List[Point2D] = List(v1, v2, v3).sortWith(orden)
        println(test)
    }
}