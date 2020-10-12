case class Dueno(RFC: String, nombre: String, apPaterno: String, apMaterno: String, 
            edad: Int, direccion: String, telefono: String) 
            extends Persona(RFC, nombre, apMaterno, apPaterno, edad) {
}