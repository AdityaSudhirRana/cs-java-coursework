package practical.pkg1;

class HelloWorld {
    public HelloWorld(){
        System.out.println("Hello World!");
    }
    
    public HelloWorld(String name) {
        System.out.println("Constructor Overloaded");
        System.out.println("Hello World " + name);
        System.out.println("");
    }
}



public class Practical1A {
    public Practical1A(){
        System.out.println("Practical1 Constructor called");
    }
    
    
    
    static void Wow(){
        System.out.println("Wow!!");
    }
    
    static void Wow(String name){
        System.out.println("Method Overloaded!");
        System.out.println("Wow " + name);
    }



    
    public static void main(String[] args) {
        String name = "Aditya Rana";
        System.out.println("My name is " + name);
        System.out.println("");
        
        
        HelloWorld hi = new HelloWorld(name);
        Practical1A prac = new Practical1A();
        prac.Wow(name);
        
    }
}
