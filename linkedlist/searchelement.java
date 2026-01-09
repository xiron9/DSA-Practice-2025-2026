import java.util.Scanner;


class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}

public class searchelement {
    public static boolean searchkey (Node head,int x){
  Node temp=head;
  while(temp!=null){
    if(temp.data==x){
        return true;
    }
    temp=temp.next;
  }
   return false; // if not
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        Node head=null,tail=null;

        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            Node newNode = new Node(val);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        int x=sc.nextInt();
        System.out.println(searchkey(head,x));
        sc.close();
    }
}
