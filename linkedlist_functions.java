public class linkedlist_functions {
    Node head;
   public class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next= null;
        }
    }

    //add element first
    public void addfirst(String data)
    {
        Node newnode =new Node(data);
        if(head==null){
            head=newnode;
            return;
        }

        newnode.next=head;
        head =newnode;
    }



    //insert last element
    public void addlast(String data){
        Node newnode= new Node(data);
        if(head==null){
            head= newnode;
            return;
        }

        Node currnode=head;
        while(currnode.next != null)
        {
            currnode= currnode.next;

        }
        currnode.next = newnode;

    }


    public  void print_list(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node currnode=head;
        while(currnode != null)
        {
            System.out.print(currnode.data +" -> ");
            currnode= currnode.next;

        }
        System.out.println("Null");

    }



// delete first element
    public void deletefirst()
    {
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        head=head.next;

    }

    //delete last element
    public void deletelast()
    {
        if(head == null){
            System.out.println("list is empty");
            return;
        }

        if(head.next==null)
        {
            head=null;
            return;
        }

        Node secondlast= head;
        Node lastnode=head.next;
        while (lastnode.next !=null)
        {
            lastnode=lastnode.next;
            secondlast=secondlast.next;
        }

        secondlast.next=null;

    }



    public static void main(String [] args)
    {
       linkedlist_functions list=new linkedlist_functions();
        list.addfirst("a");
        list.addfirst("is");
        list.addlast("list");
        list.addfirst("this");
        list.print_list();

        list.deletefirst();
        list.print_list();

        list.deletelast();
        list.print_list();

    }
}
