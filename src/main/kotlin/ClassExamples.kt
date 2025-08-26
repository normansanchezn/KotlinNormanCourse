package dev.normansanchez

import java.lang.Math.random

fun main() {
    /**
     Ejercicios de ciclos
     Precondiciones:
     1. Las listas deben tener 5 elementos.
     2. Debes imprimir una frase concatenada por cada elemento.
     3. Debes correr los test de este archivo para que puedas validar que tus resultados son correctos. **/
}

fun <C, N> printColorsAndNames(colors: List<C>, names: List<N>): List<String> {
     /**
      * Ejercicio 1: Crea una lista de colores e imprime esos colores
      * Ejercicio 2: Crea una lista de nombres e imprime los nombres
      *
      * Ejemplo del resultado:
      * - El color es azul.
      * - El nombre es Adrian.
      */

     // después de esta línea crea tu código...











     // hasta aquí llega tu código de las dos listas
     return emptyList()
}

fun <P, B> mediumExamples(): Pair<List<P>, List<B>> {
     /**
      * Intermedio
      * Ejercicio 1: Crea una lista de precios e imprime su identificador y su valor.
      * Ejercicio 2: Crea una lista de libros e imprime su identificador y su valor.
      * Para obtener el identificador usa la función que ya está en esta clase llamada "getRandomId()" ya existe, solo debes usarla.
      *
      * Ejemplo del resultado:
      * - El artículo 4 tiene un precio de $4.56.
      * - El libro Harry Potter tiene un id en la librería de #84.
      */

     // después de esta línea crea tu código...











     // hasta aquí llega tu código de las dos listas


     @Suppress("UNCHECKED_CAST")
     return Pair(emptyList<P>(), emptyList<B>())
}

fun <B, P> hardExamples(): Pair<List<B>, List<P>> {
     /**
      * Difícil
      * Ejercicio 1: Crea una lista de Libros (objeto) para que imprimas su nombre, autor, editorial, cantidad de páginas y año de publicación.
      * Ejercicio 2: Crea una lista de Planetas (objeto) para que imprimas su nombre, diámetro y su identificador en el sistema solar.
      *
      * NOTA: Para estos ejercicios debes crear sus objetos!!!!!!!
      *
      * Ejemplo del resultado:
      * - El libro Harry Potter y la Piedra Filosofal fue escrito por J.K. Rowling distribuido por la editorial Salamanca tiene 314 páginas publicado en 2001.
      * - El planeta Tierra es el 3er planeta del sistema solar.
      */

     // después de esta línea crea tu código...










     // hasta aquí llega tu código de las dos listas
     @Suppress("UNCHECKED_CAST")
     return Pair(emptyList<B>(), emptyList<P>())
}


// UTILIDAD
fun getRandomId(): Int = (random() *  100).toInt()