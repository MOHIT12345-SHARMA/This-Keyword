// this keyeord is also used to invoke current class method
class Test_method{
    void message(){
        System.out.println("Hi guys what are you doing ");
    }
    void display(){
        System.out.println("Hello java are you O.K");
        this.message();
    }
}
class Test2{
    public static void main(String[] args) {
        Test_method obj = new Test_method();
        obj.display();
    }
}