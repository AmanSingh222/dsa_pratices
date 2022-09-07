import java.util.*;
public class linked_demo {
    Node head;
    public static class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }

    }

// insert element in first
    public void addfirst(String data){
        Node newnode= new Node(data);
        if(head==null)
        {
            head= newnode;
            return;
        }

        newnode.next=head;
        head=newnode;
    }


// insert last element
    public void addlast(String data)
    {
        Node newnode= new Node(data);
        if(head== null)
        {
            head=newnode;
            return;

        }

        Node currnode=head;
        while(currnode.next != null)
        {
            currnode=currnode.next;
        }
        currnode.next=newnode;
    }


    public void reverselist()
    {
        if(head==null || head.next==null)
        {
            return;
        }
        Node startnode= head;
        Node currnode=head.next;
        while(currnode != null)
        {
            Node lastnode=currnode.next;
            currnode.next=startnode;
            //update
            startnode=currnode;
            currnode=lastnode;

        }
        head.next=null;
        head=startnode;


    }


    public Node recursivelist(Node head)
    {
        if(head==null || head.next== null)
        {
            return head;
        }
        Node newhead=recursivelist(head.next);
        head.next.next=head;
        head.next=null;
        return newhead;


    }



    public void printlist()
    {
        if(head== null)
        {
            System.out.println("list is empty");
            return;
        }
        Node currnode = head;
        while(currnode != null)
        {
            System.out.print(currnode.data+" ->");
            currnode=currnode.next;
        }
        System.out.println("null");
    }
    public static void main(String [] args)
    {
        linked_demo list=new linked_demo();
//        list.addfirst("4");
//        list.addfirst("5");
//        list.addlast("1");
        list.printlist();
        list.reverselist();
        list.printlist();
        list.addfirst("2");
        list.addfirst("1");
        list.addlast("3");
        list.printlist();
        list.head=list.recursivelist(list.head);
        list.printlist();




    }
}
