package Module_3;

class Shape{
    void draw(){
        System.out.println("Shape");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Circle");
    }
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("Rectangle");
    }
}
class Program14{
    public static void main(String[] args){
        Shape s1=new Circle();
        Shape s2=new Rectangle();
        s1.draw();
        s2.draw();
    }
}