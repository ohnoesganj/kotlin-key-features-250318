import org.junit.jupiter.api.Test

class CollectionTest {

    // List
    @Test
    fun immutableList() {
        val list = listOf("Apple", "Banana", "Kiwi")

//        list[0] = "Mango"   // 컴파일 에러
    }

    @Test
    fun mutableTest() {
        var list = mutableListOf("Apple", "Banana", "Kiwi")

        list[0] = "Mango"     // 변경 가능

        println(list[0]) // Mango
        println(list[1]) // Banana
        println(list[2]) // Kiwi
    }


    // Set -> 중복 방지
    @Test
    fun immutableSet() {
        val set = setOf(1, 2, 3)

//        set.add(4)    // add 함수 지원 X
    }

    @Test
    fun mutableSet() {
        val set = mutableSetOf(1, 2, 3)

        set.add(4)      // 변경 가능

        println(set.contains(4))   // true
    }


    // Map
    @Test
    fun immutableMap() {
        val immutableMap = mapOf("Apple" to 1, "Banana" to 2)

//        immutableMap.remove("Apple")    // remove 함수 지원 X
    }

    @Test
    fun mutableMap() {
        val mutableMap = mutableMapOf("Apple" to 1, "Banana" to 2)

        mutableMap.remove("Apple")    // 변경 가능

        println(mutableMap.contains("Apple"))   // false
    }
}