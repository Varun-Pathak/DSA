package concepts;

import java.util.HashSet;
import java.util.Objects;

public class EqualsOverride {

    public static void main(String[] args) {
        Person p1 = new Person(32, "Varun");
        Person p2 = new Person(32, "Varun");
        HashSet<Object> persons = new HashSet<>();
        persons.add(p1);
        System.out.println(persons.contains(p2));
    }

    public static class Person{
        private int age;
        private String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public boolean equals(Object object){
            if (object == this)
                return true;
            if (object == null || this.getClass() != object.getClass())
                return false;
            Person person = (Person) object;
            return this.age == person.age && Objects.equals(this.name, person.name);
        }

        @Override
        public int hashCode(){
            return Objects.hash(this.age, this.name);
        }
    }

}
