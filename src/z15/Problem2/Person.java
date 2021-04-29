package z15.Problem2;

public class Person {
    private String name;
    private Car car;

    public Person(String name) {
        this.name = name;
        this.car = null;
    }

    public Person(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public Car getCar() {
        return car;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", car=" + car +
                '}';
    }

    public static Car[] getCars(Person[] persons){
        Car[] cars = new Car[persons.length];
        for(int i=0; i<persons.length; i++){
            cars[i] = persons[i].getCar();
        }
        return cars;
    }

    public static Car[] expensiveCars(Person[] persons, int minPrice){
        Car[] cars = new Car[persons.length];
        for(int i=0; i<persons.length; i++){
            if(persons[i].getCar().getPrice() >= minPrice){
                cars[i] = persons[i].getCar();
            }
            else
                cars[i] = null;
        }
        return cars;
    }
}
