case class Arrendatario(RFC: String, nombre: String, apPaterno: String, apMaterno: String, 
            edad: Int, nContrato: String, antiguedad: String) 
            extends Persona(RFC, nombre, apMaterno, apPaterno, edad) with Bandera {
	
	var bandera: Boolean = false
	
	// implementamos 
	override def estaAtrasado(estado: Boolean): Unit = {
		this.bandera = estado
	}
}