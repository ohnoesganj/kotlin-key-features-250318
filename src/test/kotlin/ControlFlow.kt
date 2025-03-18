import org.junit.jupiter.api.Test

class ControlFlow {

    // if
    @Test
    fun ifTest() {
        val result = max(2, 10)
        println(result)   // 10

        val result2 = max(13, 10)
        println(result2)  // 13
    }

    private fun max(a: Int, b: Int) =
        if (a > b) a else b


    // when (java switch)
    @Test
    fun whenTest() {
        val res01 = getNumberType(10)
        println(res01)

        val res02 = getNumberType(-10)
        println(res02)

        val res03 = getNumberType(0)
        println(res03)
    }

    private fun getNumberType(number: Int): String =
        when {
            number < 0 -> "negative"
            number > 0 -> "positive"
            number == 0 -> "zero"
            else -> "unknown"
        }


    // for
    @Test
    fun forTest() {
        val list = listOf(1, 2, 3, 4, 5)

        for (num in list) {
            println(num)
        }
    }


    // while
    @Test
    fun whileTest() {
        // 0~4 sum = 0 + 1 + 2 + 3 + 4 = 10

        var count = 0
        var sum = 0

        while (count < 5) {
            sum += count
            count++
        }

        println(sum)
    }
}