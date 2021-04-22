// this keyword is also used to invoke current class constructor
class Test3{
    int a;
    int b;
    // default constructor
    Test3(){
        this(10,39);
        System.out.println("This is a default constructor");
    }
    // parameterized constructor
    Test3(int a , int b){
        this.a = a;
        this.b = b;
        System.out.println("This is a parameterized constructor");
    }
    public static void main(String[] args) {
        Test3 obj = new Test3();
    }
}
