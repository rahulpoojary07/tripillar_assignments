package Module_2;

class Student{
    int id;
    String name;
    Student(){
        id=0;
        name="None";
    }
    Student(int i,String n){
        id=i;
        name=n;
    }
    void display(){
        System.out.println(id+" "+name);
    }
}
class Program11{
    public static void main(String[] args){
        Student s1=new Student();
        Student s2=new Student(1,"Ram");
        s1.display();
        s2.display();
    }
}