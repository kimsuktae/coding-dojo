class Solution {

    //() => true
    //()[]{} => true
    //(] => false
    //([)]
    fun isValid(string: String): Boolean {
        val stack = StackPang()

        string.forEach { word -> stack.add(word) }

        return stack.isEmpty()
    }
}

class StackPang(
    private val stacks: MutableList<Char> = mutableListOf()
) {

    fun add(word: Char) {
        if (stacks.isEmpty()) {
            stacks.add(word)

            return
        }

        val lastParentheses = stacks.last()

        stacks.add(word)

        if (isCloseParentheses(word)) {
            if (isSameTypeAndOpen(lastParentheses, word)) {
                stacks.removeLast()
                stacks.removeLast()
            }
        }
    }

    private fun isSameTypeAndOpen(lastParentheses: Char, word: Char): Boolean {
        if (isCloseParentheses(lastParentheses)) {
            return false
        }

        return when (word) {
            ')' -> lastParentheses == '('
            ']' -> lastParentheses == '['
            '}' -> lastParentheses == '{'
            else -> false
        }
    }

    private fun isCloseParentheses(word: Char): Boolean {
        return when (word) {
            ')' -> true
            '}' -> true
            ']' -> true
            else -> false
        }
    }

    fun isEmpty(): Boolean {
        return stacks.isEmpty()
    }
}
