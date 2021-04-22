// Using this keyword to pass an argument in the constructor 
class A{
    Test5 obj;
    A(Test5 obj){ // parameterized constructor with object of B as a parameter
        this.obj = obj;
        // Calling display method of call Test4
        obj.display();
    }
}
class Test5{
    int a = 5;
    // default constructor that create a object of A with passing an argument in the constructor
    Test5(){
        A obj = new A(this);
        // method to show the value of x
    }
        void display(){
            System.out.println("Value of x in class Test5 is:- " + a);
        }
        public static void main(String[] args) {
            Test5 obj = new Test5();
        }
   
}