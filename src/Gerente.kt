class Gerente(nombre : String,edad:Int, salarioBase: Double, var bonus: Double, var exentoImpuesto:Boolean=false,porcentajeImpuesto: Double= 33.99):Empleado(nombre, edad, salarioBase,porcentajeImpuesto) {
    override fun calcularSalario(): Double {
        if (this.exentoImpuesto == false) {
            return super.calcularSalario() + this.bonus
        } else{
           return salarioBase + this.bonus
        }

    }

    override fun toString(): String = "Nombre : $nombre, Edad:$edad, Salario: ${String.format("%.2f",calcularSalario())}, excentoImpuesto: $exentoImpuesto "
    fun administrar() ="$nombre esta administrando la empresa"
}