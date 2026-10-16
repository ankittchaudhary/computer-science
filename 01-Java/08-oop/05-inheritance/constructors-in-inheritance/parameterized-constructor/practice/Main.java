package practice;

class Rectangle{
    int length;
    int breadth;

    Rectangle(){
        length=breadth=1;
    }

    Rectangle(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }
}

class Cuboid extends Rectangle{
    int height;

    Cuboid(){
        height=1;
    }

    Cuboid(int h){
        height=h;
    }

    //calling parametrized constructor
    Cuboid(int l, int b, int h){
        super(l, b); //calls parent constructor with two parameters and assigns the values
        height=h;
    }

    int volume(){
        return length*breadth*height;
    }
}

public class Main {
    public static void main(String[] args) {
        //Cuboid c = new Cuboid(); //calls non parameterized so first parent which is rectangle making length and breadth 1 and the child non parameterized constructor set height =1
        //System.out.println(c.volume()); //1

        //if we pass argument
        //Cuboid c = new Cuboid(4); // means calling paramterized constructor of child class 
        // but as its child first non parameterized constructor of parent called then parametrized of child so l, b=1 and then h=4

        //System.out.println(c.volume()); //4

        //but we want to call parametrized constructor of parent class to set length and breadth first
        //we use super() in child

        Cuboid c = new Cuboid(5, 3, 10);
        System.out.println(c.volume());

    }
}
