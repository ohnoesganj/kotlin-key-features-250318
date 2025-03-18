import org.junit.jupiter.api.Assertions.assertNull
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

// ? => nullable 한 변수와 not nullable 한 변수 구분 가능
// safeCall
// ?: => elvis operator
class NullSafetyTest {

    @Test
    fun nonNullableTypes() {
        val name: String = "Hello"
        assertNotNull(name)
    }

    @Test
    fun nullableTypes() {
        val name: String? = null
//        var name: String? = null
        assertNull(name)
    }

    @Test
    fun safeCall() {
        val nullableName: String? = null
        val length = nullableName?.length
        assertNull(length)

        val nonNullableName: String? = "hello"
        val lengthV2 = nonNullableName?.length
        assertEquals(5, lengthV2)
        assertNotNull(lengthV2)
    }

    @Test
    fun elvisOperator() {
        val nullableName: String? = null
        val defaultTest = nullableName?.length ?: 0
        assertEquals(0, defaultTest)

        val nonNullableName: String? = "Hello!!"
        val defaultTestV2 = nonNullableName?.length ?: 0
        assertEquals(7, defaultTestV2)
    }
}