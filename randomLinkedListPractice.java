import javax.sound.sampled.Line;

class LinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void insertAfter(Node prev_node, int new_data){
        if (prev_node==null){
            System.out.println("previous node can't be null");
            return;
        }

        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;

    }

    public void append(int new_data){


        if (head==null){
            head = new Node(new_data);
            return;
        }
        Node new_node = new Node(new_data); //This can be written before the if statement as well, there will be no difference
        new_node.next = null;

        Node last = head;
        while (last.next!=null){
            last = last.next;
        }
        last.next = new_node;
        return;

    }

    public void printList(){
        Node temp = head;
        while (temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


    public static void main(String[]args){
        LinkedList llist = new LinkedList();
        llist.push(7);
        llist.append(8);
        llist.insertAfter(llist.head.next, 5);
        llist.append(67);
        llist.push(45);
        llist.insertAfter(llist.head, 55);
        llist.printList();
    }
}
