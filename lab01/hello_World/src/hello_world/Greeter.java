package hello_world;

/**
 A class for producing simple greetings.
 */

public class Greeter {
    /**
     Constructs a Greeter object that can greet some entity.
     @param aName the name of the addressee of the greeting
     */
    public Greeter(String aName)
    {name = aName;
    
    }
    
    /**
     Greet by saying "Hello"
     @return a message containing "Hello" and the name of the greeting's
     addressee
     */
    
    public String sayHello() 
    { return "Hello, " + name + "!";
        
    }
    
    private String name;

    public static void main(String[] args) {
        Greeter world = new Greeter("World");
        String greeting = world.sayHello();
        System.out.println(greeting);

    }
    
}
