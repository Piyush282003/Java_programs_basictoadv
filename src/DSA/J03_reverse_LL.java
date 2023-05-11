package DSA;

public class J03_reverse_LL {
    static Node head =null;

    static void insertattail(int val){
        Node n=new Node(val);
        Node temp=head;

        if(head==null){
            head=n;
            return;
        }
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=n;
        return;
    }
    static void insertathead(int val){
        Node n = new Node(val);
        n.next=head;
        head=n;
    }
    static boolean search(int key){
        Node temp=head;
        while(temp!=null){
            if(temp.data==key){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    static Node reverseLL(){
        Node prevptr=null;
        Node currptr=head;
        Node nextptr;
        while(currptr!=null){
            nextptr=currptr.next;
            currptr.next=prevptr;

            prevptr=currptr;
            currptr=nextptr;
        }
        return prevptr;
    }
    public static void main(String[] args) {
        insertattail(5);
        insertattail(45);
        insertattail(105);

        display(head);

        insertathead(3);
        insertathead(2);

        display(head);


        boolean b=search(45);
        if(b){
            System.out.println("The key is found in the Linked List");
        }else{
            System.out.println("Not found");
        }

        Node revLL=reverseLL();
        display(revLL);
    }
}
