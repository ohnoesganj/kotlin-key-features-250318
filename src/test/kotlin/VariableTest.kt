import org.junit.jupiter.api.Test

class VariableTest {

    @Test
    fun CanNotBeReassigned() {
        val name = "Kotlin"
//        name = "Java"  // 변경 불가능 (불변성) -> 디버깅이 쉽고, 안전하다.


    }

    @Test
    fun CanBeReassigned() {
        var name = "Kotlin"
        name = "Java"    // 변경 가능 (가변성) -> 값 트랙킹이 어렵다.
    }
}