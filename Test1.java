// This keyword is used to refer the current class insatance variable
class Test1{
    int a;
    int b;

Test1(int a , int b){ // parameterized constructor
    this.a = a;
    this.b = b;
} 
void display(){
    System.out.println("a = "  + a + " b = "  + b );
} // display the value of variable of a and b
public static void main(String[] args) {
    Test1  obj = new Test1(10,30);
    obj.display();

}
}