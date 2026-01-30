package OOP;

public class SuperClassinInheritance {
    public class Vehicle{
        //data menmber
        int speed = 120 ;
        //constructor
        public Vehicle(){
            System.out.println("Vehicle  Constructor");
        }
        public Vehicle(String name){
            System.out.println("Vihicle Name " + name);
        }
        //method
        public void display(){
            System.out.println("this Vehicle");
        }
    }
    public class Car extends Vehicle{
        public Car(){
            super("TOYOTA");
            System.out.println("This a Car");
        }
        //method
        public void show (){
            super.display();
            System.out.println("This a Car method . the speed of Car is "+ super.speed);
        }
    }


    public void main(String[] args){
        Vehicle obj = new Car();
        obj.display(); //output
        System.out.println("vehicle speed : " + obj.speed);
        System.out.println("===============================");
        Car c = new Car();
        c.show();

    }
}
