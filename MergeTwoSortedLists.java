import java.util.LinkedList;

class MergeTwoSortedLists {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        while (list1 != null && list2 != null) {

            if (list1.val <= list2.val) {

                // Sets the remaining of list1 to be the greater of the two arguments
                list1.next = mergeTwoLists(list1.next, list2);

                // Returns list1 with the new remainging values
                return list1;
            }  else {

                // Sets the remaining of list2 to be the greater of the two arguments
                list2.next = mergeTwoLists(list1, list2.next);

                // Returns list2 with the new remainging values
                return list2;
            }
        }

        // Returns the remaining values once either list is empty
        if (list2 == null) {
            return list1;
        } else {
            return list2;
        }

    }

  public static void main(String[] args) {

    ListNode first_list_test_1 = new ListNode(1, new ListNode(2, new ListNode(4)));
    ListNode second_list_test_1 = new ListNode(1, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(10)))));

    ListNode results = mergeTwoLists(first_list_test_1, second_list_test_1);

    System.out.print("112344510 = ");
    while (results != null) {
        System.out.print(results.val);
        results = results.next;
    }

/*
    Runtime order

    |-results = mergeTwoLists([1,2,4], [1,3,4,5,10]);
    | |-list1.next = mergeTwoLists([2,4], [1,3,4,5,10]);
    | | |-list2.next = mergeTwoLists([2,4], [3,4,5,10]);
    | | | |-list1.next = mergeTwoLists([4], [3,4,5,10]);
    | | | | |-list2.next = mergeTwoLists([4], [4,5,10]);
    | | | | | |-list1.next = mergeTwoLists([null], [4,5,10]);
    | | | | | |
    | | | | | |
    | | | | | |-return list2 = [4, 5, 10]
    | | | | |-return list1 = [4, 4, 5, 10]
    | | | |-return list2 = [3, 4, 4, 5, 10]
    | | |-return list2 = [2, 3, 4, 4, 5, 10]
    | |-return list2 = [1, 2, 3, 4, 4, 5, 10]
    |-return list2 = [1, 1, 2, 3, 4, 4, 5, 10]

*/

 }
}
