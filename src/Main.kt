
fun main() {

    var juan = Persona("juan", 25)
    var juanito = Empleado("juanitoooo", 64, 1200, 34)
    var juanillo = Gerente(23.0, false)
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
