import org.junit.jupiter.api.Test

class InterOperation {

    // 상호 운용성
    @Test
    fun withJava() {
        val student = Student("Kim", 20)
        student.hello()

        println(student.name)   // Kim
        println(student.age)    // 20
    }
}

