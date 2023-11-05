class linkedList{
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
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
    }
}