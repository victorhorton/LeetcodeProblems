import java.util.LinkedList;

class MergeTwoSortedLists {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode mergeTwoSortedLists(ListNode list1, ListNode list2) {
        ListNode merged_list = new ListNode();
        ListNode beginning_of_merged_list = merged_list;

        // Runs until list1 or list2 runs out of values
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                // Adds list1 value to merged list and moves to next ListNode value
                merged_list.next = new ListNode(list1.val);
                list1 = list1.next;
            } else if (list1.val > list2.val) {
                // Adds list2 value to merged list and moves to next ListNode value
                merged_list.next = new ListNode(list2.val);
                list2 = list2.next;
            }

            merged_list = merged_list.next;
        }

        // Adds remaining list1 values if longer than list2
        while (list1 != null) {
            merged_list.next = new ListNode(list1.val);
            list1 = list1.next;
            merged_list = merged_list.next;
        }

        // Adds remaining list2 values if longer than list1
        while (list2 != null) {
            merged_list.next = new ListNode(list2.val);
            list2 = list2.next;
            merged_list = merged_list.next;
        }

        // Returns the merge list starting at the beginning node
        return beginning_of_merged_list.next;
    }

  public static void main(String[] args) {

    ListNode first_list_test_1 = new ListNode(1, new ListNode(2, new ListNode(4)));
    ListNode second_list_test_1 = new ListNode(1, new ListNode(3, new ListNode(4)));

    ListNode results = mergeTwoSortedLists(first_list_test_1, second_list_test_1);

 }
}
