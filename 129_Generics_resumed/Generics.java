public class Generics{

    public static void main(String[] args){
    
        generic_class<Integer> item1 = new generic_class(20);
        System.out.println(item1.get_data());
        
        generic_class<String> item2 = new generic_class("Hello?");
        System.out.println(item2.get_data());
        
        //call the generic method
        generic_class2 item3 = new generic_class2();
        item3.generic_method(2.78);
        
        item3.generic_method((float)3.1416);
        
        item3.generic_method(true);
        
        item3.generic_method("WoW");
        
        
        
        
        //bounded types
        
        //this will drop an error cause String is not derived from Number
        
        //generic_class3<String> item4 = new generic_class3();
        //item4.info();
             
        generic_class3<Integer> item5 = new generic_class3();
        item5.info();
             
        class4b<class4> item6 = new class4b();
        item6.info();
        
        class4.inner_info();
        
        //additional the use of superclass Object very close to generics
        
        ArrayList<Object> arr = new ArrayList<Object>();
        
        arr.add(new Dog("fuffy"));
        arr.add(new Cat("tiggi"));
        
        for(Object animal: arr){
        
            if(animal instanceof Dog){
            
                Dog.class.cast(animal).noise();
            }else if(animal instanceof Cat){
            
                Cat.class.cast(animal).noise();
            }
        }
        
    }
}


class generic_class<T>{

    public T data;

    public generic_class(T data){
    
        this.data = data;
    }
    
    public T get_data(){
    
        return this.data;
    }
}

class generic_class2{

    public <T> void generic_method(T data){
    
        System.out.println("data passed trough generic method: " + data);
    }
}

class generic_class3<T extends Number>{

    public void info(){
    
        System.out.println("this is a bounded generic class");
    }
}

class class4b<T extends class4>{

    public void info(){
    
        System.out.println("this is a bounded generic class");
    }
}

abstract class class4{

    public static void inner_info(){
    
        System.out.println("im the class4 super class O_o");
    }

    public abstract void info(); 
}



class Dog{

    String name;

    Dog(String n){
    
        name = n;
    }

    public void noise(){
     
        System.out.println("woof woof");
    }
}

class Cat{

    String name;

    Cat(String n){
    
        name = n;
    }

    public void noise(){
     
        System.out.println("meow meow");
    }
}
