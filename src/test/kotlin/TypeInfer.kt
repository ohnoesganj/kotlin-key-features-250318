import org.junit.jupiter.api.Test

class TypeInfer {

    // 명백히 타입이 결정되어있으면
    // 타입추론해서 타입을 명시하지 않아도 된다
    @Test
    fun infer() {
        val name: String = "Kotlin"
        val age = 30
        val pi = 3.14
        val isRaining = true
    }
}