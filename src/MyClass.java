/**
 * Polymorphism
 *      -Ability of an object to take many forms
 *      - ex. Parent class reference used to refer to a child class object
 *      - ex. (runtime) @Override for a method from parent class
 *      - ex. (compile time) Method overloading
 *
 *  Interface: Only Abstract classes
 *  Abstract Class: Can have none or more abstract methods and concrete methods but
 *      cannot be instantiated
 * */

public class MyClass extends MyAbstractClass implements MyInterface {

    int d,f;

    // Constructor
    MyClass(int a, int d, int f){
        super(a);
        this.d = d;
        this.f = f;
    }

    // Method Overloading
    public void Method() { }
    public void Method(String s){ }
    public void Method(String s, int n){ }

    // Override top parent Object's default toString method
    @Override
    public String toString(){
        return "";
    }

}
