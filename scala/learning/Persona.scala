abstract class Persona(RFC: String, nombre: String, apPaterno: String, apMaterno: String, edad: Int) {
  // muestra el RFC y la Edad
  def mostrar = {
    printf("RFC: %s. Edad: %d", this.RFC, this.edad)
  }
}