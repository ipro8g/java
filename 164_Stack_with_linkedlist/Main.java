public class Main{
  
    public static void main(String args[]){
    
        Stack s = new Stack();
        s.push(123);
        s.push(321);
        s.push("ajaaa");
        s.push(true);
        s.push(3.1416);
        
        s.print(s.head);
        
        System.out.println(s.peek());
        
        System.out.println(s.pop());
        
        System.out.println(s.peek());
    }
}

class Stack{

    public Node head;

    public Stack(){
    
        head = null;
    }
    
    public void push(Object value){
    
        Node extraHead = head;
        head = new Node();
        head.value  = value;
        head.next = extraHead;
    }
    
    public Object pop(){
    
        if(head == null){
        
            return null;
        }
        
        Object value = head.value;
        head = head.next;
        return value;
    }
    
    public Object peek(){
    
        if(head == null){
        
            return null;
        }
        
        Object value = head.value;
        return value;
    }
    
    public void print(Node head){
    
        Node temp = head;
        
        while(temp != null){
        
            System.out.println(temp.value);
            temp = temp.next;
        }
        
    }
}

class Node{

    public Object value;
    public Node next;
}  
