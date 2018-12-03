class MyLinkedList{

    Node head;

    // Nested Type Class
    class Node {

        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    void append(String data){

        Node last; // Last visited node

        if (head == null){
            head = new Node(data);
            return;
        }

        last = head;

        while(last.next != null)
            last = last.next;

        last.next = new Node(data);
    }

    void prepend(String data){

        Node node = new Node(data);
        node.next = head;
        head = node;

    }

    void getNodes(){

        Node last = head;

        if (head == null)
            return;

        while (last.next != null){
            System.out.println(last.data);
            last = last.next;
        }

        System.out.println(last.data);
    }

    void delete(String data){

        Node last;

        if (head == null)
            return;

        last = head;

        if (head.data.equals(data)){
            head = head.next;
            return;
        }

        while (last != null){
            if (last.next.data.equals(data)){
                last.next = last.next.next;
                return;
            }
            last = last.next;
        }
    }
}