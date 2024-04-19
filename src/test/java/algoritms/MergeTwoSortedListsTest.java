package algoritms;

import org.junit.jupiter.api.Test;
import util.ListNode;
import static org.assertj.core.api.Assertions.assertThat;

class MergeTwoSortedListsTest {

    @Test
    void mergeTwoLists1() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode l3 = new ListNode(1);
        l3.next = new ListNode(1);
        l3.next.next = new ListNode(2);
        l3.next.next.next = new ListNode(3);
        l3.next.next.next.next = new ListNode(4);
        l3.next.next.next.next.next = new ListNode(4);

        ListNode expected = l3;
        ListNode actual = MergeTwoSortedLists.mergeTwoLists(l1, l2);

        assertThat(expected.val).isEqualTo(actual.val);
        assertThat(expected.next.val).isEqualTo(actual.next.val);
        assertThat(expected.next.next.val).isEqualTo(actual.next.next.val);
        assertThat(expected.next.next.next.val).isEqualTo(actual.next.next.next.val);
        assertThat(expected.next.next.next.next.val).isEqualTo(actual.next.next.next.next.val);
        assertThat(expected.next.next.next.next.next.val).isEqualTo(actual.next.next.next.next.next.val);
    }

    @Test
    void mergeTwoLists2() {
        ListNode l1 = null;

        ListNode l2 = null;
        ListNode actual = MergeTwoSortedLists.mergeTwoLists(l1, l2);

        ListNode l3 = null;
        assertThat(actual).isEqualTo(l3);
    }

    @Test
    void mergeTwoLists3() {
        ListNode l1 = null;

        ListNode l2 = new ListNode(0);
        ListNode actual = MergeTwoSortedLists.mergeTwoLists(l1, l2);

        ListNode l3 = new ListNode(0);
        assertThat(actual.val).isEqualTo(l3.val);
    }
}