
fun main() {
    val juan = Persona("juan", 25)
    val juanito = Empleado("juanito", 64, 1200.0, 12.0)
    val juanillo = Gerente("juanillo",25,12000.0,123.0, true)
    println(juan.celebraCumple())
    println(juan.celebraCumple())
    println(juanito.calcularSalario())
    println(juanito.toString())
    println(juanito.trabajar())
    println(juanillo.toString())
    println(juanillo.administrar())
    println(juanillo.trabajar())
    println(juanillo.calcularSalario())
}
