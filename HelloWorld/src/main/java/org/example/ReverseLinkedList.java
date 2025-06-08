package org.example;

public class ReverseLinkedList {

    // 定义链表节点类
    public static class ListNode {
        int val; // 节点值
        ListNode next; // 指向下一个节点的指针
        ListNode(int val) {
            this.val = val;
        }
    }

    // 反转链表的方法
    public ListNode reverseList(ListNode head) {
        ListNode prev = null; // 前一个节点，初始为null
        ListNode curr = head; // 当前节点，初始为链表头
        while (curr != null) { // 遍历链表
            ListNode nextTemp = curr.next; // 临时保存下一个节点
            curr.next = prev; // 当前节点的next指向前一个节点
            prev = curr; // 前一个节点更新为当前节点
            curr = nextTemp; // 当前节点更新为下一个节点
        }
        return prev; // 返回反转后的链表头
    }
}
