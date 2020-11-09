case class Puntos3D(x: Double, y: Double, z: Double) {
	def +(ext: Puntos3D): Puntos3D =  new Puntos3D(this.x + ext.x, this.y + ext.y, this.z + ext.z) 

	def -(ext: Puntos3D): Puntos3D =  new Puntos3D(this.x - ext.x, this.y - ext.y, this.z - ext.z)

	def *(esc: Int): Puntos3D =  new Puntos3D(this.x * esc, this.y * esc, this.z * esc)
}