public class MyClass extends MyAbstractClass implements MyInterface {
    // Method Overloading
    public void Method() { }
    public void Method(String s){ }
    public void Method(String s, int n){ }

    // Override parent Object's default toString method
    @Override
    public String toString(){
        return "";
    }

}
