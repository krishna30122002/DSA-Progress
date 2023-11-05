import java.util.LinkedList;
import java.util.List;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public ListNode f(ListNode a) {
        ListNode pre=new ListNode();
        pre=a;
        ListNode cur=new ListNode();
        cur=a.next;



       while (cur!=null)
       {
        ListNode temp;
           temp=cur.next;
           cur.next=pre;
           pre=cur;
          cur=temp;
          
       }
       a.next=null;
        return pre;
}
}
public  class test2 {

    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);
        l1.next.next.next.next.next = new ListNode(6);
        l1.next.next.next.next.next.next=null;
        Solution t=new Solution();
        t.f(l1);
        while(l1!=null) {
            System.out.print(l1.val +" ");
            l1=l1.next;
        }

    }
}