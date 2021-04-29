package z15.Problem1;

import java.util.Arrays;

public class Person {
    private String name;
    private int age;

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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int compareTo(Person person){
        if(this.getAge() < person.getAge()){
            return -1;
        }
        else if(this.getAge() == person.getAge()){
            return 0;
        }
        else
            return 1;
    }

    public static void sort(Person[] persons){
        for(int i=0; i<persons.length-1; i++){
            int min_index = i;
            for(int j=i+1; j<persons.length; j++){
                if(persons[j].compareTo(persons[min_index]) == -1){
                    min_index = j;
                }
            }
            Person temp = persons[min_index];
            persons[min_index] = persons[i];
            persons[i] = temp;
        }
    }
}

class Main{
    public static void main(String[] args) {
        Person[] persons = {new Person("Baka", 18),
                            new Person("Kek", 20),
                            new Person("Kawaii", 17),
                            new Person("MemnayaPapka", 23),
                            new Person("Mika", 42),
                            new Person("ZXC", 28),
                            new Person("Uki", 12)};
        Person.sort(persons);
        System.out.println(Arrays.asList(persons));
    }
}
