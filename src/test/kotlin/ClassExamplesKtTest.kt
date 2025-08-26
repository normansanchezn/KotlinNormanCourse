
import dev.normansanchez.printColorsAndNames
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test


class PrintColorsAndNamesTest {

    @Test
    fun `cuando se reciben listas de colores y nombres, se debe retornar el formato correcto`() {
        val colors = listOf("azul", "rojo")
        val names = listOf("Adrian", "Norman")

        val result = printColorsAndNames(colors, names)

        val expected = listOf(
            "El color es azul.",
            "El color es rojo.",
            "El nombre es Adrian.",
            "El nombre es Norman."
        )

        assertEquals(expected, result)
    }
}