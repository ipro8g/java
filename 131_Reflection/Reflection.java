import java.lang.Class;
import java.lang.reflect.*;

public class Reflection{

    public static void main(String[] args){
    
        String[] modifiers_name = {"public","protected","private"}; 
    
        try{
    
        //three ways to create the built in Class object
        Class a = Class.forName("Dog");
        
        Dog dog1 = new Dog("chihuahua", "midget");
        Class b = dog1.getClass();
        
        Class c = Dog.class;
        
        //class name
        String class_name = c.getName();
        
        //modifiers
        int modifiers = c.getModifiers();
        String modifier_name = modifiers_name[modifiers];
        
        //super class
        Class super_class = c.getSuperclass();
        String super_class_name = super_class.getName();
        
        System.out.println("object from class: " + class_name
                           + "\nmodifiers: " + modifiers 
                           + "\nsuper class: " + super_class_name);
                           
                           
        //declared methods   
        Animal rat = new Animal();
        Class r = rat.getClass();
                        
        Method[] meth = r.getDeclaredMethods();
        
        for(Method m: meth){
        
            System.out.println("\n\nmethod name: " + m.getName()
                               + "\nmodifiers: " + modifiers_name[m.getModifiers()]
                               + "\nreturn type: " + m.getReturnType());
        }
        
        
        
        
        //Field object
        Dog doggie = new Dog("doverman", "rocky");
        Class d = doggie.getClass();
              
              
              
              
        //access and set the type field
        Field field1 = d.getField("type");
        field1.set(doggie, "labrador");     
          
        String type_value = (String)field1.get(doggie);  
        System.out.println("type value: " + type_value);
        
        System.out.println("modifiers: " + modifiers_name[field1.getModifiers()]);
        
        
        
        //get and set private members
        Field field2 = doggie.getClass().getDeclaredField("name");
        field2.setAccessible(true);
        field2.set(doggie, "pinky winky");
        
        System.out.println("dog name: " + (String)field2.get(doggie) 
                            + " being: " + modifiers_name[field2.getModifiers()]);
                            
                            
        
        System.out.println("");                    
                            
        //get all Dog constructors
        Constructor[] constructs = doggie.getClass().getDeclaredConstructors();
        
        for(Constructor cn: constructs){
        
        // get the name of constructors
        System.out.println("Constructor Name: " + cn.getName());

        // get the access modifier of constructors
        // convert it into string form
        System.out.println("Modifier: " + modifiers_name[cn.getModifiers()]);

        // get the number of parameters in constructors
        System.out.println("Parameters: " + cn.getParameterCount());
        System.out.println("");
        }
        
        }catch(Exception e){
        
            e.printStackTrace();
        }
    }
}

class Animal{

    public void eat(){
    
        System.out.println("im eating");
    }
    
    private void sleep(){
    
        System.out.println("Zzz... Zzzz..");
    }
}

class Dog extends Animal{

    public String type;
    public int age;
    
    private String name;
    
    public Dog(int a, String n, String t){
    
        this.name = n;
        this.age = a;
        this.type = t;
    }
    
    public Dog(String t, String n){
    
        this.name = n;
        this.type = t;
    }

    public void bark(){
    
        System.out.println("woof woof");
    }
}
