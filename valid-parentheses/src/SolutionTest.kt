import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun `whenStringIs()`() {
        assertTrue(solution.isValid("()"))
    }

    @Test
    fun `whenStringIs((`() {
        assertFalse(solution.isValid("(("))
    }
}
