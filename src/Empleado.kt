import kotlin.math.roundToInt

open class Empleado (nombre:String, edad :Int, var salarioBase: Double
                , var porcentajeImpuesto:Double =10.0): Persona(nombre,edad) {
                    init{
                        //require (this.porcentajeImpuesto !is Int ||  this.porcentajeImpuesto !is Double){"error"}

                        }

    open fun calcularSalario(): Double {
        return salarioBase - (porcentajeImpuesto * salarioBase)
    }
    fun trabajar() = ("$nombre esta trabajando en la empresa.")

    override fun toString(): String {
        return("Nombre: $nombre, Edad: $edad, Salario: ${String.format("%.2f",salarioBase)}")
    }



                    }



