package OOP;

public class Polymorphism {
   public class Animal{
       public void getInfo(){
           System.out.println("This general information.........");
       }
       public void getInfo(String name){
           System.out.println("this is animal name : " + name);
       }
       public void getinfo(int leg){
           System.out.println("this is leg number : " + leg);
       }
   }
   public class Dog extends Animal{
       //override method
       @Override
       public void getInfo(){
           System.out.println("This the information from dog class.........");
       }
   }
   public class Fish extends Animal{
       public void getinfo(){
           System.out.println("this is the infromation from Fish class.........");
       }
   }








    public void main(String[] args){
        Animal animal = new Animal();
        animal.getInfo();
        animal.getInfo("Poopy");
        animal.getinfo(5);
        System.out.println("======================");
        Dog dog = new Dog();
        dog.getInfo();
    }
}
