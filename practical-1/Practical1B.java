package practical.pkg1;

class Wow {
    static void Hello(String name){
        System.out.println("Wow " + name);
    }
}

class Greet extends Wow {
    static void Hello(String name){
        System.out.println("Inheritance and method overriding!");
        System.out.println("Hello " + name);
    }
}

public class Practical1B {
    public Practical1B(){
        System.out.println("Practical1 Constructor called");
    }

    
    public static void main(String[] args) {
        String name = "Aditya Rana";
        System.out.println("My name is " + name);
        System.out.println("");
        
        Greet aditya = new Greet();
        aditya.Hello(name);
    }
}
