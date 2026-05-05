package academy.devdojo.maratonajava.Javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.Javacore.Aintroducaoclasses.dominio.Car;

public class CarTest1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();


        car1.nameCar = "Skyline R34 do Brian";
        car1.modelCar = "Nissan";
        car1.yearCar = 1999;

        car2.nameCar = "Dodge Charger do Toretto";
        car2.modelCar = "Dodge";
        car2.yearCar = 1999;

        System.out.println(car1.nameCar);
        System.out.println(car1.modelCar);
        System.out.println(car1.yearCar);

        System.out.println(car2.nameCar);
        System.out.println(car2.modelCar);
        System.out.println(car2.yearCar);
    }
}
