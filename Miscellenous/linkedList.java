class linkedList{
    Node head;
    private int size;

linkedList(){
    this.size=0;
}

    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

    public void addListFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    
    public void addListLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }

    public void deleteFirst(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        size--;
        head=head.next;

    }

    public void deleteLast(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            secondLast=secondLast.next;
            lastNode=lastNode.next;
        }
        secondLast.next=null;
    }

    public int getSize(){
        return size;
    }

    public void reverseIterate(){
        if(head==null){
            return;
        }
        if(head.next==null){
            return;
        }
        Node prevNode=head;
        Node currNode=head.next;
        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;

            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }

    public void printList(){
        if(head==null){
            System.out.println("List is Empty");
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+" => ");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        linkedList list=new linkedList();
        list.addListFirst("a");
        list.addListFirst("is");
        list.printList();

        list.addListFirst("This");
        list.printList();

        list.addListLast("Linked List");
        list.printList();

        // list.deleteFirst();
        // list.printList();
        
        // list.deleteLast();
        // list.printList();

        // System.out.println(list.getSize());
        
        // list.addListFirst("This");
        
        // System.out.println(list.getSize());

        list.reverseIterate();
        list.printList();

    }
}

// By Collections framework

// import java.util.*;
// class linkedList{
//     public static void main(String[] args) {
//         LinkedList<String> list=new LinkedList<>();

//         list.addFirst("is");
//         list.addLast("a");
//         list.addFirst("This");
//         list.addLast("List");

//         System.out.println(list);

//         System.out.println(list.size());

//         for(int i=0;i<list.size();i++){
//             System.out.print(list.get(i)+" => ");
//         }
//         System.out.println(" Null");

//         System.out.println(list.removeFirst());
//         System.out.println(list);
        
//         System.out.println(list.removeLast());
//         System.out.println(list);
        
//         System.out.println(list.remove(1));
//         System.out.println(list);
//     }
// }