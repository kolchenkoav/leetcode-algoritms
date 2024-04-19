package algoritms;

import util.ListNode;

/**
 * https://leetcode.com/problems/merge-two-sorted-lists
 * 21. Merge Two Sorted Lists
 *
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 *
 * Этот код объединяет два отсортированных списка в один отсортированный список. Алгоритм работает следующим образом:
 *
 * 1. Создается новый список `mergedList`, который будет содержать результат.
 * 2. В цикле `while` перебираются элементы обоих списков. Если текущий элемент списка `list1`
 *      меньше или равен текущему элементу списка `list2`, то он добавляется в `mergedList`.
 *      В противном случае, добавляется элемент из списка `list2`.
 * 3. После окончания цикла `while` возвращается первый элемент `mergedList`.
 *
 * Таким образом, этот код объединяет два отсортированных списка в один отсортированный список.
 */
public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergedList = new ListNode();
        ListNode current = mergedList;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if (list1 != null) {
            current.next = list1;
        } else if (list2 != null) {
            current.next = list2;
        }

        return mergedList.next;
    }
}
