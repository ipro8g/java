public class Main{
  
    public static void main(String args[]){
        
        ll s = new ll(123);
        s.add("hahaha");
        
        s.print_list(s.head);
    }
}

class ll{

    Node head;

    public ll(Object o){
    
        head = new Node(o);
    }
    
    public void add(Object o){
        
        Node n = head.next;
        
        while(n != null){
        
            n = n.next;
        }
        
        if(n != null){
        
            n.next = new Node(o);
        }else{
        
            head.next = new Node(o);
        }
    }
    
    public static void print_list(Node head){
        
        Node n = new Node(head);
        System.out.println(n.data);
        
        while(n.next != null){
        
            n = n.next;
        
            System.out.println(n.data);
        }
    }
}

class Node{

    public Object data;
    public Node next = null;

    public Node(Object o){
    
        data = o;
    }

    public Node(Node n){
    
        this.data = n.data;
        this.next = n.next;
    }
}  
