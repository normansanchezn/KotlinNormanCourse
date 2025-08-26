import dev.normansanchez.mediumExamples
import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test


class MediumExamplesTest {

    @Test
    fun `cuando se generan precios y libros se deben retornar las listas con formato correcto`() {
        val (pricesList, booksList) = mediumExamples<Pair<Int, Double>, Pair<String, Int>>()

        val expectedPrices = listOf(
            Pair(4, 4.56),
            Pair(7, 10.99)
        )
        assertEquals(expectedPrices, pricesList)

        val expectedBooks = listOf(
            Pair("Harry Potter", 84),
            Pair("El Principito", 21)
        )
        assertEquals(expectedBooks, booksList)
    }
}
