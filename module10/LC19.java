// 19. Remove Nth Node From End of List
class LC19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int c=1;
        ListNode temp=head;
        if(temp.next==null) return null;
        while(temp.next!=null){
            temp=temp.next;
            c++;
        }
        if(c==n){
            head=head.next;
            return head;
        }
        n=c-n+1;
        c=0;
        ListNode prev=null;
        temp=head;
        
        while(temp!=null && c<n-1){
            prev=temp;
            temp=temp.next;
            c++;
        }
        prev.next=temp.next;
        return head;
    }
}