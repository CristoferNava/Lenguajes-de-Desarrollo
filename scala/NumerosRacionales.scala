case class NumerosRacionales(num: Double, denom: Double) {
	require(denom != 0)
	
	def +(ext: NumerosRacionales): NumerosRacionales = {
		val numerador = ((this.num * ext.denom) + (this.denom * ext.num))
		val denominador = this.denom * ext.denom
		return new NumerosRacionales(numerador, denominador)
	}

	def -(ext: NumerosRacionales): NumerosRacionales = {
		val numerador = ((this.num * ext.denom) - (this.denom * ext.num))
		val denominador = this.denom * ext.denom
		return new NumerosRacionales(numerador, denominador)
	}

	def *(ext: NumerosRacionales): NumerosRacionales = {
		val numerador = this.num * ext.num
		val denominador = this.denom * ext.denom
		return new NumerosRacionales(numerador, denominador)
	}

	def /(ext: NumerosRacionales): NumerosRacionales = {
		val numerador = this.num * ext.denom
		val denominador = this.denom * ext.num
		return new NumerosRacionales(numerador, denominador)
	}
}