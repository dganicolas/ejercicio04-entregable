import kotlin.math.roundToInt
/**
 * Esta es una clase abierta llamada `Empleado` que hereda de la clase `Persona`.
 *
 * @property nombre El nombre del empleado.
 * @property edad La edad del empleado.
 * @property salarioBase El salario base del empleado.
 * @property porcentajeImpuesto El porcentaje de impuesto que se aplica al salario base del empleado. Por defecto es 10.0.
 */
open class Empleado (nombre:String, edad :Int, var salarioBase: Double
                , var porcentajeImpuesto:Double =10.0): Persona(nombre,edad) {
    /**
     * Este método calcula el salario del empleado después de aplicar el impuesto.
     *
     * @return El salario del empleado después de aplicar el impuesto.
     */
    open fun calcularSalario(): Double {
        return salarioBase - (porcentajeImpuesto * salarioBase / 100)
    }
    /**
     * Este método se llama cuando el empleado está trabajando.
     *
     * @return Una cadena de texto que dice "[nombre del empleado] está trabajando en la empresa."
     */
    fun trabajar() = ("$nombre esta trabajando en la empresa.")
    /**
     * Sobrescribe el método `toString` para devolver una cadena de texto con el nombre, la edad y el salario base del empleado.
     *
     * @return Una cadena de texto que dice "Nombre: [nombre del empleado], Edad: [edad del empleado], Salario: [salario base del empleado]."
     */
    override fun toString(): String {
        return("Nombre: $nombre, Edad: $edad, Salario: ${String.format("%.2f",salarioBase)}")
    }
                }