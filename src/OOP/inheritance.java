package OOP;

public class inheritance {
    //Parent class
    public class Animal {
        public void eat() {
            System.out.println("Eat from animal");
        }

        public void sleep() {
            System.out.println("Sleep from animal");
        }
    }

    public class Mamal {
        public void eat() {
            System.out.println("Eat from Mamal");
        }
    }

    public class Repitle extends Animal {
        public void crawl() {
            System.out.println("Repitle Crwal");
        }
    }

    public class brick extends Repitle {
        public void tasted() {
            System.out.println("Eat from brick");
        }
    }

    public void main(String[] args) {
        System.out.println("Hello World");
        //create Animal object
        Animal objAnimal = new Animal();
        objAnimal.eat();
        objAnimal.sleep();
        System.out.println("=======================");
        System.out.println("Repitile Chil of Animal");
        //create Repitile class
        Repitle objRepitle = new Repitle();
        objRepitle.eat(); //call parent method
        objRepitle.sleep(); //call parent method
        objRepitle.crawl();
        //create Mamal object
        System.out.println("===================");
        Mamal objMamal = new Mamal();
        objMamal.eat();

    }
}

