import java.util.*;

/**
 * Created by xiaoma on 17/5/25.
 * leetcode 算法demo
 */
public class Solution {
    public static void main(String[] args) {

        //输出Hello，World！
        System.out.println("Hello, World111111!");

        int[] array = {2, 9, 7, 11};
        int target = 9;
        Solution solution = new Solution();
        int[] a = solution.twoSum(array, target);
        System.out.println(a);

        ListNode node = new ListNode();
        ListNode node1 = new ListNode();
        ListNode node2 = new ListNode();
        node1 = (13);
        node2 = (34);
        node = solution.addTwoNumbers(node1,node2);
        System.out.println(node);
    }

    /**
     * 1
     * 从数组中找出两个数，使其和为特定值target: nums = {2, 9, 7, 11}, target = 9
     */
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];   //complement = 7, 0, 2

            if (map.containsKey(nums[i]) && map.get(nums[i]) != i) {
                result[0] = map.get(nums[i]);//0
                result[1] = i;//2
                break;
            }

            map.put(complement, i); //(7, 0),(0, 0)
        }



        return result;//(0, 2)
    }

    /**
     * 2
     * 用链表表示两个数之和
     * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)   Output: 7 -> 0 -> 8
     * 对齐相加，不足位补0。迭代终止条件是两个ListNode都为null。

     迭代方法操作链表的时候要记得手动更新链表的指针到next
     迭代方法操作链表时可以使用一个dummy的头指针简化操作
     不可以在其中一个链表结束后直接将另一个链表串接至结果中，因为可能产生连锁进位
     */

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        if(l1 == null && l2 == null){
            return dummyHead;
        }
        int sum = 0, carry = 0;
        ListNode curr = dummyHead;
        while(l1!=null || l2!=null){
            int num1 = l1 == null? 0 : l1.val;
            int num2 = l2 == null? 0 : l2.val;
            sum = num1 + num2 + carry;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            carry = sum / 10;
            l1 = l1 == null? null : l1.next;
            l2 = l2 == null? null : l2.next;
        }
        if(carry!=0){
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}