 open class Persona(val nombre:String, var edad :Int) {
    override fun toString(): String {
        return ("Nombre: $nombre, Edad: $edad")
    }
    fun celebraCumple(){
        this.edad++
        println("Feliz cumpleaños $nombre! Ahora tienes $edad años.")
    }

}