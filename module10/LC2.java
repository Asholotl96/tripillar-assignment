// 2. Add Two Numbers
class LC2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode thead=new ListNode(0);
        ListNode tail=thead;
        int c=0;
        while(l1!=null || l2!=null || c!=0){
            int d1=(l1!=null)?l1.val:0;
            int d2=(l2!=null)?l2.val:0;
            int sum=d1+d2+c;
            int d=sum%10;
            c=sum/10;
            ListNode newn=new ListNode(d);
            tail.next=newn;
            tail=tail.next;
            l1=(l1!=null)?l1.next:null;
            l2=(l2!=null)?l2.next:null;
        }
        ListNode res=thead.next;
        thead.next=null;
        return res;
    }
}