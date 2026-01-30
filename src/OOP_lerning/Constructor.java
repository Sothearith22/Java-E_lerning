package OOP_lerning;

public class Constructor {


    public static class Car {
        int YearCar;
        String ModelCar;
    //constructor no paramether
        public Car() {
            YearCar = 1;
            ModelCar = "BMW";
        }
        //constructor have parameter
        public Car(int year, String model) {
            YearCar = year;
            ModelCar = model;
        }
    }

    public static void main(String[] args) {
        Car carObj = new Car();

        System.out.println("Year : " + carObj.YearCar);
        System.out.println("Model : " + carObj.ModelCar);

        System.out.println("============================");

        Car carObj2 = new Car(10,"Luxes");

        System.out.println("Year : " + carObj2.YearCar);
        System.out.println("Model : " + carObj2.ModelCar);
    }
}