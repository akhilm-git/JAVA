class Pen{
    String color;
    String type;
    
    public void write(){
        System.out.println("Writing something");
    }
    
    public void print(){
        System.out.println(this.color);  //this keyword tells which object is calling the member function
        System.out.println(this.type);
    }
}

class Student{
    String name;
    int age;
    
    Student(){
        System.out.println("Constructor called");
    }
    
    Student(String name,int age){    //parametrized constructor
        this.name=name;
        this.age=age;
    }
    Student(Student s2){         //copy constructor
        this.name=s2.name;
        this.age=s2.age;
    }
    
    public void printname(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class OOPS{
    public static void main(String args[]){
        Pen p1=new Pen();   //new keyword allocates a new memory for object
        p1.color="blue";
        p1.type="gel";
        
        p1.write();
        p1.print();
        
        Pen p2=new Pen();
        p2.color="black";
        p2.type="ballpoint";
        
        p2.write();
        p2.print();
        
        // Student s1=new Student("aman",22);
        // s1.name="Amit";
        // s1.age=22;
        
        Student s1=new Student();
        s1.name="Rahul";
        s1.age=23;
        
        Student s2=new Student(s1);
        s2.printname();
        
        
    }
}