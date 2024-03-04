class Solution {

    //list1 = [1, 2, 4], list2 = [1, 3, 4] => [1, 1, 2, 3, 4, 4]
    //list1 = [], list2= [] => []
    //list2 = [], list2 = [0] => [0]

    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        val dummy = ListNode(0)
        var tail = dummy

        var left = list1
        var right = list2

        while (left != null && right != null) {
            if (left.`val` < right.`val`) {
                tail.next = left
                left = left.next
                tail = tail.next!!

                continue
            }

            tail.next = right
            right = right.next
            tail = tail.next!!
        }

        tail.next = left ?: right

        return dummy.next
    }
}

data class ListNode(var `val`: Int) {
    var next: ListNode? = null
}
