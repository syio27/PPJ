package z15.Problem2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person[] persons = {new Person("Baglan", new Car("Porshe", 1000000)),
                            new Person("Eren", new Car("Mers", 120000)),
                            new Person("Elon", new Car("BMW", 400000)),
                            new Person("Set", new Car("Toyota", 20000)),
                            new Person("KEK", new Car("Porshe", 800000)),
                            new Person("Mika", new Car("Buggati", 2000000)),
                            new Person("Uki", new Car("Kia", 100000)),
                            new Person("ERE", new Car("Mers", 300000)),
                            new Person("SF", new Car("Kia", 120000)),};
        Car[] cars =  Person.getCars(persons);
        System.out.println("CARS: ");
        System.out.println(Arrays.asList(cars));
        Car[] expensiveCars = Person.expensiveCars(persons, 400000);
        System.out.println("EXPENSIVE CARS: ");
        System.out.println(Arrays.asList(expensiveCars));
    }
}
