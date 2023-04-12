public class Main{

    public static void main(String[] args){
    
        stack s = new stack(5);
        
        s.push(true);
        
        s.push(1234);
        
        s.push("hahah");
        
        System.out.println("before pop: " + s.size());
        
        System.out.println("popped element: " + s.pop());
        
        System.out.println("after pop: " + s.size());
        
        System.out.println("peek: " + s.peek());
        
        System.out.println("is empty: " + s.isEmpty());
        
        s.push(1234);
        
        s.push("hahah");
        
        s.push(12.45);
        
        System.out.println("is full: " + s.isFull());
        
        System.out.println("size: " + s.size());
    }
}

class stack{

    public Object[] arr;
    public int top;
    
    public stack(int size){
    
        arr = new Object[size];
        top = 0;
    }
    
    public boolean push(Object o){
    
        if(top < arr.length){
    
            arr[top] = o;
            top++;
            
            return true;
        }else{
        
            return false;
        }
    }
    
    public int size(){
    
        return top;
    }
    
    public Object pop(){
    
        Object el = arr[top - 1]; 
        top--;
        
        return el;
    }
    
    public Object peek(){
        
        return arr[top - 1];
    }
    
    public boolean isEmpty(){
        
        return (arr.length == 0) ? true: false;
    }
    
    public boolean isFull(){
        
        return (arr.length == top) ? true: false;
    }
}
