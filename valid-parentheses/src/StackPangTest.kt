import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class StackPangTest {

    @Test
    fun addSingleOpen() {
        val stack = StackPang()

        stack.add('(')

        assertFalse(stack.isEmpty())
    }

    @Test
    fun addOpenAndClose() {
        val stack = StackPang()

        stack.add('(')
        stack.add(')')

        assertTrue(stack.isEmpty())
    }

    @Test
    fun addDifferentTypeOfOpenAndClose() {
        val stack = StackPang()

        stack.add('(')
        stack.add(']')

        assertFalse(stack.isEmpty())
    }

    @Test
    fun addMultiOpenAndCloseParenthesesInCorrectOrder() {
        val stack = StackPang()

        stack.add('(')
        stack.add(')')
        stack.add('[')
        stack.add(']')
        stack.add('{')
        stack.add('}')

        assertTrue(stack.isEmpty())
    }
}
