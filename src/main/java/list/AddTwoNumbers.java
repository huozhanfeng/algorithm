package list;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return null;
        }
        int flag = 0;
        ListNode result = new ListNode(-1);
        ListNode head = result;
        while(l1 != null && l2 != null) {
            int sum = l1.val + l2.val + flag;
            flag = sum/10;
            result.next = new ListNode(sum%10);
            result = result.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            if (flag == 0) {
                result.next = l1;
                break;
            }
            int sum = l1.val + flag;
            flag = sum/10;
            result.next = new ListNode(sum%10);
            result = result.next;
            l1 = l1.next;
        }

        while (l2 != null) {
            if (flag == 0) {
                result.next = l2;
                break;
            }
            int sum = l2.val + flag;
            flag = sum/10;
            result.next = new ListNode(sum%10);
            result = result.next;
            l2 = l2.next;
        }
        if (flag!= 0) {
            result.next = new ListNode(flag);
            result = result.next;
        }
        return head.next;
    }
    public static void main(String[] args) {

    }
}
