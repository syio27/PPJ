package z17.Problem1;

public class Person {
    private String name;
    private int age;

    public Person(String name) {
        this.name = name;
        this.age = 1990;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isFemale(){
        if(this.getName().endsWith("a")){
            return true;
        }
        else
            return false;
    }
    public static Person getOlder(Person p1, Person p2){
        if(p1.getAge() > p2.getAge()){
            return p1;
        }
        else
            return p2;
    }

    public boolean isYounger(Person person){
        if(this.getAge() < person.getAge()){
            return true;
        }
        else
            return false;
    }

    public static Person getOldest(Person[] persons){
        Person oldestPerson = persons[0];
        for(Person p : persons){
            if(oldestPerson.getAge() < p.getAge()){
                oldestPerson = p;
            }
        }
        return oldestPerson;
    }

    public static Person getYoungestFemale(Person[] persons){
        boolean womenInArr = false;
        Person youngestWoman = new Person("Anna", 100);
        for(Person p : persons){
            if(p.isFemale()) {
                womenInArr = true;
                if(youngestWoman.getAge() > p.getAge()){
                    youngestWoman = p;
                }
            }
        }

        if(!womenInArr){
            return null;
        }
        return youngestWoman;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Main{
    public static void main(String[] args) {
        Person person1 = new Person("All", 28);
        Person person2 = new Person("James", 30);
        Person[] persons = { new Person("Emma", 23),
                             new Person("Lola", 45),
                             new Person("Kenny", 53),
                             new Person("Twick", 18),
                             new Person("Stan", 20),
                             new Person("Naben", 10),
                             new Person("John", 30),
                             new Person("Mike", 25), };
        System.out.println(person1.isFemale());
        System.out.println(Person.getOlder(person1, person2));
        System.out.println(person1.isYounger(person2));
        System.out.println(Person.getOldest(persons));
        System.out.println(Person.getYoungestFemale(persons));
    }
}