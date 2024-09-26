package linkedList;

import org.w3c.dom.Node;

public class LL {
    Node head;
    private int size;

    LL() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }

        @Override
        public String toString() {
            return data;
        }
    }

//---------------------------------------------------------------------

    //addFirst Method
    public void addFirst(String data) {
        Node newNode = new Node(data);
        //Corner Case
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    @Override
    public String toString() {
        return ""+ head;
    }

//------------------------------------------------------------------------------

       //addLast Method
    public void addLast(String data) {
        Node newNode = new Node(data);
        //Corner Case
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null)
        {
            currNode=currNode.next;
        }
        currNode.next=newNode;

    }

//------------------------------------------------------------------------------

    //Print list Method
    public void printList()
    {
        // Corner Case
        if(head==null)
        {
            System.out.println("Our List is Empty");
            return;
        }
        Node currNode= head;
        while(currNode!=null)
        {
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("null");
    }

//-----------------------------------------------------------------

    //Remove First Method
    public void removeFirst()
    {
        //Corner Case
        if(head==null)
        {
            System.out.println("Our List is Empty");
            return;
        }
        size--;
        head=head.next;
    }

//-----------------------------------------------------------------

    public void removeLast()
    {
        //Corner Case
      if(head==null)
      {
          System.out.println("Our List is Empty");
          return;
      }
       size--;
      //Corner Case
       if(head.next==null)
      {
          head=null;
          return;
      }
      Node secondLast=head;
      Node lastNode=head.next;
      while(lastNode.next!=null)
      {
          lastNode=lastNode.next;
          secondLast=secondLast.next;
      }
      secondLast.next=null;
    }

//-----------------------------------------------------------------------

    //Find the Size of List
    public int getSize()
    {
        return size;
    }

//-------------------------------------------------------------

    //Main Method
    public static void main(String[] args) {
        LL list = new LL();
        list.addLast(" my -> friend ");
       list.addFirst(" is ");
       list.addFirst("Rahul ");
       list.printList();
        System.out.println("Size of List is : "+list.getSize());
    }
}
