import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun whenNodeListsAreNull() {
        val result = solution.mergeTwoLists(null, null)

        assertNull(result)
    }

    @Test
    fun whenOneListsIsNull() {
        val result = solution.mergeTwoLists(null, ListNode(`val` = 0))

        assertEquals(ListNode(0), result)
    }

    @Test
    fun whenNodeListsAreNotNull() {
        val firstNode = ListNode(1)
        val secondNode = ListNode(2)
        val thirdNode = ListNode(4)

        secondNode.next = thirdNode
        firstNode.next = secondNode

        val fourthNode = ListNode(1)
        val fifthNode = ListNode(3)
        val sixthNode = ListNode(4)

        fifthNode.next = sixthNode
        fourthNode.next = fifthNode

        val result = solution.mergeTwoLists(firstNode, fourthNode)

        var node1 = ListNode(1)
        val node2 = ListNode(1)
        val node3 = ListNode(2)
        val node4 = ListNode(3)
        val node5 = ListNode(4)
        val node6 = ListNode(4)

        node5.next = node6
        node4.next = node5
        node3.next = node4
        node2.next = node3
        node1.next = node1

        println(node1)
        assertEquals(node1, result)
    }
}
