object Main {
    def main(args: Array[String]) = {
				val cristofer = new Arrendatario("12", "Cr", "Car", "Na", 22, "1", "10")
				println(cristofer.bandera)
				cristofer.estaAtrasado(true)
				println(cristofer.bandera)
    }
}