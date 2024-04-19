package algoritms;

import org.junit.jupiter.api.Test;
import util.ListNode;
import static org.assertj.core.api.Assertions.assertThat;

class AddTwoNumbersTest {
    @Test
    void addTwoNumbers1() {
        ListNode l1 = new ListNode(2);
        ListNode l12 = new ListNode(4);
        ListNode l13 = new ListNode(3);
        l1.next = l12;
        l12.next = l13;
        ListNode l2 = new ListNode(5);
        ListNode l22 = new ListNode(6);
        ListNode l23 = new ListNode(4);
        l2.next = l22;
        l22.next = l23;

        ListNode l1Result = new ListNode(7);
        ListNode l12r = new ListNode(0);
        ListNode l13r = new ListNode(8);
        l1Result.next = l12r;
        l12r.next = l13r;

        ListNode fact = AddTwoNumbers.addTwoNumbers(l1, l2);
        assertThat(fact.val).isEqualTo(l1Result.val);
        assertThat(fact.next.val).isEqualTo(l1Result.next.val);
        assertThat(fact.next.next.val).isEqualTo(l1Result.next.next.val);
    }

    @Test
    void addTwoNumbers2() {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        ListNode l1Result = new ListNode(0);

        ListNode fact = AddTwoNumbers.addTwoNumbers(l1, l2);
        assertThat(fact.val).isEqualTo(l1Result.val);
    }
}