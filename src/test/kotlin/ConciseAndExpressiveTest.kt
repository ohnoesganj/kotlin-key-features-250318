import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ConciseAndExpressiveTest {

    @Test
    fun functionTest() {
        val result = sum(1, 2)
        assertEquals(3, result)
    }

    private fun sum(num1: Int, num2: Int) = num1 + num2

    @Test
    fun stringTemplate() {
        val name = "Kotlin"
        val version = 2.0
        val result = "Language is ${name}, Version is ${version}"

        assertEquals("Language is Kotlin, Version is 2.0", result)
    }

    @Test
    fun greet() {
        greetWithDefault("Kim")   // Kim
        greetWithDefault()              // Lee
    }

    private fun greetWithDefault(name: String = "Lee") {
        println("Hello $name!")
    }
}

