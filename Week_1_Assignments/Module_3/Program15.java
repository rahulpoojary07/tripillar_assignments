package Module_3;

class Test{
    void show(int a){
        System.out.println("Overloading int");
    }
    void show(double a){
        System.out.println("Overloading double");
    }
}
class Test2 extends Test{
    void show(int a){
        System.out.println("Overriding int");
    }
}
class Program15{
    public static void main(String[] args){
        Test t=new Test();
        t.show(5);
        t.show(5.5);
        Test2 t2=new Test2();
        t2.show(10);
    }
}