public class RemoveLinkedListElements_203 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return null;
        ListNode pointer = head;
        while (pointer.next != null) {
            if (pointer.next.val == val)
                pointer.next = pointer.next.next;
            else
                pointer = pointer.next;
        }
        return head.val == val ? head.next : head;
    }
}
