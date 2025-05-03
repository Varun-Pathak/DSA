package concepts;

import java.util.Objects;

public class EqualsOverride {

    public static class Person{
        private int age;
        private int name;

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
