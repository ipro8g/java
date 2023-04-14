public class Main{

    public static void main(String[] args){
    
        Queue q = new Queue(10);
        
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        
        q.dequeue();
        
        q.enqueue(40);
        
        q.dequeue();
        
        q.enqueue(50);
        q.enqueue(60);
        q.enqueue(70);
        q.enqueue(80);
        
        
        q.dequeue();
    }
}

class Queue{

    public int capacity;
    public Object[] arr;
    public int front;
    public int rear;
    public int size;
    
    public Queue(int size){
    
        capacity = size;
        front = 0;
        rear = -1;
        arr = new Object[capacity];
    }
    
    public boolean isFull(){
    
        if(size == capacity){
        
            return true;
        }else{
        
            return false;
        }
    }
    
    public boolean isEmpty(){
    
        if(size == 0){
        
            return true;
        }else{
        
            return false;
        }
    }
    
    //this method add elements
    public void enqueue(Object data){
    
        if(isFull()){
        
            System.out.println("queue is full");
        }else{
        
            rear++;
            
            if(rear == capacity-1){
            
                rear = 0;
            }
            
            arr[rear] = data;
            size++;
            
            System.out.println("added: " + data);
        }
    }
    
    //remove elements from the queue front
    public void dequeue(){
    
        if(isEmpty()){
        
            System.out.println("empty");
        }else{
        
            front++;
            
            if(front == capacity-1){
            
                front = 0;
            }
            
            System.out.println(arr[front-1] + " removed");
            
            size--;
        }
    }
}
