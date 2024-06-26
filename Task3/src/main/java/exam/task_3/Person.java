package exam.task_3;

public class Person implements Comparable<Person>{

    private String name;
    private String surname;
    private int age;
    private String job;

    public Person(String name, String surname, int age, String job) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Peson{"+ this.name+ ", " + this.surname+ ", "+ this.age+" years"+ ", " + this.job+"}";
    }

    @Override
    public int compareTo(Person o) {
        return getName().compareTo(o.getName());
    }
}
