package algoritms;

import util.ListNode;

/**
 * https://leetcode.com/problems/add-two-numbers/
 * 2. Add Two Numbers
 *
 *  * Definition for singly-linked list.
 *  * public class ListNode {
 *  *     int val;
 *  *     ListNode next;
 *  *     ListNode() {}
 *  *     ListNode(int val) { this.val = val; }
 *  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 *
 * Этот код добавляет два списка целых чисел, представленных в виде связного списка,
 *  и возвращает объединенный список. Алгоритм работает следующим образом:
 *
 * 1. Создается новый список, который будет содержать результат.
 * 2. В цикле `while` перебираются элементы обоих списков и добавляются к результату.
 *      Если текущий элемент списка равен `null`, то вместо него используется ноль.
 * 3. Если сумма элементов списка и переноса из предыдущего цикла превышает 10, то перенос увеличивается на единицу.
 * 4. После окончания цикла `while` возвращается первый элемент результата.
 *
 * Таким образом, этот код добавляет два списка целых чисел и возвращает объединенный список.
 *
 */
public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
            carry = sum / 10;
            p.next = new ListNode(sum % 10);
            p = p.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return dummyHead.next;
    }
}
