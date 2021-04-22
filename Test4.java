// This:- To pass an argument in the method
class Test4{
    void message(Test4 obj){
        System.out.println("Method is invoked");
    }
    void content(){
        message(this);
    }
    public static void main(String[] args) {
        Test4 obj = new Test4();
        obj.content();
    }
}