import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    val solution = Solution()

    @Test
    fun whenThereIsEmptyString() {
        assertEquals("", solution.longestCommonPrefix(arrayOf("", "a")))
    }

    @Test
    fun whenThereIsOneString() {
        assertEquals("dddddddddd", solution.longestCommonPrefix(arrayOf("dddddddddd")))
    }

    @Test
    fun whenCatAndCorn() {
        assertEquals("c" ,solution.longestCommonPrefix(arrayOf("cat", "corn")))
    }

    @Test
    fun notSimpleTest() {
        assertEquals("fl", solution.longestCommonPrefix(arrayOf("flower", "flow", "flight")))
        assertEquals("", solution.longestCommonPrefix(arrayOf("dog", "reacecar", "car")))
        assertEquals("a", solution.longestCommonPrefix(arrayOf("ab", "a")))
    }
}
