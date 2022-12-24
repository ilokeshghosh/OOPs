import java.util.*;
import bank.Bank;
class Shape{
    String color;
    public void area(){
        System.out.print("Display Area : ");

    }


}

class Triangle extends Shape{ //single level inheritance
    public void area(float l, float h){
        System.out.println((float)1/2*(l*h));

    }
}

class Circle extends Shape{ //Hierarchial Inheritance
    public void area(float r){
        System.out.println((3.14)*r*r);
    }
}
class EquilateralTriangle extends Triangle{ //multilevel inheritance
    public void area(float l, float h){

    }

}

public class Inheritance{
    public static void main(String[] args){
        Triangle t1=new Triangle();
        t1.area(); //calling parent class's area method
        t1.area(8.9f,3f);


        Circle c1 = new Circle();
        c1.area();//calling parent class's area method
        c1.area(4f);
//        bank.Account account1=new bank.Account();
//        account1.name="customer1";



    }
}
