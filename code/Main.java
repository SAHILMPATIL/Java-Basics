class Person{
    // Private variables (data hiding)
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age with validation
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }
}


public class Main{

    public static void main(String[] args) {
        Person person = new Person("John", 25);

        // Accessing private fields using getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Modifying private fields using setter methods
        person.setName("Alice");
        person.setAge(30);

        // Displaying updated values
        System.out.println("Updated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());

        // Trying to set an invalid age
        person.setAge(-5);  // This will trigger validation
        
    }
    
}