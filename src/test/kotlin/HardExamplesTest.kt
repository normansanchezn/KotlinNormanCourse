import dev.normansanchez.hardExamples
import java.awt.print.Book
import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

data class Book(
    val name: String,
    val author: String,
    val publisher: String,
    val pages: Int,
    val year: Int
)

data class Planet(
    val name: String,
    val diameter: Double,
    val position: Int
)

class HardExamplesTest {

    @Test
    fun `cuando se generan libros y planetas se deben retornar con datos correctos`() {
        val (booksList, planetsList) = hardExamples<Book, Planet>()

        // Validamos libros
        val expectedBooks = listOf(
            Book("Harry Potter y la Piedra Filosofal", "J.K. Rowling", "Salamanca", 314, 2001),
            Book("El Principito", "Antoine de Saint-Exupéry", "Reynal & Hitchcock", 96, 1943)
        )
        assertEquals(expectedBooks, booksList)

        // Validamos planetas
        val expectedPlanets = listOf(
            Planet("Tierra", 12742.0, 3),
            Planet("Marte", 6779.0, 4)
        )
        assertEquals(expectedPlanets, planetsList)
    }
}