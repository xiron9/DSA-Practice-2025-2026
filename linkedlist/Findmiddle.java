 import java.util.Scanner;
 
 public class ListNode {
      int val;
     ListNode next;
    ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
//leetcode
class Findmiddle {
    public static ListNode middleNode(ListNode head) {
        
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static void printList(ListNode head) {
      while (head != null) {
          System.out.print(head.val + " ");
          head = head.next;
      }
  }
    public static void main(String[] args) {
    
      Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
      ListNode head=null,tail=null;

     for(int i=0;i<n;i++){
        int val=sc.nextInt();
        ListNode newNode=new ListNode(val);
        if(head==null){
          head=tail=newNode;
        }
        else{
          tail.next=newNode;
          tail=newNode;
        }
     }
     ListNode mid=middleNode(head);
     printList(mid);

     sc.close();

    }
}
