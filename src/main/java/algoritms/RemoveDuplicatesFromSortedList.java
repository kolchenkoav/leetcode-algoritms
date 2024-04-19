package algoritms;

import util.ListNode;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 * 83. Remove Duplicates from Sorted List
 *
 *  Этот код удаляет дубликаты из отсортированного списка. Алгоритм работает следующим образом:
 *
 * 1. Если список пуст или содержит только один элемент, то возвращается исходный список.
 * 2. В цикле `while` перебираются элементы списка.
 * 3. Если текущий элемент списка равен следующему элементу, то следующий элемент пропускается.
 * 4. Если текущий элемент не равен следующему элементу, то текущий элемент становится следующим элементом.
 * 5. После окончания цикла `while` следующий элемент становится `null`, что означает, что дубликаты были удалены.
 *
 * Таким образом, этот код удаляет дубликаты из отсортированного списка.
 *
 */
public class RemoveDuplicatesFromSortedList {

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        var currentNode = head;
        var nextNode = currentNode.next;

        while (nextNode != null) {
            if (currentNode.val == nextNode.val) {
                nextNode = nextNode.next;
                continue;
            }
            currentNode.next = nextNode;
            currentNode = nextNode;
            nextNode = nextNode.next;
        }

        currentNode.next = null;
        return head;
    }
}
