//class is a user defined datatype which has its own data members and member functions
//object is an instance of a class
//Encapsulation means wrapping up of data members and member functions in a single unit(class)
//copy constructor initializes objects using another object

class Pen{                //class 1
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

class Student{       //class 2
    String name;
    int age;
    
    Student(){
        System.out.println("Constructor called");
    }
    
    Student(String name,int age){                    //parametrized constructor
        System.out.println("Parametrized constructor called");
        this.name=name;
        this.age=age;
    }
    Student(Student s2){                            //copy constructor
        System.out.println("Copy constructor called");
        this.name=s2.name;
        this.age=s2.age;
    }
    
    public void print(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class OOPS{
    public static void main(String args[]){
        Pen p1=new Pen();                 //new keyword allocates a new memory for object
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
        //s1.print();
        
        Student s1=new Student();
        s1.name="Rahul";
        s1.age=23;
        
        Student s2=new Student(s1);   //copy constructor called
        s2.print();
        
        
    }
}
