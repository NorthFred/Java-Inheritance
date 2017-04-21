
package people;

// The class Student inherits the Person class
// A student has a name and address and methods as the Person class.

public class Student extends Person {

    // Attributes
    private int credits;
    
    
    // Constructor
    public Student (String name, String address) {
        // call the constructor of the upper class Person.
        super(name, address);
        this.credits = 0;       // A new student does not have credits
    }
    
    // Accessors
    public int credits() {
        return this.credits;
    }
    
    // Methods
    public void study() {
        // When the student studies, his credits increase.
        this.credits += 1;
    }
    
    // Override the toString method from the upper class.
    @Override
    public String toString() {
        // Add the credits to the toString method from the super class.
        return super.toString() + "\n   credits " + this.credits;
    }
}
