
package people;


public class Teacher extends Person {
    
    // Attributes
    private int salary;
    
    // Constructor
    public Teacher(String name, String address, int salary) {
        
        // Teacher inherits from the Person class, call super constructor:
        super(name, address);
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n   salary " + this.salary + " euros/month";
    }
}
