class Gerente(var bonus: Double, var exentoImpuesto:Boolean=false, override var : Double = 33.99):Empleado(porcentajeImpuestos) {
    override fun calcularSalario() {
        if (exentoImpuesto == false) {
            super.calcularSalario() + this.bonus
        } else{
            salarioBase + this.bonus
        }

    }

    override fun toString(): String = "mejorar"
    fun administrar() ="$nombre esta administrando la empresa"
}