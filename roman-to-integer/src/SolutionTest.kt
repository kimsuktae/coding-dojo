import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    val solution = Solution()

    @Test
    fun simpleTests() {
        assertEquals(1, solution.romanToInt("I"))
        assertEquals(5, solution.romanToInt("V"))
        assertEquals(10, solution.romanToInt("X"))
        assertEquals(50, solution.romanToInt("L"))
        assertEquals(100, solution.romanToInt("C"))
        assertEquals(500, solution.romanToInt("D"))
        assertEquals(1000, solution.romanToInt("M"))
    }

    @Test
    fun romansTests() {
        assertEquals(2, solution.romanToInt("II"))
        assertEquals(3, solution.romanToInt("III"))
        assertEquals(4, solution.romanToInt("IV"))
        assertEquals(9, solution.romanToInt("IX"))
        assertEquals(90, solution.romanToInt("XC"))
        assertEquals(1994, solution.romanToInt("MCMXCIV"))
    }
}
