import javax.sound.sampled.Line;

class LinkedList {
    Node head;
    class Node{   //Mandatory Node class
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
        if (prev_node==null){ //If the previous node, after which we are providing new_node, is null, the process will be terminated
            System.out.println("previous node can't be null");
            return;
        }
        
        //if everything is okay, we will proceed the process

        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;

    }

    public void append(int new_data){ //Inserting a node at the end


        if (head==null){
            head = new Node(new_data);   //If the list is empty, the new_node will be head and process will end
            return;
        }
        Node new_node = new Node(new_data); //This can be written before the if statement as well, there will be no difference
        new_node.next = null;

        Node last = head; //start finding last node assuming the head as the last node, if not then the next one will be checked
        while (last.next!=null){
            last = last.next;
        }
        last.next = new_node;
        return;     //this return is unnecessary, I used it for different purpose

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
