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
        return merged_list;
    }

  public static void main(String[] args) {

    ListNode first_list_test_1 = new ListNode();
    ListNode second_list_test_1 = new ListNode();

    ListNode results = mergeTwoSortedLists(first_list_test_1, second_list_test_1);

 }
}
