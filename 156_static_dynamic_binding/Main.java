public class Main { 

    public static void main(String[] args) { 
    
        // An example of static and dynamic binding in Java 
        Insurance current = new CarInsurance(); 
        
        // dynamic binding based upon object 
        int premium = current.premium(); 
        
        // static binding based upon class 
        String category = current.category(); 
        
        System.out.println("premium : " + premium); 
        System.out.println("category : " + category); 
    } 
} 

class Insurance{ 

    public static final int LOW = 100;
    
    public int premium(){ 
        
        return LOW; 
    } 
 
    public static String category(){ 
    
        return "Insurance"; 
    } 
} 
 
class CarInsurance extends Insurance{

  public static final int HIGH = 200; 
  
  public int premium(){ 
  
    return HIGH; 
  } 
  
  public static String category(){ 
  
    return "Car Insurance";
  } 
}

/*

binding is the linking between a method call and a method definition

Output:

premium: 100
category: Insurance

static binding occurs by example in a method overloading, because was defined in that way by the programmer

dynamic binding occurs by example in a method overriding, because only will happens at the runtime when a 
subclass is created taking the place of parents overrided method

Always remember that private, static, and final methods are bonded using static binding and virtual methods are bonded using dynamic binding. 

Similarly, method overloading is the best example of static binding, and method overriding is the example of dynamic binding.

You can see here that the call to premium() method executed the method from subclass while the call to category() method is executed from the superclass. This happens because premium() is a virtual method and resolved using late binding while category() is a static method and resolved using static binding at compile time using the class name.

*/


