import java.util.PriorityQueue;
import java.util.Comparator;

public class Main{

    public static void main(String[] args){
    
        PriorityQueue<Object> q = new PriorityQueue<Object>();
        q.add(40);
        q.add(10);
        q.add(30);
        q.add(50);
        
        System.out.println("default asc: " + q.poll());
    
        DescComparator DescComp = new DescComparator();
    
        PriorityQueue<Employee> eq = new PriorityQueue<Employee>(10, DescComp);
        eq.add(new Employee(30, "name one"));
        eq.add(new Employee(10, "name two"));
        eq.add(new Employee(40, "name three"));
        eq.add(new Employee(15, "name four"));
        eq.add(new Employee(50, "name five"));
        eq.add(new Employee(20, "name six"));
        
        System.out.println("custom desc: " + eq.poll().salary);
    
        AscComparator AscComp = new AscComparator();
    
        PriorityQueue<Employee> eq2 = new PriorityQueue<Employee>(10, AscComp);
        eq2.add(new Employee(30, "name one"));
        eq2.add(new Employee(10, "name two"));
        eq2.add(new Employee(40, "name three"));
        eq2.add(new Employee(15, "name four"));
        eq2.add(new Employee(50, "name five"));
        eq2.add(new Employee(20, "name six"));
        
        System.out.println("custom asc: " + eq2.poll().salary);
        
        
    }
}

class Employee{

    public int salary;
    public String name;
    
    public Employee(int s, String n){
    
        salary = s;
        name = n;
    }
}

class AscComparator implements Comparator<Employee>{

    public int compare(Employee e1, Employee e2){
    
        return e1.salary - e2.salary;
    }
}

class DescComparator implements Comparator<Employee>{

    public int compare(Employee e1, Employee e2){
    
        return e2.salary - e1.salary;
    }
}
