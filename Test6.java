// This keyword is used to return as a statement
class A1 {
    A1 getA1(){
        return this;
    }
    void message(){
        System.out.println("Hello Mohit");
    }
}
class Test6{
    public static void main(String[] args) {
        new A1().getA1().message();
     
    }
}