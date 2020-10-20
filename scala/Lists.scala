object Lists {
  def main(args: Array[String]) = {
		var datos: List[Punto2D] = List()


		datos = new Punto2D(1.0, 4.0) +: datos
		datos = datos :+ new Punto2D(2.0, 3.0)
		datos = new Punto2D(2.5, 2.5) +: datos
		
		println(datos)

		// Ordenamiento con x ascendente
		datos = datos.sorted
		println(datos)

		// Ordenamiento y ascendente
		datos = datos.sortBy{ _.y }
		println(datos)

		// Ordenamiento por x
		datos = datos.sortWith(ordenZ)
		def ordenZ(a: Punto2D, b: Punto2D): Boolean = {
			if (a.z > b.z) 
				return false
			return true
		}

		println(datos)
  }
}