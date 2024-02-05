/**
 * Esta es una clase abierta llamada `Persona`.
 *
 * @property nombre El nombre de la persona.
 * @property edad La edad de la persona.
 */
 open class Persona(val nombre:String, var edad :Int) {
     /**
      * Sobrescribe el método `toString` para devolver una cadena de texto con el nombre y la edad de la persona.
      *
      * @return Una cadena de texto que dice "Nombre: [nombre de la persona], Edad: [edad de la persona]".
      */
    override fun toString(): String {
        return "Nombre: $nombre, Edad: $edad"
    }
     /**
      * Este método se llama cuando la persona celebra su cumpleaños. Incrementa la edad de la persona en uno.
      *
      * @return Una cadena de texto que dice "Feliz cumpleaños [nombre de la persona]! Ahora tienes [edad de la persona] años."
      */
    fun celebraCumple(): String{
        this.edad++
        return "Feliz cumpleaños $nombre! Ahora tienes $edad años."
    }

}