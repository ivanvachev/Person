package Person;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    protected String getName() {
        return this.name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected int getAge() {
        return this.age;
    }

    protected void setAge(int age) throws IllegalArgumentException {
        if (age < 1) {
            throw new IllegalArgumentException("Age must be positive!");
        } else {
            this.age = age;
        }
    }

        @Override
                public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(String.format("Name: %s, Age: %d", this.getName(), this.getAge()));
            return sb.toString();
        }

}
