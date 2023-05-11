package DSA;

import java.util.List;

public class J02_LinkedList_Deletion {
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
    static void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    static void deleteathead(){
//        Node X=head;
        head=head.next;
//        X=null;
    }
    static void deleteatposbyvalue(int val){
        if(head==null){
            return;
        }
        if(head.next==null){
            deleteathead();
        }
        Node temp=head;
        while(temp.next.data!=val){
            temp=temp.next;
        }
        Node del=temp.next;
        temp.next=temp.next.next;
        del=null;
    }

    static void deleteatposbypos(int pos){
        if(pos==1){
            deleteathead();
            return;
        }
        int cnt=1;
        Node temp=head;
        while(temp!=null && cnt!=pos-1){
            temp=temp.next;
            cnt++;
        }
        Node X=temp.next;
        temp.next=temp.next.next;
        X=null;
    }
    public static void main(String[] args) {
        insertattail(5);
        insertattail(45);
        insertattail(105);

        display();

        insertathead(3);
        insertathead(2);
        insertathead(21);
        insertathead(10);

        display();

        deleteathead();
        display();

        deleteathead();
        display();

        deleteatposbyvalue(3);
        display();

        deleteatposbypos(2);
        display();

        deleteatposbypos(1);
        display();

        deleteatposbypos(1);
        display();

    }
}
